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
public class Akatsuki {
    protected String nama;
    protected String asalNegara;
    protected String elemen;
    protected String jutsu;

//    protected String jabatan;
//    protected String usia;
//    protected String partnerKerja;

    public Akatsuki() {
        this.nama = " " ;
        this.asalNegara = " " ;
        this.elemen = " " ;
        this.jutsu = " " ;
    }

    public void tampilData() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Nama \t: "+nama);
        System.out.println("Asal Negara : "+asalNegara);
        System.out.println("Elemen \t: "+elemen);
        System.out.println("Jutsu\t: "+jutsu);
    }

    public void jabatan() {
        System.out.println("**"+nama +" adalah anggota Akatsuki");
    }

}