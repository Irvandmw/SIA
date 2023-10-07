/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Irvan
 */
public class MataKuliahPillihan extends MataKuliah{
    private int jumlahMinimMhs;

    public MataKuliahPillihan(int jumlahMinimMhs, String kode, String SKS, String nama) {
        super(kode, SKS, nama);
        this.jumlahMinimMhs = jumlahMinimMhs;
    }

    public int getJumlahMinimMhs() {
        return jumlahMinimMhs;
    }

    public void setJumlahMinimMhs(int jumlahMinimMhs) {
        this.jumlahMinimMhs = jumlahMinimMhs;
    }
    public String toString() {
        return "Kode=" + getKode() + 
                "\nSKS=" + getSKS() + 
                "\nNama=" + getNama()+
                "\nJumlah Minim: "+jumlahMinimMhs;
    }
}
