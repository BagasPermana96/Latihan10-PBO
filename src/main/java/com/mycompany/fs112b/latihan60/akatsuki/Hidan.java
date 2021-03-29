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
public class Hidan extends Akatsuki {
    private final String partnerKerja;

    public Hidan() {
        this.nama = "Hidan";
        this.asalNegara = "Yugakure";
        this.elemen = "-";
        this.jutsu = "Ritual Jashin";
        this.partnerKerja = "Kakuzu";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah seorang penganut agama bernama 'Jashin', sebuah kepercayaan yang menyembah " +
                "\nDewa Jashin. Dia Tidak bisa dibunuh, dan bisa melukai lawannya dengan cara melukai dirinya " +
                "\nsendiri setelah meminum darah lawannya.");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
