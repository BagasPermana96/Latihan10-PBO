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
public class Kakuzu extends Akatsuki {
    private final String partnerKerja;

    public Kakuzu() {
        this.nama = "Kakuzu";
        this.asalNegara = "Takigakure";
        this.elemen = "Tanah, Angin, Air, Petir, Api";
        this.jutsu = "-";
        this.partnerKerja = "Hidan";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah anggota akatsuki yang suka menabung dengan cara berburu buronan " +
                "\nlalu menebusnya dengan uang. Dia dapat memperpanjang hidupnya dengan cara mengambil jantung manusia. " +
                "\nKakuzu pernah melaksanakan misi dari negaranya untuk membunuh Hokage pertama (Hashirama) namun gagal " +
                "\ndan membuatnya dihukum berat. Hal tersebut membuatnya melarikan diri kemudian bergabung dengan Akatsuki.");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
