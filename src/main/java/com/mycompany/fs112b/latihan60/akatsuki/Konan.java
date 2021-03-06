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
public class Konan extends Akatsuki {
    private final String partnerKerja;

    public Konan() {
        this.nama = "Konan";
        this.asalNegara = "Amegakure";
        this.elemen = "Kertas";
        this.jutsu = "Tenshi no Fukuin";
        this.partnerKerja = "Pain";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah rekan Pain, dan memiliki jurus origami yaitu kertas lipat, "+
                "\ndia juga dapat membuat tubuhnya menjadi lembaran-lembaran kertas. Bersama Yahiko dan Nagato " +
                "\nmereka bertiga adalah bekas murid Jiraiya sannin, mereka bertigalah yang awalnya membentuk " +
                "\nakatsuki untuk menciptakan perdamaian dengan cara bermusyawarah tanpa kekerasan, namun " +
                "\nYahiko terbunuh dan Nagato akhirnya bekerja sama dengan Tobi dan mengubah tujuan akatsuki.");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
