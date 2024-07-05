/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import CRUD.database;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author GAMING 3
 */
public class database {
    private String databaseName = "hadid_2210010068";
    private String username = "root";
    private String password = "";
    public static Connection  ConnectionDB;
   
   public database (){
       try {
           String location  = "jdbc:mysql://localhost/" + databaseName;
           Class.forName("com.mysql.jdbc.Driver");
           ConnectionDB = DriverManager.getConnection(location, username, password);
           System.out.println("databse terkoneksi");
           
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
   public void simpanuji(String nik, String nama, String telp, String alamat){
     try{
         String sql = "insert into uji ( nik, nama, telp, Alamat)value (?,?,?,?)";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, nik);
         perintah.setString(2, nama);
         perintah.setString(3, telp);
         perintah.setString(4, alamat);
         
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
      public void ubahuji(String nik, String nama, String telp, String alamat){
     try{
         String sql = "Update uji set nama = ?, telp =?, alamat = ? where nik =?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, nama);
         perintah.setString(2, telp);
         perintah.setString(3, alamat);
         perintah.setString(4, nik);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
     public void hapusuji(String Nik ){
     try{
         String sql = " delete from uji where nik = 1";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());
}
     }
    public void cariuji (String nama) {
       try {
       String sql="select * from uji where nama=?";
       PreparedStatement perintah = ConnectionDB.prepareStatement (sql);
       perintah.setString(1, nama);
       ResultSet data = perintah.executeQuery();
       while (data.next()) {
           System.out.println("nama: "+data.getString("nama"));
           System.out.println("telepon:"+data.getString("telp"));
           System.out.println("alamat: "+data.getString("alamat"));
           System.out.println("nik : "+data.getString("nik"));
        }
       }catch (Exception e) {
          System.out.println(e.getMessage());
        }
     }
     public void datauji() {
         try {
             Statement stmt = ConnectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("select*from uji order by nama");
             while(baris.next()){
                 System.out.println(baris.getString("nama")+"|"+
                         baris.getString("nama")+"|"+
                         baris.getString("telp")+"|"+
                         baris.getString("alamat"));
                    
             }
         } catch (Exception e)  {
             System.out.println(e.getMessage());
         }
     }
     
     // tabel notif
     public void simpandetailbarang(String kode_barang, String no_suplai, String harga_jual){
     try{
         String sql = "insert into detailbarang ( kode_barang, no_suplai,harga_jual)value (?,?,?)";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, kode_barang);
         perintah.setString(2, no_suplai);
         perintah.setString(3, harga_jual);
         
         
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
      public void ubahdetailbarang(String kode_barang, String no_suplai, String harga_jual){
     try{
         String sql = "Update detailbarang set kode_barang = ?, no_suplai=?, harga_jual = ?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, kode_barang);
         perintah.setString(2, no_suplai);
         perintah.setString(3, harga_jual);
         
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
     public void hapusdetailbarang(String harga_jual ){
     try{
         String sql = " delete from detailbarang where kode_barang = 1";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());

 }
     }
     public void caridetailbarang (String kode_barang) {
       try {
       String sql="select * from detailbarang where kode_barang=?";
       PreparedStatement perintah = ConnectionDB.prepareStatement (sql);
       perintah.setString(1, kode_barang);
       ResultSet data = perintah.executeQuery();
       while (data.next()) {
           System.out.println("KodeBarang: "+data.getString("kode_barang"));
           System.out.println("NoSuplai:"+data.getString("no_suplai"));
           System.out.println("HargaJual: "+data.getString("harga_jual"));
           
        }
       }catch (Exception e) {
          System.out.println(e.getMessage());
        }
     }
     public void datadetailbarang() {
         try {
             Statement stmt = ConnectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("select*from detailbarang order by kode_barang");
             while(baris.next()){
                 System.out.println(baris.getString("kode_barang")+"|"+
                         baris.getString("no_suplai")+"|"+
                         baris.getString("harga_jual"));
                    
             }
         } catch (Exception e)  {
             System.out.println(e.getMessage());
         }
     }
     // tabel  bareng
     
     public void simpanbarang(String kode_barang, String nama_Barang, String satuan){
     try{
         String sql = "insert into barang ( kode_barang, nama_Barang, satuan)value (?,?,?)";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, kode_barang);
         perintah.setString(2, nama_Barang);
         perintah.setString(3, satuan);
         
        
         
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
      public void ubahBarang(String kode_barang, String nama_Barang, String satuan){
     try{
         String sql = "Update barang set nama_Barang =?,satuan =? where kode_barang = ?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, nama_Barang);
         perintah.setString(2, satuan);
         perintah.setString(3, kode_barang);
         
        
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
     public void hapusBarang(String kode_barang ){
     try{
         String sql = " delete from barang where kode_barang = 1";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());

 }
     }
      public void caribarang (String nama_barang) {
       try {
       String sql="select * from barang where nama_barang=?";
       PreparedStatement perintah = ConnectionDB.prepareStatement (sql);
       perintah.setString(1, nama_barang);
       ResultSet data = perintah.executeQuery();
       while (data.next()) {
           System.out.println("NamaBarang: "+data.getString("nama_barang"));
           System.out.println("Satuan:"+data.getString("satuan"));
           System.out.println("KodeBarang: "+data.getString("kode_barang"));
           
        }
       }catch (Exception e) {
          System.out.println(e.getMessage());
        }
     }
     public void databarang() {
         try {
             Statement stmt = ConnectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("select*from barang order by kode_barang");
             while(baris.next()){
                 System.out.println(baris.getString("nama_barang")+"|"+
                         baris.getString("satuan")+"|"+
                         baris.getString("kode_barang"));
                    
             }
         } catch (Exception e)  {
             System.out.println(e.getMessage());
         }
     }
     //barang penyuplai
        public void simpanpenyuplai(String no_suplai, String tgl_masuk, String id_pemasok) {
     try{
         String sql = "insert into penyuplai (no_suplai, tgl_masuk, id_pemasok)value (?,?,?)";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, no_suplai);
         perintah.setString(2, tgl_masuk);
         perintah.setString(3, id_pemasok);
         
         
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
      public void ubahpenyuplai(String no_suplai, String tgl_masuk, String id_pemasok){
     try{
         String sql = "Update penyuplai set tgl_masuk = ?, id_pemasok =? where no_suplai ";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         
         perintah.setString(1, tgl_masuk);
         perintah.setString(2, id_pemasok);
         perintah.setString(3, no_suplai);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
     public void hapuspenyuplai(String no_suplai ){
     try{
         String sql = " delete from penyuplai where no_suplai = 1";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());

 }
     }
      public void caripenyuplai (String no_suplai ) {
       try {
       String sql="select * from penyuplai where no_suplai=?";
       PreparedStatement perintah = ConnectionDB.prepareStatement (sql);
       perintah.setString(1, no_suplai);
       ResultSet data = perintah.executeQuery();
       while (data.next()) {
           System.out.println("NoSuplai: "+data.getString("no_suplai"));
           System.out.println("tglmasuk:"+data.getString("tgl_masuk"));
           System.out.println("IdPemasok: "+data.getString("id_pemasok"));
           
        }
       }catch (Exception e) {
          System.out.println(e.getMessage());
        }
     }
     public void datapenyuplai() {
         try {
             Statement stmt = ConnectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("select*from penyuplai order by no_suplai");
             while(baris.next()){
                 System.out.println(baris.getString("no_suplai")+"|"+
                         baris.getString("tgl_masuk")+"|"+
                         baris.getString("id_pemasok"));
                    
             }
         } catch (Exception e)  {
             System.out.println(e.getMessage());
         }
     }

//pemasok
           public void simpanpemasok(String id_pemasok, String nama, String alamat, String telp){
     try{
         String sql = "insert into pemasok ( id_pemasok, nama, alamat, telp )value (?,?,?,?)";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, id_pemasok);
         perintah.setString(2, nama);
         perintah.setString(3, alamat);
         perintah.setString(4, telp);
         
         
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
      public void ubahpemasok(String id_pemasok, String nama, String alamat, String telp){
     try{
         String sql = "Update pemasok set nama = ?, alamat = ?, telp = ? where id_pemasok = ?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, nama);
         perintah.setString(2, alamat);
         perintah.setString(3, telp);
         perintah.setString(4, id_pemasok);
        
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
     public void hapuspemasok(String id_pemasok ){
     try{
         String sql = " delete from pemasok where id_pemasok = 1";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());

 }
     }
      public void caripemasok (String id_pemasok) {
       try {
       String sql="select * from pemasok where id_pemasok=?";
       PreparedStatement perintah = ConnectionDB.prepareStatement (sql);
       perintah.setString(1, id_pemasok);
       ResultSet data = perintah.executeQuery();
       while (data.next()) {
           System.out.println("IdPemasok: "+data.getString("id_pemasok"));
           System.out.println("Nama:"+data.getString("nama"));
           System.out.println("Alamat: "+data.getString("alamat"));
           System.out.println("Telpon: "+data.getString("telp"));
           
        }
       }catch (Exception e) {
          System.out.println(e.getMessage());
        }
     }
     public void datapemasok() {
         try {
             Statement stmt = ConnectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("select*from pemasok order by id_pemasok");
             while(baris.next()){
                 System.out.println(baris.getString("id_pemasok")+"|"+
                         baris.getString("nama")+"|"+
                         baris.getString("alamat")+"|"+
                         baris.getString("telp"));
                  
             }
         } catch (Exception e)  {
             System.out.println(e.getMessage());
         }
     }
}
