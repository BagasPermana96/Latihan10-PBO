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
public class Zetsu extends Akatsuki {
    private final String partnerKerja;

    public Zetsu() {
        this.nama = "Zetsu";
        this.asalNegara = "-";
        this.elemen = "Kayu";
        this.jutsu = "menyerap cakra";
        this.partnerKerja = "Obito";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah mata-mata Akatsuki. Zetsu terdiri dari zetsu hitam dan putih, " +
                "\n sehingga membuatnya memiliki dua kepribadian. Kanibal. Zetsu Hitam diciptakan oleh Kaguya");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
