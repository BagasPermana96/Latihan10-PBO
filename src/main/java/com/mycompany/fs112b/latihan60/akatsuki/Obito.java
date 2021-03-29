/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fs112b.latihan60.akatsuki;

/**
 *
 * @author 
 * NAMA     : Muhamad Bagas Permana
 * KELAS    : FS112B-PBO
 * NIK      : 2022431570
 * Deskripsi Program	: Program ini berisi program untuk
 * membuat daftar anggota akatsuki, terdiri dari : 
 * Nama, Elemen, Jutsu, dan Partner
 * 
 */
public class Obito extends Akatsuki {
    private final String partnerKerja;

    public Obito() {
        this.nama = "Obito Uchiha";
        this.asalNegara = "Konohagakure";
        this.elemen = "Angin, Petir, Tanah, Air, Api, Kayu, Yin, Yang ";
        this.jutsu = "Izanagi, Teknik Memanggil, Senjutsu Enam Jalan Pain, Genjutsu, Bola Monster Berekor";
        this.partnerKerja = "Deidara kemudian Zetsu";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah anggota klan Uchiha dari  " + asalNegara+
                ". \nDia diyakini telah meninggal selama Perang Dunia Shinobi Ketiga. " +
                "\nDia mewarisi rencana Madara untuk menciptakan dunia yang ideal. " +
                "\nObito dengan halus mengambil alih kendali Akatsuki, menggunakan " +
                "\nmereka sebagai alat untuk memuluskan tujuannya.");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
