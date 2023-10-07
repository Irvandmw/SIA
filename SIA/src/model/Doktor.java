/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Irvan
 */
public class Doktor extends Mahasiswa{
    private String judulPenelitian;
    private double nilSidang1;
    private double nilSidang2;
    private double nilSidang3;
    private ArrayList<MataKuliahAmbil> mataKuliah = new ArrayList<>();

    public Doktor(ArrayList mataKuliah, String nim, String jurusan, String nama, String alamat, String TTL, String telepon,
            String judulPenelitian, double nilSidang1, double nilSidang2, double nilSidang3) {
        super(nim, jurusan, nama, alamat, TTL, telepon);
        this.judulPenelitian = judulPenelitian;
        this.nilSidang1 = nilSidang1;
        this.nilSidang2 = nilSidang2;
        this.nilSidang3 = nilSidang3;
        this.mataKuliah = mataKuliah;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    public double getNilSidang1() {
        return nilSidang1;
    }

    public void setNilSidang1(double nilSidang1) {
        this.nilSidang1 = nilSidang1;
    }

    public double getNilSidang2() {
        return nilSidang2;
    }

    public void setNilSidang2(double nilSidang2) {
        this.nilSidang2 = nilSidang2;
    }

    public double getNilSidang3() {
        return nilSidang3;
    }

    public void setNilSidang3(double nilSidang3) {
        this.nilSidang3 = nilSidang3;
    }

    public ArrayList<MataKuliahAmbil> getMataKuliahAmbil() {
        return mataKuliah;
    }

    public void setMataKuliah(ArrayList<MataKuliahAmbil> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public String toString() {
        return "Nama: "+getNama()+
                "\nAlamat: "+getAlamat()+
                "\nTTL: "+getTempatTanggalLahir()+
                "\nNomor Telepon: "+getTelepon()+
                "\nNIM: "+getNim()+
                "\nJurusan: "+getJurusan()+
                "\nMata Kuliah=" + mataKuliah+
                "\nJudul Penelitian: "+judulPenelitian;
    }
}
