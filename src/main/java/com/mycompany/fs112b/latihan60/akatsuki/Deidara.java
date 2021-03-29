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
public class Deidara extends Akatsuki {
    private final String partnerKerja;

    public Deidara() {
        this.nama = "Deidara";
        this.asalNegara = "Iwagakure";
        this.elemen = "Tanah dan ledakan";
        this.jutsu = "-";
        this.partnerKerja = "Sasori kemudian dengan Tobi(Obito)";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah Ninja Pelarian dari " + asalNegara);
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
