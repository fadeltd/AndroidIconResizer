/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidiconresizer;

import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.imgscalr.Scalr;

/**
 *
 * @author FadelTrivandi
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        openImageChooser.setFileFilter(imageFilter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openImageChooser = new javax.swing.JFileChooser();
        saveImageChooser = new javax.swing.JFileChooser();
        helpFrame = new javax.swing.JFrame();
        helpContentPane = new javax.swing.JScrollPane();
        helpContentText = new javax.swing.JTextArea();
        panelImage = new javax.swing.JPanel();
        labelImage = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuOpen = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuHelpContent = new javax.swing.JMenuItem();

        openImageChooser.setAcceptAllFileFilterUsed(false);
        openImageChooser.setApproveButtonText("Open");
        openImageChooser.setDialogTitle("Open Image");
        openImageChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openImageChooserActionPerformed(evt);
            }
        });

        saveImageChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        saveImageChooser.setApproveButtonText("Save");
        saveImageChooser.setDialogTitle("Save Image");
        saveImageChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImageChooserActionPerformed(evt);
            }
        });

        helpFrame.setTitle("Help Contents");

        helpContentPane.setBackground(new java.awt.Color(255, 255, 255));
        helpContentPane.setEnabled(false);

        helpContentText.setEditable(false);
        helpContentText.setColumns(20);
        helpContentText.setFont(new java.awt.Font("Futura Md BT", 0, 13)); // NOI18N
        helpContentText.setRows(5);
        helpContentText.setText("Resizing Image\n- Choose File > Open Image to open source image for Android Icon, or you can simply press ctrl+O\n- After you open the file, you can directly save the image to new location\n- To save the file you can choose File > Save, or use shortcut Ctrl+S, type the name of the folder you want to save, click save\n- After you save the file, explorer window will open, showing your icon directory\n- Congratulations, your icon ready, you can move the \"res\" folder to your Android Project\n\nExit Program\n- You can exit program by choosing File > Exit, use shortcut alt+F4, or use di close button with \"X\" icon on the coner upper right of the window");
        helpContentPane.setViewportView(helpContentText);

        javax.swing.GroupLayout helpFrameLayout = new javax.swing.GroupLayout(helpFrame.getContentPane());
        helpFrame.getContentPane().setLayout(helpFrameLayout);
        helpFrameLayout.setHorizontalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpContentPane, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        helpFrameLayout.setVerticalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpContentPane, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Android Icon Resizer v0.1 by @fadeltd");
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout panelImageLayout = new javax.swing.GroupLayout(panelImage);
        panelImage.setLayout(panelImageLayout);
        panelImageLayout.setHorizontalGroup(
            panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        panelImageLayout.setVerticalGroup(
            panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        menuFile.setText("File");

        menuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuOpen.setText("Open");
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuOpen);

        menuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSave.setText("Save");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        menuFile.add(menuSave);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        menuBar.add(menuFile);

        menuHelp.setText("Help");

        menuHelpContent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuHelpContent.setText("Help Content");
        menuHelpContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelpContentActionPerformed(evt);
            }
        });
        menuHelp.add(menuHelpContent);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveImageChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImageChooserActionPerformed

    }//GEN-LAST:event_saveImageChooserActionPerformed

    private void openImageChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openImageChooserActionPerformed

    }//GEN-LAST:event_openImageChooserActionPerformed

    String fileName;

    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenActionPerformed
        int retVal = openImageChooser.showOpenDialog(this);
        try {
            System.out.println(retVal + " " + JFileChooser.APPROVE_OPTION);
            if (retVal == JFileChooser.APPROVE_OPTION) {
                File file = openImageChooser.getSelectedFile();
                try {
                    fileName = file.getName();
                    img = ImageIO.read(file);
                    this.setSize(img.getWidth() + 40, img.getHeight() + 100);
                    panelImage.setSize(img.getWidth(), img.getHeight());
                    labelImage.setSize(img.getWidth(), img.getHeight());
                    labelImage.setIcon(new ImageIcon(img));
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_menuOpenActionPerformed

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        int retVal = saveImageChooser.showSaveDialog(this);
        try {
            System.out.println(retVal + " " + JFileChooser.APPROVE_OPTION);
            if (retVal == JFileChooser.APPROVE_OPTION) {
                File file = saveImageChooser.getSelectedFile();
                String path = file.getAbsolutePath();
                try {
                    new File(path + "/res").mkdirs();
                    new File(path + "/res/drawable-ldpi").mkdirs();
                    new File(path + "/res/drawable-hdpi").mkdirs();
                    new File(path + "/res/drawable-mdpi").mkdirs();
                    new File(path + "/res/drawable-xhdpi").mkdirs();
                    new File(path + "/res/drawable-xxhdpi").mkdirs();
                    new File(path + "/res/drawable-xxxhdpi").mkdirs();
                    new File(path + "/res/drawable").mkdirs();
                    File drawable_ldpi = new File(path + "/res/drawable-ldpi/" + fileName);
                    File drawable_hdpi = new File(path + "/res/drawable-hdpi/" + fileName);
                    File drawable_mdpi = new File(path + "/res/drawable-mdpi/" + fileName);
                    File drawable_xhdpi = new File(path + "/res/drawable-xhdpi/" + fileName);
                    File drawable_xxhdpi = new File(path + "/res/drawable-xxhdpi/" + fileName);
                    File drawable_xxxhdpi = new File(path + "/res/drawable-xxxhdpi/" + fileName);
                    File drawable = new File(path + "/res/drawable/" + fileName);
                    BufferedImage bufferImage_ldpi = Scalr.resize(img, 36);
                    BufferedImage bufferImage_mdpi = Scalr.resize(img, 48);
                    BufferedImage bufferImage_hdpi = Scalr.resize(img, 72);
                    BufferedImage bufferImage_xhdpi = Scalr.resize(img, 96);
                    BufferedImage bufferImage_xxhdpi = Scalr.resize(img, 144);
                    BufferedImage bufferImage_xxxhdpi = Scalr.resize(img, 192);
                    BufferedImage bufferImage_drawable = Scalr.resize(img, 512);
                    ImageIO.write(bufferImage_ldpi, "png", drawable_ldpi);
                    ImageIO.write(bufferImage_mdpi, "png", drawable_mdpi);
                    ImageIO.write(bufferImage_hdpi, "png", drawable_hdpi);
                    ImageIO.write(bufferImage_xhdpi, "png", drawable_xhdpi);
                    ImageIO.write(bufferImage_xxhdpi, "png", drawable_xxhdpi);
                    ImageIO.write(bufferImage_xxxhdpi, "png", drawable_xxxhdpi);
                    ImageIO.write(bufferImage_drawable, "png", drawable);
                    JOptionPane.showMessageDialog(panelImage, "Your Android Icon has been resized, please move to your Android Project\\app\\src\\main", "Save Completed", 1);
                    Desktop.getDesktop().open(new File(path));
                } catch (IllegalArgumentException | ImagingOpException | IOException e) {
                    System.out.println(e.getMessage()); // FORNOW: added just to be sure
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_menuSaveActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit the application?",
                "Exit Application", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuHelpContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelpContentActionPerformed
        helpFrame.setSize(950, 250);
        helpFrame.setVisible(true);
    }//GEN-LAST:event_menuHelpContentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane helpContentPane;
    private javax.swing.JTextArea helpContentText;
    private javax.swing.JFrame helpFrame;
    private javax.swing.JLabel labelImage;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuHelpContent;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JFileChooser openImageChooser;
    private javax.swing.JPanel panelImage;
    private javax.swing.JFileChooser saveImageChooser;
    // End of variables declaration//GEN-END:variables
    private BufferedImage img = null;
}
