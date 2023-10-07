/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;
/**
 *
 * @author Irvan
 */
public class Sarjana extends Mahasiswa{
    
    private ArrayList<MataKuliahAmbil> mataKuliahAmbil = new ArrayList<>();

    public Sarjana(ArrayList mataKuliahAmbil, String nim, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(nim, jurusan, nama, alamat, TTL, telepon);
        this.mataKuliahAmbil = mataKuliahAmbil;
    }

    public ArrayList<MataKuliahAmbil> getMataKuliahAmbil() {
        return mataKuliahAmbil;
    }

    public void setMataKuliahAmbil(ArrayList<MataKuliahAmbil> mataKuliahAmbil) {
        this.mataKuliahAmbil = mataKuliahAmbil;
    }

    @Override
    public String toString() {
        return "Nama: "+getNama()+
                "\nAlamat: "+getAlamat()+
                "\nTTL: "+getTempatTanggalLahir()+
                "\nNomor Telepon: "+getTelepon()+
                "\nNIM: "+getNim()+
                "\nJurusan: "+getJurusan()+
                "\nMata Kuliah=" + mataKuliahAmbil;
    }
}
