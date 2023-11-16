/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programperpustakaan;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class BalikBuku extends javax.swing.JFrame {
    String kembali;
    String pulang;

    /**
     * Creates new form BalikBuku
     */
    public BalikBuku() {
        initComponents();
        tampil();
        kosong();
        
        try {
             BufferedImage beam = ImageIO.read(getClass().getResource("library.jpg"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       this.setTitle("Form Pengembalian Buku");
    }
    
    private void kosong(){
        txtTelat.setEditable(true);
        txtDenda.setEditable(true);
        txtBayar.setEditable(true);
        txtKembalian.setEditable(true);
        tglKembali.setDate(null);
        tglKembali.setEnabled(false);  

        txtId.setText("ID Peminjaman");
        txtPinjam.setText("Tanggal Peminjaman");
        txtBalik.setText("Tanggal Balik");
        txtTelat.setText("Keterlambatan");
        txtDenda.setText("Denda");
        txtBayar.setText("Bayar");
        txtKembalian.setText("Kembali"); 
        txtKembalian.setEditable(false);
        txtId.setEditable(false);
        txtPinjam.setEditable(false);
        txtBalik.setEditable(false);
        txtTelat.setEditable(false);
        txtDenda.setEditable(false);
        tglKembali.setEnabled(false);
        jButton3.setEnabled(false);
        jButton1.setEnabled(false);
        jButton4.setEnabled(false);
    }
    
    private void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Npm");
        model.addColumn("Nama");
        model.addColumn("Id_buku");
        model.addColumn("judul");
        model.addColumn("Jumlah");
        model.addColumn("Tgl Pinjam");
        model.addColumn("Tgl Kembali");
        model.addColumn("Denda");
        model.addColumn("Status");
        
        try{
            String status = "Belum Kembali";
            String query = "select*from pinjaman where status = '"+status+"'";
            java.sql.Connection kon = (Connection) Konektor.koneksi();
            java.sql.Statement stm = kon.createStatement();
            java.sql.ResultSet data = stm.executeQuery(query);
            
            while(data.next()){
                model.addRow(new Object [] {data.getString(1),data.getString(2),
                data.getString(3),data.getString(4),data.getString(5),data.getString(6),
                data.getString(7),data.getString(8),data.getString(9),data.getString(10)});
            }
            
            tblPinjam.setModel(model);
        }
        catch(Exception b){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtPinjam = new javax.swing.JTextField();
        txtBalik = new javax.swing.JTextField();
        tglKembali = new org.netbeans.modules.form.InvalidComponent();
        txtTelat = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        txtBayar = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPinjam = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("PENGEMBALIAN BUKU");

        txtSearch.setText("Search ID");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tglKembali.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglKembaliPropertyChange(evt);
            }
        });
        tglKembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tglKembaliKeyPressed(evt);
            }
        });

        txtDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDendaActionPerformed(evt);
            }
        });

        txtBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBayarMouseClicked(evt);
            }
        });
        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        txtBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBayarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBayarKeyTyped(evt);
            }
        });

        txtKembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKembalianMouseClicked(evt);
            }
        });

        jButton3.setText("Hitung");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Proses");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Batal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblPinjam.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPinjamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPinjam);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBalik, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelat, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBalik, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtTelat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        txtSearch.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if(txtSearch.getText().equals("")){
            tampil();
        }
        else{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Npm");
            model.addColumn("Nama");
            model.addColumn("Id_buku");
            model.addColumn("judul");
            model.addColumn("Jumlah");
            model.addColumn("Tgl Pinjam");
            model.addColumn("Tgl Kembali");
            model.addColumn("Denda");
            model.addColumn("Status");
            
            try{
                String status="Belum Kembali";
                String query = "select * from pinjaman where npm = '"+txtSearch.getText()+"'"
                + "&& status = '"+status+"'";
                java.sql.Connection kon = (Connection) Konektor.koneksi();
                java.sql.Statement stm = kon.createStatement();
                java.sql.ResultSet data = stm.executeQuery(query);

                while(data.next()){
                    model.addRow(new Object [] {data.getString(1),data.getString(2),
                        data.getString(3),data.getString(4),data.getString(5),data.getString(6),
                        data.getString(7),data.getString(8),data.getString(9),data.getString(10)});
                }
                
                tblPinjam.setModel(model);
            }
            catch(Exception b){

            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDendaActionPerformed

    private void txtBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBayarMouseClicked
        txtBayar.setText(null);        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarMouseClicked

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarActionPerformed

    private void txtBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarKeyPressed

    private void txtBayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyTyped
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))) {
            evt.consume();
        }            
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarKeyTyped

    private void txtKembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKembalianMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembalianMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int bayar = Integer.parseInt(txtBayar.getText());
        int denda = Integer.parseInt(txtDenda.getText());

        if(bayar<denda){
            JOptionPane.showMessageDialog(null,"Tidak Boleh Kurang!");
        }
        else{
            int total = bayar-denda;
            String ttl;
            ttl = String.valueOf(total);
            txtKembalian.setText(ttl);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String status = "Sudah Kembali";
            String sql ="UPDATE pinjaman SET denda = '"+txtDenda.getText()
            +"',status = '"+status
            +"' WHERE id_pinjam = '"+txtId.getText()+"'";
            java.sql.Connection conn=(Connection)Konektor.koneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        
        try{
            String id= txtId.getText();
            String query = "select id_buku from pinjaman where id_pinjam = '"+id+"'";
            java.sql.Connection kon = (Connection) Konektor.koneksi();
            java.sql.Statement stm = kon.createStatement();
            java.sql.ResultSet data = stm.executeQuery(query);

            while(data.next()){
                String aidi = data.getString("id_buku");
                
                try{
                    String query1 = "select*from buku where id_buku = '"+aidi+"'";
                    java.sql.Connection kon1 = (Connection) Konektor.koneksi();
                    java.sql.Statement st = kon1.createStatement();
                    java.sql.ResultSet data1 = st.executeQuery(query1);

                    while(data1.next()){
                        int baris = tblPinjam.getSelectedRow();
                        String jmlh= tblPinjam.getValueAt(baris, 5).toString();
                        int jumlah= Integer.parseInt(data1.getString(7));
                        int jumlahpinjam = Integer.parseInt(jmlh);
                        int total = jumlah+jumlahpinjam;
                        
                        try {
                            String sql1 ="UPDATE buku SET stok = '"+total
                            +"' WHERE id_buku = '"+aidi+"'";
                            java.sql.Connection conn1=(Connection)Konektor.koneksi();
                            java.sql.PreparedStatement pst=conn1.prepareStatement(sql1);
                            pst.execute();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
                        }
                    }
                }
                catch(Exception b){
                    JOptionPane.showMessageDialog(null, b.getMessage());
                }
            }
        }
        catch(Exception b){

        }
        
        tampil();
        kosong();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kosong();
        txtKembalian.setEditable(false);
        txtId.setEditable(false);
        txtPinjam.setEditable(false);
        txtBalik.setEditable(false);
        txtTelat.setEditable(false);
        txtDenda.setEditable(false);
        tglKembali.setEnabled(false);
        jButton3.setEnabled(false);
        jButton1.setEnabled(false);
        jButton4.setEnabled(false);
        txtBayar.setEditable(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Beranda().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPinjamMouseClicked
        jButton1.setEnabled(true);
        tglKembali.setEnabled(true);
        txtBayar.setEditable(true);
        
        try{
            int baris = tblPinjam.getSelectedRow();
            String id= tblPinjam.getValueAt(baris, 0).toString();

            String query = "select*from pinjaman where id_pinjam = '"+id+"'";
            java.sql.Connection kon = (Connection) Konektor.koneksi();
            java.sql.Statement stm = kon.createStatement();
            java.sql.ResultSet data = stm.executeQuery(query);

            while(data.next()){

                txtId.setText(data.getString(1));
                txtPinjam.setText(data.getString(7));
                txtBalik.setText(data.getString(8));
                kembali = data.getString(8);
            }
        }
        catch(Exception b){

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPinjamMouseClicked

    private void tglKembaliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglKembaliPropertyChange
        if (tglKembali.getDate() != null) {
            SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
            pulang = FormatTanggal.format(tglKembali.getDate());
        }
        
        try {
            DateFormat format = new SimpleDateFormat("dd MMMM yyyy");
            Date tanggalpinjam = format.parse(kembali);
            Date tanggalkembali = format.parse(pulang);
            long tanggalpinjam1 = tanggalpinjam.getTime();
            long tanggalkembali1 = tanggalkembali.getTime();
            long diff = tanggalkembali1 - tanggalpinjam1;
            long lama = diff / (24 * 60 * 60 * 1000);
            txtTelat.setText(Long.toString(lama) + "");
            
            int denda;
            int telat = Integer.parseInt(txtTelat.getText());
            denda = telat*5000;
            String tlt;
            tlt = String.valueOf(denda);
            
            if(telat<0){
                txtTelat.setText("Keterlambatan");
                txtDenda.setText("Denda");
                txtBayar.setText("Bayar");
                txtKembalian.setText("Kembali");
                jButton3.setEnabled(false); 
                jButton4.setEnabled(false);
                jButton1.setEnabled(true);
            } 
            else if(tlt.equals("0")){
                txtBayar.setText("0");
                txtDenda.setText("0");
                txtKembalian.setText("0");
                txtBayar.setEditable(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
                jButton1.setEnabled(true);
            }
            else{
                txtBayar.setEditable(true);
                txtBayar.setText("Bayar");
                txtKembalian.setText("Kembali");
                jButton3.setEnabled(true); 
                jButton4.setEnabled(true);
                jButton1.setEnabled(true);
                txtDenda.setText(tlt);
            }
        } 
        catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tglKembaliPropertyChange

    private void tglKembaliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tglKembaliKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglKembaliKeyPressed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPinjam;
    private org.netbeans.modules.form.InvalidComponent tglKembali;
    private javax.swing.JTextField txtBalik;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtPinjam;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTelat;
    // End of variables declaration//GEN-END:variables
}
