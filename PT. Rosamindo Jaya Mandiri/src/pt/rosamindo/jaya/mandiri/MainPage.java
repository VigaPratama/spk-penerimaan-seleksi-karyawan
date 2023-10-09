/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pt.rosamindo.jaya.mandiri;
import java.awt.Color;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainPage extends javax.swing.JFrame {
    static String a,b,c;
    Color DefaultColor,ClickedColor,Defaultlabelcolor,Clickedlabelcolor;
    
    public MainPage() {
        initComponents();
        DefaultColor = new Color(51,51,51); 
        ClickedColor = new Color (255,255,255);
        Defaultlabelcolor = new Color(255,255,255);
        Clickedlabelcolor = new Color(0,0,0);
        mainpagebtn.setBackground(DefaultColor);
        data_bobot_kriteria.setBackground(DefaultColor);
        pendampingbtn.setBackground(DefaultColor); 
        Menu1.setBackground(DefaultColor);
        Menu2.setBackground(DefaultColor);
        logoutbtn.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);
         txtlogout.setForeground(Defaultlabelcolor);
        ActionListener ac1=new ActionListener(){
           @Override public void actionPerformed(ActionEvent e){  
           }
        }; new javax.swing.Timer(400, ac1).start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mainpagebtn = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Menu2 = new javax.swing.JPanel();
        label_menu_2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        data_bobot_kriteria = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pendampingbtn = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Menu1 = new javax.swing.JPanel();
        label_menu_1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JPanel();
        txtlogout = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                WindowOpen(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Pada PT. Rosamindo Jaya Mandiri");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 590, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Aplikasi Sistem Pendukung Keputusan");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 630, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Pada Penerimaan Seleksi Karyawan Dengan Metode SAW");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 1010, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgkapaltanker new2.jpg"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        jDesktopPane1.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1420, 570));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1420, 610));

        mainpagebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainpagebtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainpagebtnMousePressed(evt);
            }
        });
        mainpagebtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mainpagebtnKeyPressed(evt);
            }
        });
        mainpagebtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Dashboard");
        label1.setFocusable(false);
        mainpagebtn.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard.PNG"))); // NOI18N
        mainpagebtn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 50));

        jPanel5.add(mainpagebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        Menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu2MousePressed(evt);
            }
        });
        Menu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_menu_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_menu_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_menu_2.setText("  Data Karyawan");
        Menu2.add(label_menu_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 31));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo data karyawan 2.png"))); // NOI18N
        Menu2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 70, 50));

        jPanel5.add(Menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 90));

        data_bobot_kriteria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_bobot_kriteriaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                data_bobot_kriteriaMousePressed(evt);
            }
        });
        data_bobot_kriteria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Data Bobot Kriteria");
        data_bobot_kriteria.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Data Bobot.PNG"))); // NOI18N
        data_bobot_kriteria.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 60, 70));

        jPanel5.add(data_bobot_kriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 90));

        pendampingbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendampingbtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pendampingbtnMousePressed(evt);
            }
        });
        pendampingbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Hasil Perhitungan");
        pendampingbtn.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hasil Perhitungan.PNG"))); // NOI18N
        pendampingbtn.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, 50));

        jPanel5.add(pendampingbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 160, 90));

        Menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu1MousePressed(evt);
            }
        });
        Menu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_menu_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_menu_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_menu_1.setText("Tentang");
        Menu1.add(label_menu_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 59, 160, 31));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Warning.PNG"))); // NOI18N
        Menu1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 50));

        jPanel5.add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 160, 90));

        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutbtnMousePressed(evt);
            }
        });
        logoutbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtlogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtlogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtlogout.setText("Logout");
        logoutbtn.add(txtlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 59, 160, 31));

        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoutlogo.png"))); // NOI18N
        logoutbtn.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 50));

        jPanel5.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 160, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WindowOpen(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowOpen
     
    }//GEN-LAST:event_WindowOpen

    private void mainpagebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpagebtnMousePressed
        mainpagebtn.setBackground(ClickedColor);
         data_bobot_kriteria.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);
         Menu1.setBackground(DefaultColor);
         Menu2.setBackground(DefaultColor);
         label1.setForeground(Clickedlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);  
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_mainpagebtnMousePressed

    private void data_bobot_kriteriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_bobot_kriteriaMousePressed
        mainpagebtn.setBackground(DefaultColor);
         data_bobot_kriteria.setBackground(ClickedColor);
         pendampingbtn.setBackground(DefaultColor);
         Menu1.setBackground(DefaultColor);
         Menu2.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Clickedlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_data_bobot_kriteriaMousePressed

    private void pendampingbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendampingbtnMousePressed
        mainpagebtn.setBackground(DefaultColor);
         data_bobot_kriteria.setBackground(DefaultColor);
         pendampingbtn.setBackground(ClickedColor);
         Menu1.setBackground(DefaultColor);
         Menu2.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Clickedlabelcolor);
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_pendampingbtnMousePressed

    private void mainpagebtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mainpagebtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainpagebtnKeyPressed

    private void mainpagebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpagebtnMouseClicked
       Dashboard Menu = new Dashboard();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_mainpagebtnMouseClicked

    private void data_bobot_kriteriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_bobot_kriteriaMouseClicked
        DataBobotDanKriteria Menu = new DataBobotDanKriteria();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_data_bobot_kriteriaMouseClicked

    private void pendampingbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendampingbtnMouseClicked
        HasilPerhitungan Menu = new HasilPerhitungan();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_pendampingbtnMouseClicked

    private void Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseClicked
         MenuTentangAplikasi Menu = new MenuTentangAplikasi();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_Menu1MouseClicked

    private void Menu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MousePressed
        mainpagebtn.setBackground(DefaultColor);
         data_bobot_kriteria.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);        
         Menu1.setBackground(ClickedColor);
         Menu2.setBackground(DefaultColor);        
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);  
         label_menu_1.setForeground(Clickedlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);       
    }//GEN-LAST:event_Menu1MousePressed

    private void Menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseClicked
        DataKaryawan Menu = new DataKaryawan();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_Menu2MouseClicked

    private void Menu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MousePressed
         mainpagebtn.setBackground(DefaultColor);
         data_bobot_kriteria.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);
         Menu1.setBackground(DefaultColor);
         Menu2.setBackground(ClickedColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Clickedlabelcolor);
    }//GEN-LAST:event_Menu2MousePressed

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
        this.setVisible(false);
        new LoginForm(null,true).setVisible(true);
    }//GEN-LAST:event_logoutbtnMouseClicked

    private void logoutbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtnMousePressed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu1;
    private javax.swing.JPanel Menu2;
    private javax.swing.JPanel data_bobot_kriteria;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label_menu_1;
    private javax.swing.JLabel label_menu_2;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel logoutbtn;
    private javax.swing.JPanel mainpagebtn;
    private javax.swing.JPanel pendampingbtn;
    private javax.swing.JLabel txtlogout;
    // End of variables declaration//GEN-END:variables
}
