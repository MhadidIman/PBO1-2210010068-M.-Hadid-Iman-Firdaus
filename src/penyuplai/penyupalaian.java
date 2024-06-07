/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penyuplai;

/**
 *
 * @author User
 */
    class penyuplaian extends barang {
    private int noSuplai;
    private String tglSuplai;
    private String idPemasok;

    public penyuplaian(String kodeBarang, String namaBarang, String satuan, int noSuplai, String tglSuplai, String idPemasok) {
        super(kodeBarang, namaBarang, satuan);
        this.noSuplai = noSuplai;
        this.tglSuplai = tglSuplai;
        this.idPemasok = idPemasok;
    }

    int getNoSuplai() {
        return noSuplai;
    }

    public String getTglSuplai() {
        return tglSuplai;
    }

    public String getIdPemasok() {
        return idPemasok;
    }
}


