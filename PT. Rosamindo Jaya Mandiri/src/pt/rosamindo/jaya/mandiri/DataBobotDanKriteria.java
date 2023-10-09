/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pt.rosamindo.jaya.mandiri;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class DataBobotDanKriteria extends javax.swing.JInternalFrame {
     DefaultTableModel jTable_Display_Users2;
    koneksi conn= new koneksi();
    public DataBobotDanKriteria() {
        initComponents();
        tabelBobot();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtwawancara = new javax.swing.JTextField();
        txttestkepribadian = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtipk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttestbidang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtpengalamanbekerja = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Users = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Data Bobot Kriteria");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 270, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Wawancara (C1)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));

        txtwawancara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txtwawancara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwawancaraActionPerformed(evt);
            }
        });
        txtwawancara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtwawancaraKeyTyped(evt);
            }
        });
        jPanel1.add(txtwawancara, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 260, 30));

        txttestkepribadian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttestkepribadian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txttestkepribadian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttestkepribadianActionPerformed(evt);
            }
        });
        txttestkepribadian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttestkepribadianKeyTyped(evt);
            }
        });
        jPanel1.add(txttestkepribadian, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 260, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Test Kepribadian (C2)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 180, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("IPK (C3)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

        txtipk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txtipk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtipkActionPerformed(evt);
            }
        });
        txtipk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtipkKeyTyped(evt);
            }
        });
        jPanel1.add(txtipk, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 260, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Test Bidang (C4)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 180, 30));

        txttestbidang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttestbidang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txttestbidang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttestbidangActionPerformed(evt);
            }
        });
        txttestbidang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttestbidangKeyTyped(evt);
            }
        });
        jPanel1.add(txttestbidang, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 260, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Pengalaman Bekerja (C5)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 200, 30));

        txtpengalamanbekerja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpengalamanbekerja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txtpengalamanbekerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpengalamanbekerjaActionPerformed(evt);
            }
        });
        txtpengalamanbekerja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpengalamanbekerjaKeyTyped(evt);
            }
        });
        jPanel1.add(txtpengalamanbekerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 260, 30));

        bsave.setBackground(new java.awt.Color(0, 0, 204));
        bsave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bsave.setForeground(new java.awt.Color(255, 255, 255));
        bsave.setText("SAVE");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        jPanel1.add(bsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 120, 30));

        bdelete.setBackground(new java.awt.Color(255, 0, 0));
        bdelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bdelete.setForeground(new java.awt.Color(255, 255, 255));
        bdelete.setText("DELETE");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 120, 30));

        jTable_Display_Users.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_Display_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Users);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 780, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1718, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtwawancaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwawancaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwawancaraActionPerformed

    private void txttestkepribadianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttestkepribadianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttestkepribadianActionPerformed

    private void txtipkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtipkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtipkActionPerformed

    private void txttestbidangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttestbidangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttestbidangActionPerformed

    private void txtpengalamanbekerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpengalamanbekerjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpengalamanbekerjaActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        try{
            cekKosong();
        } catch (exceptionData ex){
            JOptionPane.showMessageDialog(null, ex.showMessageError());
        }
        simpan();
        tabelBobot();
    }//GEN-LAST:event_bsaveActionPerformed
 private void cekKosong() throws exceptionData
    {
       if(txtwawancara.getText().isEmpty() == true || txttestkepribadian.getText().isEmpty() == true
                || txtipk.getText().isEmpty() == true || txttestbidang.getText().isEmpty() == true || txtpengalamanbekerja.getText().isEmpty() == true)
            throw new exceptionData();
    }
    
    public int simpan(){        
        String sql="insert into data_bobot "+
	"values"+
	"('"+txtwawancara.getText()+"', "+
	"'"+txttestkepribadian.getText()+"', "+
        "'"+txtipk.getText()+"', "+
        "'"+txttestbidang.getText()+"', "+
        "'"+txtpengalamanbekerja.getText()+"'"+
	")";    
        
        clear();
        conn.simpanData(sql);
       return 0;
    }
    
   
    
    public int hapus_data(){        
        String sql= "DELETE FROM data_bobot WHERE C1_Wawancara ='"+txtwawancara.getText()+"'";
        clear();
        conn.simpanData(sql);
       return 0;
    }
    
    private void clear(){
        txtwawancara.setText("");
        txttestkepribadian.setText("");
        txtipk.setText("");
        txttestbidang.setText("");
        txtpengalamanbekerja.setText("");
    }
    
    public void tabelBobot(){
       jTable_Display_Users2 = new DefaultTableModel();
       jTable_Display_Users2.addColumn("Wawancara (C1)");
       jTable_Display_Users2.addColumn("Test Kepribadian (C2)");
       jTable_Display_Users2.addColumn("IPK (C3)");
       jTable_Display_Users2.addColumn("Test Bidang (C4)");
       jTable_Display_Users2.addColumn("Pengalaman Bekerja (C5)");
       jTable_Display_Users.setModel(jTable_Display_Users2);
        try {
         ResultSet res = conn.ambilData("SELECT * FROM data_bobot");
        while (res.next()){
                    jTable_Display_Users2.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
                } 
      
        jTable_Display_Users.setModel(jTable_Display_Users2);
          } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, ex);
        }   
     }
    public void inputAngka(java.awt.event.KeyEvent evt){
        char cDigit = evt.getKeyChar();
        if(!Character.isDigit(cDigit)){
            evt.consume();
        }
    }
    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
        try{
            cekKosong();
        } catch (exceptionData ex){
            JOptionPane.showMessageDialog(null, ex.showMessageError());
        }
        hapus_data();
        tabelBobot();
    }//GEN-LAST:event_bdeleteActionPerformed
     
    private void jTable_Display_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_UsersMouseClicked
         DefaultTableModel model = (DefaultTableModel)jTable_Display_Users.getModel();
        int selectedRowIndex = jTable_Display_Users.getSelectedRow();
        txtwawancara.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txttestkepribadian.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtipk.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txttestbidang.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtpengalamanbekerja.setText(model.getValueAt(selectedRowIndex, 4).toString());

    }//GEN-LAST:event_jTable_Display_UsersMouseClicked

    private void txtwawancaraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwawancaraKeyTyped
        
    }//GEN-LAST:event_txtwawancaraKeyTyped

    private void txttestkepribadianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttestkepribadianKeyTyped
        
    }//GEN-LAST:event_txttestkepribadianKeyTyped

    private void txtipkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtipkKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtipkKeyTyped

    private void txttestbidangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttestbidangKeyTyped
        // TODO add your handling code here:    
    }//GEN-LAST:event_txttestbidangKeyTyped

    private void txtpengalamanbekerjaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpengalamanbekerjaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpengalamanbekerjaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Users;
    private javax.swing.JTextField txtipk;
    private javax.swing.JTextField txtpengalamanbekerja;
    private javax.swing.JTextField txttestbidang;
    private javax.swing.JTextField txttestkepribadian;
    private javax.swing.JTextField txtwawancara;
    // End of variables declaration//GEN-END:variables

    private void EXIT_ON_CLOSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
