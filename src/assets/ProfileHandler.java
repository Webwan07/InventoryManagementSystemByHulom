package assets;

import DbOperations.DbConnection;
import DbOperations.UserManagement;
import com.formdev.flatlaf.IntelliJTheme;
import customComponents.ImageAvatar;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public final class ProfileHandler extends javax.swing.JFrame {
    private final DbConnection DBC = new DbConnection();
    private final UserManagement UMT = new UserManagement(this);
    
    private File fromLabelImage;
    private final File oldImage;
    private Icon returnIcon;
    private final String oldImageName;
    private boolean changed = false;
    public ProfileHandler(Icon profileIcon, String userID, String oldImageName) {
        initComponents();
        
        Image appIcon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/new&changeImage.png"));
        this.setIconImage(appIcon);       
        
        setBackground(new Color(0,0,0,0));
        System.out.println(profileIcon);
        imageAvatar1.setIcon(profileIcon);
        imageAvatar2.setIcon(profileIcon);
        backLabelActions(backLabel, new String[]{"back2.png","back1.png","back3.png"});
        ImageManagement.setupFileDragAndDrop(panelRound3, new Color(224,231,255), imageAvatar2);
        
        this.oldImageName = oldImageName;
        this.oldImage = new File(profileIcon.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new customComponents.PanelRound();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelRound2 = new customComponents.PanelRound();
        imageAvatar1 = new customComponents.ImageAvatar();
        panelRound3 = new customComponents.PanelRound();
        imageAvatar2 = new customComponents.ImageAvatar();
        openCamlabel = new javax.swing.JLabel();
        changeLabel = new javax.swing.JLabel();
        changeLabel1 = new javax.swing.JLabel();
        ChangeBtn = new javax.swing.JButton();
        backLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelRound1.setBackground(new java.awt.Color(224, 231, 255));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        jTabbedPane1.setBackground(new java.awt.Color(224, 231, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        panelRound2.setBackground(new java.awt.Color(165, 180, 252));
        panelRound2.setRoundTopLeft(25);
        panelRound2.setRoundTopRight(25);

        imageAvatar1.setForeground(new java.awt.Color(67, 56, 202));
        imageAvatar1.setBorderSize(2);
        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nullProfile.jpg"))); // NOI18N
        imageAvatar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAvatar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View Profile", panelRound2);

        panelRound3.setBackground(new java.awt.Color(165, 180, 252));
        panelRound3.setRoundTopLeft(25);
        panelRound3.setRoundTopRight(25);

        imageAvatar2.setForeground(new java.awt.Color(67, 56, 202));
        imageAvatar2.setBorderSize(1);
        imageAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nullProfile.jpg"))); // NOI18N
        imageAvatar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAvatar2MouseClicked(evt);
            }
        });

        openCamlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openCamlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/camera.png"))); // NOI18N
        openCamlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openCamlabelMouseClicked(evt);
            }
        });
        imageAvatar2.add(openCamlabel);
        openCamlabel.setBounds(400, 140, 37, 33);

        changeLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        changeLabel.setForeground(new java.awt.Color(224, 231, 255));
        changeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        changeLabel.setText("Choose a image file");
        changeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeLabelMouseExited(evt);
            }
        });

        changeLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        changeLabel1.setForeground(new java.awt.Color(224, 231, 255));
        changeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        changeLabel1.setText("or drag it here.");

        ChangeBtn.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ChangeBtn.setText("Change");
        ChangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addComponent(changeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(ChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(ChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Change Profile", panelRound3);

        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back2.png"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jTabbedPane1)))
                .addGap(16, 16, 16))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
    
        this.dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private File getNewImage(File f1, File f2){
        return (f1 != null) ? f1 : f2;
    }

    
    private void ChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeBtnActionPerformed
        File fromDropFile = ImageManagement.getDroppedFile(); 
        File newImage = getNewImage(fromDropFile, fromLabelImage);
        if (newImage != null || fromDropFile != null) {
            File replacedFile = ImageManagement.replaceImageFile(oldImage, newImage);
            if (replacedFile != null && replacedFile.exists()) {
                ImageIcon newIcon = new ImageIcon(replacedFile.getAbsolutePath());
                imageAvatar1.setIcon(newIcon);
                returnIcon = imageAvatar1.getIcon();
                changed = true;
            }    
        } else {
            JOptionPane.showMessageDialog(this, "No new image uploaded.", "No Image", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ChangeBtnActionPerformed

    private void imageAvatar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseClicked
         ImageManagement.openImage(imageAvatar1.getIcon());
    }//GEN-LAST:event_imageAvatar1MouseClicked

    private void imageAvatar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar2MouseClicked
        ImageManagement.openImage(imageAvatar2.getIcon());
    }//GEN-LAST:event_imageAvatar2MouseClicked

    private void changeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLabelMouseClicked
        changeLabel.setForeground(Helper.colors[7]);
        try{
            this.fromLabelImage = ImageManagement.getImage(this);
        
            imageAvatar2.setIcon(new ImageIcon(fromLabelImage.toString()));

            imageAvatar2.repaint();
        }catch(NullPointerException e){
            
        }
    }//GEN-LAST:event_changeLabelMouseClicked

    private void changeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLabelMouseEntered
        changeLabel.setForeground(Helper.colors[5]);
    }//GEN-LAST:event_changeLabelMouseEntered

    private void changeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLabelMouseExited
        changeLabel.setForeground(Helper.colors[1]);
    }//GEN-LAST:event_changeLabelMouseExited

    private void openCamlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openCamlabelMouseClicked
        Camera cam_A = new Camera();
        cam_A.setVisible(true);

        new Thread(new Runnable() {
            @Override
            public void run() {
                cam_A.startCamera(); 
            }
        }).start();
    }//GEN-LAST:event_openCamlabelMouseClicked
    
    public Icon returnIcon() {
        return returnIcon;
    }
    public boolean changedState() {
        return changed;
    }
    public static void backLabelActions(JLabel label,String[] iconName){
        label.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                label.setIcon(new ImageIcon("src/icons/"+iconName[2]));
                label.repaint();
            }
            
            @Override
            public void mouseReleased(MouseEvent e){
                label.setIcon(new ImageIcon("src/icons/"+iconName[0]));
                label.repaint();                       
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setIcon(new ImageIcon("src/icons/"+iconName[1]));
                label.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setIcon(new ImageIcon("src/icons/"+iconName[0]));
                label.repaint();       
            }
        });
    }
    
//    public static void main(String args[]) {
//        IntelliJTheme.setup(ProfileHandler.class.getResourceAsStream("/theme_eclipse.theme.json"));
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ProfileHandler().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ChangeBtn;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel changeLabel;
    private javax.swing.JLabel changeLabel1;
    private customComponents.ImageAvatar imageAvatar1;
    private customComponents.ImageAvatar imageAvatar2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel openCamlabel;
    private customComponents.PanelRound panelRound1;
    private customComponents.PanelRound panelRound2;
    private customComponents.PanelRound panelRound3;
    // End of variables declaration//GEN-END:variables

}
