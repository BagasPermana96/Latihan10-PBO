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
public class Pain extends Akatsuki {
    private final String partnerKerja;

    public Pain() {
        this.nama = "Pain / Nagato Uzumaki";
        this.asalNegara = "Amegakure";
        this.elemen = "Angin, Petir, Tanah, Air, Api, Yang ";
        this.jutsu = "BanshÅ� Tenin, Chibaku Tensei, Shinra Tensei";
        this.partnerKerja = "Konan";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " ketua organisasi akatsuki, pain berjumlah 6 orang yang ternyata "+
                "\ndikendalikan dari jarak jauh oleh Nagato dengan mata rinnegan. ia mulai memimpin " +
                "\nAkatsuki yang baru, yang akan menggunakan cara kekerasan untuk mencapai tujuan mereka.   " +
                "\nSebenarnya Pain bukanlah ketua akatsuki karna yang mengepalai akatsuki yang sebenarnya " +
                "\nadalah Tobi yang mengaku sebagai Madara Uchiha.");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
