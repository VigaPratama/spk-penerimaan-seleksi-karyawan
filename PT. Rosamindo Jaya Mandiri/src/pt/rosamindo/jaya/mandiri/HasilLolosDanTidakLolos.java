/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pt.rosamindo.jaya.mandiri;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class HasilLolosDanTidakLolos extends javax.swing.JInternalFrame {
    DefaultTableModel tabeltidaklolos;
    DefaultTableModel tabellolos;
    koneksi conn= new koneksi();
    public HasilLolosDanTidakLolos() {
        initComponents();
        tabellolos();
        tabeltidaklolos();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel_Lolos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabel_Tidak_Lolos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tidak Lolos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 210, 30));

        Tabel_Lolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabel_Lolos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_LolosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabel_Lolos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1250, 160));

        Tabel_Tidak_Lolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabel_Tidak_Lolos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_Tidak_LolosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabel_Tidak_Lolos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 1250, 160));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Hasil Perhitungan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Lolos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 210, 30));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 100, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public void tabellolos(){
        try {
            tabellolos = new DefaultTableModel();
            tabellolos.addColumn("ID");
            tabellolos.addColumn("Nama");
            tabellolos.addColumn("Hasil Perhitungan");
            
            Tabel_Lolos.setModel(tabellolos);
            ResultSet res = conn.ambilData("SELECT * FROM data_hasil_perhitungan where Hasil_Perhitungan >= 0.6");
             while (res.next()){
                         tabellolos.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3)}); 
                     }
             Tabel_Lolos.setModel(tabellolos);
        } catch (SQLException ex) {
            Logger.getLogger(HasilLolosDanTidakLolos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tabeltidaklolos(){
        try {
            tabeltidaklolos = new DefaultTableModel();
            tabeltidaklolos.addColumn("ID");
            tabeltidaklolos.addColumn("Nama");
            tabeltidaklolos.addColumn("Hasil Perhitungan");
            
            Tabel_Tidak_Lolos.setModel(tabeltidaklolos);
            ResultSet res = conn.ambilData("SELECT * FROM data_hasil_perhitungan where Hasil_Perhitungan <= 0.6");
             while (res.next()){
                         tabeltidaklolos.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3)}); 
                     }
             Tabel_Tidak_Lolos.setModel(tabeltidaklolos);
        } catch (SQLException ex) {
            Logger.getLogger(HasilLolosDanTidakLolos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void Tabel_LolosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_LolosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabel_LolosMouseClicked

    private void Tabel_Tidak_LolosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_Tidak_LolosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabel_Tidak_LolosMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        HasilPerhitungan back = new HasilPerhitungan();
        back.setVisible(true);
        this.getDesktopPane().add(back);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_Lolos;
    private javax.swing.JTable Tabel_Tidak_Lolos;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void EXIT_ON_CLOSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
