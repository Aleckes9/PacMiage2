/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

/**
 *
 * @author Alexandre
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;


public class DragDropTest extends javax.swing.JFrame {


    public DragDropTest() {
        initComponents();
        initDragAndDrop();
    }

    private void initDragAndDrop() {
        this.setDropTarget(new DropTarget(){
            @Override
            public synchronized void drop(DropTargetDropEvent dtde) {
                try {
                    Transferable transfer = dtde.getTransferable();
                    if(transfer.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                        dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
                        List objects = (List)transfer.getTransferData(DataFlavor.javaFileListFlavor);
                        for(Object object : objects) {
                            if(object instanceof File) {
                                File source = (File)object;
                                File dest = new File(System.getProperty("user.home")+File.separator+source.getName());
                                Files.copy(Paths.get(source.getAbsolutePath()), Paths.get(dest.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
                                System.out.println("File copied from "+source.getAbsolutePath()+" to "+dest.getAbsolutePath());
                            }
                        }
                    } else if(transfer.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                        dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
                        String type = (String)transfer.getTransferData(DataFlavor.stringFlavor);
                        System.err.println("Data flavor not supported: "+type);
                    } else {
                        System.err.println("Data flavor not supported.");
                    }
                } catch(UnsupportedFlavorException ex) {
                    System.err.println(ex.getMessage());
                } catch(IOException ex) {
                    System.err.println(ex.getMessage());
                } catch(Exception ex) {
                    System.err.println(ex.getMessage());
                } finally {
                    dtde.dropComplete(true);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")                      
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drag & Drop");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        pack();
    }                       

    public static void main(String args[]) {
        new DragDropTest().setVisible(true);
    }

}
