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
public class Dosen extends Staff{
    private ArrayList<MataKuliahAjar> listMkAjar = new ArrayList<MataKuliahAjar>();
    private String departemen;

    public Dosen(String departemen, String nik, String nama, String alamat, String TTL, String telepon) {
        super(nik, nama, alamat, TTL, telepon);
        this.departemen = departemen;
    }

    public ArrayList<MataKuliahAjar> getListMkAjar() {
        return listMkAjar;
    }

    public void setListMkAjar(ArrayList<MataKuliahAjar> listMkAjar) {
        this.listMkAjar = listMkAjar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    
    
    
    @Override
    public String toString(){
        return "Nama: "+getNama()+
                "\nAlamat: "+getAlamat()+
                "\nTTL: "+getTempatTanggalLahir()+
                "\nNomor Telepon: "+getTelepon()+
                "\nNIK: "+getNik()+
                "\nDepartemen: "+departemen;
    }
}
