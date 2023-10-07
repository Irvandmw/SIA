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
public class Magister extends Mahasiswa{

    private ArrayList<MataKuliahAmbil> mataKuliah = new ArrayList<>();
    private String judulPenelitianTesis;

    public Magister(ArrayList mataKuliah, String judulPenelitianTesis, String nim, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(nim, jurusan, nama, alamat, TTL, telepon);
        this.judulPenelitianTesis = judulPenelitianTesis;
        this.mataKuliah = mataKuliah;
    }

    public ArrayList<MataKuliahAmbil> getMataKuliahAmbil() {
        return mataKuliah;
    }

    public void setMataKuliah(ArrayList<MataKuliahAmbil> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }
    
    @Override
    public String toString() {
        return "Nama: "+getNama()+
                "\nAlamat: "+getAlamat()+
                "\nTTL: "+getTempatTanggalLahir()+
                "\nNomor Telepon: "+getTelepon()+
                "\nNIM: "+getNim()+
                "\nJurusan: "+getJurusan()+
                "\nMata Kuliah=" + mataKuliah+
                "\nJudul Penelitian: "+judulPenelitianTesis;
    }
}
