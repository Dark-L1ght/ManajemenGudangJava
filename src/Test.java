//package forms;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import javax.swing.DefaultComboBoxModel;
//
//private void populateComboBoxFromFile(String filePath) {
//    try {
//        // Membaca file teks
//        BufferedReader reader = new BufferedReader(new FileReader(filePath));
//        String line;
//        // Menggunakan List untuk menampung data nama supplier
//        java.util.List<String> supplierList = new java.util.ArrayList<>();
//
//        // Membaca setiap baris file
//        while ((line = reader.readLine()) != null) {
//            // Menggunakan pemisah untuk memisahkan kolom (misalnya, spasi atau koma)
//            String[] columns = line.split("\\s+"); // Memisahkan berdasarkan spasi (\\s+ untuk menangani lebih dari satu spasi)
//
//            // Pastikan ada cukup kolom, dan ambil kolom kedua (index 1)
//            if (columns.length > 1) {
//                supplierList.add(columns[1]);  // Kolom kedua adalah nama supplier
//            }
//        }
//        reader.close();
//
//        // Mengubah List menjadi array dan set sebagai model combo box
//        String[] suppliersArray = new String[supplierList.size()];
//        supplierList.toArray(suppliersArray);
//
//        // Mengupdate combo box cbSupplier dengan daftar baru
//        cbSupplier.setModel(new DefaultComboBoxModel<>(suppliersArray));
//    } catch (IOException e) {
//        // Menangani jika terjadi error saat membaca file
//        System.out.println("Error reading file: " + e.getMessage());
//    }
//}
