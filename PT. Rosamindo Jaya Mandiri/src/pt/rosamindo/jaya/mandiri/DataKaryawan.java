/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pt.rosamindo.jaya.mandiri;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class DataKaryawan extends javax.swing.JInternalFrame {
    DefaultTableModel jTable_Display_Users2;
    koneksi conn= new koneksi();
    public DataKaryawan() {
        initComponents();
        id_data();
        tabelKaryawan();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        bedit = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Users = new javax.swing.JTable();
        PRINT = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Data Karyawan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 170, 30));

        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 260, 30));

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 260, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Wawancara (C1)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

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
        jPanel1.add(txtwawancara, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 260, 30));

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
        jPanel1.add(txttestkepribadian, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 260, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Test Kepribadian (C2)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 180, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("IPK (C3)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 30));

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
        jPanel1.add(txtipk, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 260, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Test Bidang (C4)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 180, 30));

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
        jPanel1.add(txttestbidang, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 260, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Pengalaman Bekerja (C5)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 200, 30));

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
        jPanel1.add(txtpengalamanbekerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 260, 30));

        bsave.setBackground(new java.awt.Color(0, 0, 204));
        bsave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bsave.setForeground(new java.awt.Color(255, 255, 255));
        bsave.setText("SAVE");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        jPanel1.add(bsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 120, 30));

        bedit.setBackground(new java.awt.Color(255, 153, 0));
        bedit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bedit.setForeground(new java.awt.Color(255, 255, 255));
        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        jPanel1.add(bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 120, 30));

        bdelete.setBackground(new java.awt.Color(255, 0, 0));
        bdelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bdelete.setForeground(new java.awt.Color(255, 255, 255));
        bdelete.setText("DELETE");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 120, 30));

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

        PRINT.setBackground(new java.awt.Color(0, 0, 204));
        PRINT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PRINT.setForeground(new java.awt.Color(255, 255, 255));
        PRINT.setText("PRINT");
        PRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINTActionPerformed(evt);
            }
        });
        jPanel1.add(PRINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 400, 120, 30));

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

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

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
        try{
            cekKosong();
        } catch (exceptionData ex){
            JOptionPane.showMessageDialog(null, ex.showMessageError());
        }
        simpan();
        tabelKaryawan();
        id_data();
    }//GEN-LAST:event_bsaveActionPerformed

    private void cekKosong() throws exceptionData
    {
       if(txtid.getText().isEmpty()==true || txtnama.getText().isEmpty()==true
               || txtwawancara.getText().isEmpty() == true || txttestkepribadian.getText().isEmpty() == true
                || txtipk.getText().isEmpty() == true || txttestbidang.getText().isEmpty() == true || txtpengalamanbekerja.getText().isEmpty() == true)
            throw new exceptionData();
    }
    
    public int simpan(){        
        String sql="insert into data_karyawan "+
	"values"+
	"('"+txtid.getText()+"', "+
	"'"+txtnama.getText()+"', "+
	"'"+txtwawancara.getText()+"', "+
	"'"+txttestkepribadian.getText()+"', "+
        "'"+txtipk.getText()+"', "+
        "'"+txttestbidang.getText()+"', "+
        "'"+txtpengalamanbekerja.getText()+"'"+
	")";    
        
        clear();
        conn.simpanData(sql);
       return 0;
    }
    
    public int edit_data(){        
String sql= "update data_karyawan set Nama='"+txtnama.getText()+"', C1_Wawancara='"+txtwawancara.getText()+"', C2_Test_Kepribadian='"+txttestkepribadian.getText()+"', C3_IPK='"+txtipk.getText()+"', C4_Test_Bidang='"+txttestbidang.getText()+"', C5_Pengalaman_Bekerja='"+txtpengalamanbekerja.getText()+"' where ID = '"+txtid.getText()+"' ";     
clear();    
        conn.simpanData(sql);
       return 0;
    }
    
    public int hapus_data(){        
        String sql= "DELETE FROM data_karyawan WHERE ID ='"+txtid.getText()+"'";
        clear();
        conn.simpanData(sql);
       return 0;
    }
    
    private void id_data(){
        try{
        Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_spk_karyawan","root","");
        Statement stat = koneksi.createStatement();
        ResultSet rs = stat.executeQuery("select * from data_karyawan order by ID desc");
        if(rs.next()){
            String idd = rs.getString("ID").substring(1);
            String AN = "" + (Integer.parseInt(idd)+1);
            String Nol = "";
            
            if (AN.length()==1){Nol = "000";}
            else if (AN.length()==2){Nol = "00";}
            else if (AN.length()==3){Nol = "0";}
            else if (AN.length()==4){Nol = "";}
            
            txtid.setText("A" + Nol + AN);
        
        }else{
            txtid.setText("A0001");
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clear(){
        txtnama.setText((""));
        txtwawancara.setText("");
        txttestkepribadian.setText("");
        txtipk.setText("");
        txttestbidang.setText("");
        txtpengalamanbekerja.setText("");
    }
    
    public void tabelKaryawan(){
       jTable_Display_Users2 = new DefaultTableModel();
       jTable_Display_Users2.addColumn("ID");
       jTable_Display_Users2.addColumn("Nama Karyawan");
       jTable_Display_Users2.addColumn("Wawancara (C1)");
       jTable_Display_Users2.addColumn("Test Kepribadian (C2)");
       jTable_Display_Users2.addColumn("IPK (C3)");
       jTable_Display_Users2.addColumn("Test Bidang (C4)");
       jTable_Display_Users2.addColumn("Pengalaman Bekerja (C5)");
       jTable_Display_Users.setModel(jTable_Display_Users2);
        try {
         ResultSet res = conn.ambilData("SELECT * FROM data_karyawan ");
        while (res.next()){
                    jTable_Display_Users2.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
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
    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
       try{
            cekKosong();
        } catch (exceptionData ex){
            JOptionPane.showMessageDialog(null, ex.showMessageError());
        }
        edit_data();
        tabelKaryawan();
        id_data();
    }//GEN-LAST:event_beditActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
         try{
            cekKosong();
        } catch (exceptionData ex){
            
        }
        hapus_data();
        tabelKaryawan();
        id_data();
    }//GEN-LAST:event_bdeleteActionPerformed

    private void jTable_Display_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_UsersMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable_Display_Users.getModel();
        int selectedRowIndex = jTable_Display_Users.getSelectedRow();
        txtid.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtnama.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtwawancara.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txttestkepribadian.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtipk.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txttestbidang.setText(model.getValueAt(selectedRowIndex, 5).toString());
        txtpengalamanbekerja.setText(model.getValueAt(selectedRowIndex, 6).toString());
    }//GEN-LAST:event_jTable_Display_UsersMouseClicked

    private void txtwawancaraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwawancaraKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtwawancaraKeyTyped

    private void txttestkepribadianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttestkepribadianKeyTyped
        // TODO add your handling code here:
        
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

    private void PRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRINTActionPerformed
        // TODO add your handling code here:
         try {
              File namafile = new File("src/report/report_data_karyawan.jasper");
        JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksiprint.getConnection());
        JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_PRINTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PRINT;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Users;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtipk;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpengalamanbekerja;
    private javax.swing.JTextField txttestbidang;
    private javax.swing.JTextField txttestkepribadian;
    private javax.swing.JTextField txtwawancara;
    // End of variables declaration//GEN-END:variables

    private void EXIT_ON_CLOSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
