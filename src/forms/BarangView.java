package forms;
import transactions.formBarangTambah;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class formBarangView extends javax.swing.JFrame {
  public DefaultTableModel tabModel;
    /**
     * Creates new form formUserView
     */
    public formBarangView() {
        initComponents();
        judul();
        tampilData();
    }
    
    public void judul() {
        Object[] judul = {
        "Kode Barang", "Nama", "Stok", "Kategori", "Harga", "Supplier"};
        tabModel = new DefaultTableModel(null, judul);
           tblBarang.setModel(tabModel);
    }
    
    public void tampilData() {
        tabModel.getDataVector().removeAllElements();
        tabModel.fireTableDataChanged();

        // Membaca data dari file teks dan menambahkannya ke tabel
        String filePath = "C:\\Users\\abiyy\\Documents\\NetBeansProjects\\warehouseManagementSystem\\src\\data\\data_barang.txt"; // File yang akan dibaca
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                Object[] data = line.split(",");
                tabModel.addRow(data);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error membaca file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJudul = new javax.swing.JLabel();
        lblCari = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        scrollTabel = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("DAFTAR BARANG");

        lblCari.setText("Cari");

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama", "Stok", "Kategori", "Harga", "Supplier"
            }
        ));
        scrollTabel.setViewportView(tblBarang);

        btnTambah.setText("Tambah Barang");
        btnTambah.setMinimumSize(new java.awt.Dimension(115, 23));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit Barang");
        btnEdit.setMinimumSize(new java.awt.Dimension(115, 23));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus Barang");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJudul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollTabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCari)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus)
                    .addComponent(btnKembali))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed

    String searchQuery = txtCari.getText().toLowerCase();

    // Jika pencarian kosong, tampilkan semua data
    if (searchQuery.isEmpty()) {
        tampilData();  // Menampilkan semua data jika tidak ada teks pencarian
    } else {
        filterData(searchQuery);  // Memanggil filter data berdasarkan pencarian
    }
    }//GEN-LAST:event_txtCariActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        formBarangTambah go = new formBarangTambah();
        go.show();
        this.hide();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        formDashboard go = new formDashboard();
        go.show();
        this.hide();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblBarang.getSelectedRow(); // Ambil baris yang dipilih
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin diedit!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Ambil data dari tabel
    String kodeBarang = (String) tblBarang.getValueAt(selectedRow, 0);
    String nama = (String) tblBarang.getValueAt(selectedRow, 1);
    String stok = (String) tblBarang.getValueAt(selectedRow, 2);
    String kategori = (String) tblBarang.getValueAt(selectedRow, 3);
    String harga = (String) tblBarang.getValueAt(selectedRow, 4);
    String supplier = (String) tblBarang.getValueAt(selectedRow, 5);

    // Tampilkan dialog untuk mengedit data
    JTextField txtKodeBarang = new JTextField(kodeBarang);
    JTextField txtNama = new JTextField(nama);
    JTextField txtStok = new JTextField(stok);
    JTextField txtKategori = new JTextField(kategori);
    JTextField txtHarga = new JTextField(harga);
    JTextField txtSupplier = new JTextField(supplier);

    Object[] fields = {
        "Kode Barang:", txtKodeBarang,
        "Nama:", txtNama,
        "Stok:", txtStok,
        "Kategori:", txtKategori,
        "Harga:", txtHarga,
        "Supplier:", txtSupplier
    };

    int option = JOptionPane.showConfirmDialog(this, fields, "Edit Barang", JOptionPane.OK_CANCEL_OPTION);
    if (option == JOptionPane.OK_OPTION) {
        // Update tabel
        tblBarang.setValueAt(txtKodeBarang.getText(), selectedRow, 0);
        tblBarang.setValueAt(txtNama.getText(), selectedRow, 1);
        tblBarang.setValueAt(txtStok.getText(), selectedRow, 2);
        tblBarang.setValueAt(txtKategori.getText(), selectedRow, 3);
        tblBarang.setValueAt(txtHarga.getText(), selectedRow, 4);
        tblBarang.setValueAt(txtSupplier.getText(), selectedRow, 5);

        // Simpan perubahan ke file
        simpanDataUpdate();
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblBarang.getSelectedRow(); // Ambil baris yang dipilih
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Konfirmasi penghapusan
    int option = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        // Hapus data dari tabel
        tabModel.removeRow(selectedRow);

        // Simpan perubahan ke file
        simpanDataHapus();
    }
    }//GEN-LAST:event_btnHapusActionPerformed
    
    public void simpanDataUpdate() {
    String filePath = "C:\\Users\\abiyy\\Documents\\NetBeansProjects\\warehouseManagementSystem\\src\\data\\data_barang.txt";
    try (java.io.PrintWriter writer = new java.io.PrintWriter(filePath)) {
        for (int i = 0; i < tblBarang.getRowCount(); i++) {
            String row = "";
            for (int j = 0; j < tblBarang.getColumnCount(); j++) {
                row += tblBarang.getValueAt(i, j);
                if (j < tblBarang.getColumnCount() - 1) {
                    row += ",";
                }
            }
            writer.println(row);
        }
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error menyimpan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void simpanDataHapus() {
    String filePath = "C:\\Users\\abiyy\\Documents\\NetBeansProjects\\warehouseManagementSystem\\src\\data\\data_barang.txt";
    try (java.io.PrintWriter writer = new java.io.PrintWriter(filePath)) {
        for (int i = 0; i < tblBarang.getRowCount(); i++) {
            String row = "";
            for (int j = 0; j < tblBarang.getColumnCount(); j++) {
                row += tblBarang.getValueAt(i, j);
                if (j < tblBarang.getColumnCount() - 1) {
                    row += ",";
                }
            }
            writer.println(row);
        }
        JOptionPane.showMessageDialog(this, "Data berhasil di hapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error menghapus data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    public void filterData(String searchQuery) {
    tabModel.getDataVector().removeAllElements();
    tabModel.fireTableDataChanged();

    String filePath = "C:\\Users\\abiyy\\Documents\\NetBeansProjects\\warehouseManagementSystem\\src\\data\\data_barang.txt"; // File yang akan dibaca
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            // Cek apakah salah satu kolom (ID atau Nama) mengandung teks pencarian
            String id = data[0].toLowerCase();
            String name = data[1].toLowerCase();
            if (id.contains(searchQuery) || name.contains(searchQuery)) {
                tabModel.addRow(data); // Tambahkan baris yang sesuai dengan pencarian
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error membaca file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
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
            java.util.logging.Logger.getLogger(formBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel lblCari;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JScrollPane scrollTabel;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}
