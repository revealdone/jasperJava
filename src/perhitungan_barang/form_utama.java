package perhitungan_barang;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.*;

import java.sql.*;
import java.text.Format;
import javax.swing.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class form_utama extends javax.swing.JFrame {

    /**
     * Creates new form from_utama
     */
    public form_utama() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bayar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nama_barang = new javax.swing.JComboBox<>();
        harga_barang = new javax.swing.JTextField();
        jumlah_beli = new javax.swing.JTextField();
        jumlah_harga = new javax.swing.JTextField();
        jumlah_bayar = new javax.swing.JTextField();
        jumlah_kembalian = new javax.swing.JTextField();
        batal = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        hitung_jumlah_barang = new javax.swing.JButton();
        bayar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tb_hapus = new javax.swing.JButton();
        tb_edit = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tb_cari = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        btn_view = new javax.swing.JButton();

        bayar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bayar1.setText("BAYAR");
        bayar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("APLIKASI KASIR TOKO PAK TONI");

        jLabel2.setText("NAMA BARANG");

        jLabel3.setText("HARGA BARANG");

        jLabel4.setText("JUMLAH BELI");

        jLabel5.setText("JUMLAH HARGA");

        jLabel6.setText("JUMLAH BAYAR");

        jLabel7.setText("JUMLAH KEMBALIAN");

        nama_barang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Barang", "Televisi", "Komputer", "Laptop", "Dispenser", "Kompor" }));
        nama_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_barangActionPerformed(evt);
            }
        });

        batal.setBackground(new java.awt.Color(255, 51, 51));
        batal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        batal.setText("BATAL");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(102, 102, 255));
        keluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        hitung_jumlah_barang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hitung_jumlah_barang.setText("HITUNG JUMLAH BARANG");
        hitung_jumlah_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung_jumlah_barangActionPerformed(evt);
            }
        });

        bayar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bayar.setText("BAYAR/SIMPAN");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), null));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "no", "namabarang", "qty"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tb_hapus.setBackground(new java.awt.Color(255, 51, 51));
        tb_hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_hapus.setText("HAPUS");
        tb_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_hapusActionPerformed(evt);
            }
        });

        tb_edit.setBackground(new java.awt.Color(204, 255, 255));
        tb_edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tb_edit.setText("EDIT");
        tb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_editActionPerformed(evt);
            }
        });

        jLabel8.setText("CARI");

        tb_cari.setBackground(new java.awt.Color(255, 255, 204));
        tb_cari.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_cari.setText("CARI");
        tb_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_cariActionPerformed(evt);
            }
        });

        jLabel9.setText("NO");

        btn_view.setBackground(new java.awt.Color(204, 255, 255));
        btn_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_view.setText("view");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cari)
                            .addComponent(nama_barang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(harga_barang)
                            .addComponent(jumlah_beli)
                            .addComponent(jumlah_harga)
                            .addComponent(jumlah_bayar)
                            .addComponent(jumlah_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(batal)
                            .addComponent(keluar)
                            .addComponent(hitung_jumlah_barang)
                            .addComponent(bayar)
                            .addComponent(tb_hapus)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tb_edit)
                                .addGap(27, 27, 27)
                                .addComponent(btn_view))
                            .addComponent(tb_cari))))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(batal)
                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(keluar)
                        .addGap(18, 18, 18)
                        .addComponent(hitung_jumlah_barang)
                        .addGap(18, 18, 18)
                        .addComponent(bayar)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tb_edit)
                            .addComponent(btn_view))
                        .addGap(18, 18, 18)
                        .addComponent(tb_hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tb_cari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(harga_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jumlah_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jumlah_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jumlah_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumlah_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(605, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void tampil_data(){
    DefaultTableModel tabel=new DefaultTableModel();
    tabel.addColumn("no");
    tabel.addColumn("namabarang");
    tabel.addColumn("qty");   
    try {
        java.sql.Connection conn = (java.sql.Connection) perhitungan_barang. Koneksi.koneksiDB();
        String sql = "select * from tbdata";
        java.sql.PreparedStatement pst= conn.prepareStatement ( sql);
        ResultSet rs = pst.executeQuery( sql);
        while(rs.next())
        {
        tabel.addRow(new Object[]{
            rs.getString(1),
            rs.getString(2),
            rs.getString(3)});
        }
        jTable1.setModel(tabel);
        }
    catch (Exception e){
    }
}
    
    private void nama_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_barangActionPerformed
       
        String NamaBarang=(String)nama_barang.getSelectedItem();
switch (NamaBarang){
case "Televisi":
harga_barang.setText("3000000");
break;
case "Komputer":
harga_barang.setText("4000000");
break;
case "Laptop":
harga_barang.setText("5000000");
break;
case "Dispenser":
harga_barang.setText("1000000");
break;
case "Kompor":
harga_barang.setText("500000");
break; }
    }//GEN-LAST:event_nama_barangActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void hitung_jumlah_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung_jumlah_barangActionPerformed
int JumlahBarang=Integer.parseInt(jumlah_beli.getText());
int HargaBarang=Integer.parseInt(harga_barang.getText());
jumlah_harga.setText(Integer.toString(HargaBarang*JumlahBarang));
    }//GEN-LAST:event_hitung_jumlah_barangActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        
        try{
            String sql="insert into tbdata values('"
                    +no.getText()+"','"
                    +nama_barang.getSelectedItem()+"','"                  
                    +jumlah_beli.getText()+"')";
                 java.sql.Connection conn=(java.sql.Connection)perhitungan_barang.Koneksi.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }
        
        
        
        int JumlahBayar=Integer.parseInt(jumlah_bayar.getText());
int JumlahHarga=Integer.parseInt(jumlah_harga.getText());
if (JumlahBayar>=JumlahHarga){
jumlah_kembalian.setText(Integer.toString(JumlahBayar-JumlahHarga));
}
else {
jumlah_kembalian.setText("Uang Anda Kurang");
}
    }//GEN-LAST:event_bayarActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
    harga_barang.setText("");
