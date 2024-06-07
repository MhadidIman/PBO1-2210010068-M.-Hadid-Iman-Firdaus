/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penyuplai;

/**
 *
 * @author User
 */
import penyuplai.penyuplaian;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<penyuplaian> daftarPenyuplaian = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan daftar penyuplai");
            System.out.println("2. Tambah penyuplai");
            System.out.println("3. Hapus penyuplai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDaftar();
                    break;
                case 2:
                    tambahPenyuplai();
                    break;
                case 3:
                    hapusPenyuplai();
                    break;
                case 4:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tampilkanDaftar() {
        System.out.println("\nDaftar Penyuplai:");
        if (daftarPenyuplaian.isEmpty()) {
            System.out.println("Tidak ada penyuplai.");
        } else {
            for (penyuplaian penyuplaian : daftarPenyuplaian) {
                System.out.println("No Suplai: " + penyuplaian.getNoSuplai() + ", Tgl Suplai: " + penyuplaian.getTglSuplai() + ", ID Pemasok: " + penyuplaian.getIdPemasok());
            }
        }
    }

    private static void tambahPenyuplai() {
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = scanner.next();
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.next();
        System.out.print("Masukkan satuan barang: ");
        String satuan = scanner.next();
        System.out.print("Masukkan nomor suplai: ");
        int noSuplai = scanner.nextInt();
        System.out.print("Masukkan tanggal suplai: ");
        String tglSuplai = scanner.next();
        System.out.print("Masukkan ID pemasok: ");
        String idPemasok = scanner.next();

        daftarPenyuplaian.add(new penyuplaian(kodeBarang, namaBarang, satuan, noSuplai, tglSuplai, idPemasok));
        System.out.println("Penyuplai berhasil ditambahkan.");
    }

    private static void hapusPenyuplai() {
        if (daftarPenyuplaian.isEmpty()) {
            System.out.println("Daftar penyuplai kosong.");
            return;
        }

        System.out.print("Masukkan nomor penyuplai yang ingin dihapus: ");
        int noSuplai = scanner.nextInt();

        boolean removed = false;
        for (penyuplaian penyuplaian : daftarPenyuplaian) {
            if (penyuplaian.getNoSuplai() == noSuplai) {
                daftarPenyuplaian.remove(penyuplaian);
                removed = true;
                System.out.println("Penyuplai dengan nomor " + noSuplai + " berhasil dihapus.");
                break;
            }
        }

        if (!removed) {
            System.out.println("Penyuplai dengan nomor " + noSuplai + " tidak ditemukan.");
        }
    }
}

