/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barang;

/**
 *
 * @author User
 */
import penyuplai.*;
import CRUD.database;
import gui.framaUtama;



public class main {
    public static void main(String[] args) {
      new framaUtama().setVisible(true);
      







// database dbconnect = new database();
    
  
//table uji
//dbconnect.simpanuji("1", "Hadid", "085451515456", "Handil Bakti");
//dbconnect.hapusuji("1");
//dbconnect.ubahuji("1", "Hadid", "0854", "semanagatdalam");
//dbconnect.cariuji("Hadid");
//dbconnect.datauji();
        
 //Tabel detailbarang
//dbconnect.simpandetailbarang("001", "221", "6000");
//dbconnect.ubahdetailbarang("001", "220", "5000");
//dbconnect.hapusdetailbarang ("01");
//dbconnect.caridetailbarang("001");
//dbconnect.datadetailbarang();



 //Tabel barang
//dbconnect.simpanbarang ("01", "sikat", "4");
//dbconnect.ubahBarang("02", "shampo", "2");
//dbconnect.hapusBarang("02");
//dbconnect.caribarang("sikat");
//dbconnect.databarang();



 //Tabel pemasok
//dbconnect.simpanpemasok("221", "udin","handil","08776564331");
//dbconnect.ubahpemasok("228", "adul","semangat","087876543526");
//dbconnect.hapuspemasok("221");
//dbconnect.caripemasok("221");
//dbconnect.datapemasok();


// Tabel penyuplai
//dbconnect.simpanpenyuplai("1", "19-juni-2024","220");
//dbconnect.ubahpenyuplai("1", "20-juni-2024","220");
//dbconnect.hapuspenyuplai("1");
//dbconnect.caripenyuplai("1");
//dbconnect.datapenyuplai();
    }
}

//public class main {
    //private static List<barang> daftarBarang = new ArrayList<>();

    //public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //boolean lanjut = true;

        //while (lanjut) {
            //System.out.println("\nMenu:");
            //System.out.println("1. Tampilkan daftar barang");
            //System.out.println("2. Tambah barang");
            //System.out.println("3. Hapus barang");
            //System.out.println("4. Keluar");
           // System.out.print("Pilih menu: ");
            //int pilihan = scanner.nextInt();

            //switch (pilihan) {
                //case 1:
                  //  tampilkanDaftarBarang();
                  //  break;
                //case 2:
                   // tambahBarang(scanner);
                 //   break;
               // case 3:
                 //   hapusBarang(scanner);
                //    break;
                //case 4:
                  //  lanjut = false;
                  //  break;
                //default:
                  //  System.out.println("Pilihan tidak valid.");
            //}
     //   }
    //}

    //private static void tampilkanDaftarBarang() {
      //  if (daftarBarang.isEmpty()) {
      //      System.out.println("Daftar barang kosong.");
      //  } else {
           // System.out.println("Daftar Barang:");
           // for (barang barang : daftarBarang) {
                //System.out.println("Kode: " + barang.getKodeBarang() + ", Nama: " + barang.getNamaBarang() + ", Satuan: " + barang.getSatuan());
           // }
        //}
    //}

    //private static void tambahBarang(Scanner scanner) {
      //  System.out.print("Masukkan kode barang: ");
      //  String kodeBarang = scanner.next();
        //System.out.print("Masukkan nama barang: ");
        //String namaBarang = scanner.next();
        //System.out.print("Masukkan satuan barang: ");
        //String satuan = scanner.next();

        //daftarBarang.add(new barang(kodeBarang, namaBarang, satuan));
        //System.out.println("Barang berhasil ditambahkan.");
    //}

    //private static void hapusBarang(Scanner scanner) {
        //if (daftarBarang.isEmpty()) {
            //System.out.println("Daftar barang kosong.");
            //return;
        //}

        //System.out.print("Masukkan kode barang yang ingin dihapus: ");
        //String kodeBarang = scanner.next();

        //boolean removed = false;
        //for (barang barang : daftarBarang) {
        //    if (barang.getKodeBarang().equals(kodeBarang)) {
        //        daftarBarang.remove(barang);
        //        removed = true;
        //        System.out.println("Barang dengan kode " + kodeBarang + " berhasil dihapus.");
               // break;
        //    }
        //}

        //if (!removed) {
        //    System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
        //}
    //}
//}