jumlah_beli.setText("");
jumlah_harga.setText("");
jumlah_bayar.setText("");
jumlah_kembalian.setText("");
nama_barang.setSelectedIndex(0);
    }//GEN-LAST:event_batalActionPerformed

    private void bayar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayar1ActionPerformed

    private void tb_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_hapusActionPerformed
    try{
    java.sql.Connection conn=(java.sql.Connection)perhitungan_barang.Koneksi.koneksiDB();
    String sql = "delete from tbdata where namabarang='"+nama_barang.getSelectedItem()+"' ";
    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
    pst.executeUpdate(); JOptionPane.showMessageDialog(null,"Data berhasil di hapus");
    tampil_data();
    }
catch (Exception e){
JOptionPane.showMessageDialog(null,"Proses Penghapusan Gagal");
System.out.println(e.getMessage());
}
    }//GEN-LAST:event_tb_hapusActionPerformed

    private void tb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_editActionPerformed
        try {
    java.sql.Connection conn = (java.sql.Connection) perhitungan_barang.Koneksi.koneksiDB();
    String sql = "UPDATE tbdata SET qty=? WHERE no=?";
    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
    
    // Mengatur nilai untuk parameter
    pst.setString(1, jumlah_beli.getText());
    pst.setInt(2, Integer.parseInt(no.getText()));
    

    
    // Menjalankan perintah update
    pst.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Data berhasil di Koreksi");
    tampil_data();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Proses Edit data Gagal");
    System.out.println(e.getMessage());
    tampil_data();
}       
    }//GEN-LAST:event_tb_editActionPerformed

    private void tb_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_cariActionPerformed
    try {
    java.sql.Connection conn=(java.sql.Connection)perhitungan_barang.Koneksi.koneksiDB();
    String sql = "Select * from tbdata where no='"+cari.getText()+"' or namabarang='"+cari.getText()+"'";
    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
    ResultSet rs = pst.executeQuery(sql);
    if (rs.next()){
        no.setText(rs.getString(1));
        nama_barang.setSelectedItem(rs.getString(2));
        jumlah_beli.setText(rs.getString(3));
        JOptionPane.showMessageDialog(null,"Data tbdata : "
        + cari.getText() + " ditemukan, Apakah Anda Ingin Mengedit atau Menghapus?");
    }
} catch (Exception e){}
cari.requestFocus();
    }//GEN-LAST:event_tb_cariActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        String tblno = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblnamabarang = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblqty = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        
        no.setText(tblno);
        nama_barang.setSelectedItem(tblnamabarang);
        jumlah_beli.setText(tblqty);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
  java.sql.Connection con = null;
        try{
            String jdbcDriver = "com.mysql.jdbc.Driver";
            Class.forName(jdbcDriver);
            
            String url="jdbc:mysql://localhost:3306/dbdata";
                String user="root";
                String pass="";
                
        con = DriverManager.getConnection(url, user, pass);
        Statement stm = con.createStatement();

    try{
        String report = ("H:\\java hasil\\JavaApplication2\\src\\perhitungan_barang\\report1.jrxml");
        

        JasperReport JRpt = JasperCompileManager.compileReport(report);
        JasperPrint JPrint = JasperFillManager.fillReport(JRpt, null, con);
        JasperViewer.viewReport(JPrint, true);
        JasperViewer viewer = new JasperViewer(JPrint,true);
        viewer.setVisible(true);
    }catch (Exception e){
            e.printStackTrace();
    }
    
    }catch 
            (Exception rptexcpt){
           rptexcpt.printStackTrace();
    }


    }//GEN-LAST:event_btn_viewActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.setProperty("jdk.module.addmods", "java.base/java.lang=ALL-UNNAMED");
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
            java.util.logging.Logger.getLogger(form_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton bayar;
    private javax.swing.JButton bayar1;
    private javax.swing.JButton btn_view;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField harga_barang;
    private javax.swing.JButton hitung_jumlah_barang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlah_bayar;
    private javax.swing.JTextField jumlah_beli;
    private javax.swing.JTextField jumlah_harga;
    private javax.swing.JTextField jumlah_kembalian;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox<String> nama_barang;
    private javax.swing.JTextField no;
    private javax.swing.JButton tb_cari;
    private javax.swing.JButton tb_edit;
    private javax.swing.JButton tb_hapus;
    // End of variables declaration//GEN-END:variables
}
