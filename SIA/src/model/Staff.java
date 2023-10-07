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
public class Staff extends User{
    private String nik;
    private ArrayList<PresensiStaff> presensiStaff = new ArrayList<>();

    public Staff(String nik, String nama, String alamat, String tempatTanggalLahir, String telepon) {
        super(nama, alamat, tempatTanggalLahir, telepon);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    
    
    @Override
    public String toString(){
        return "Nama: "+getNama()+
                "\nAlamat: "+getAlamat()+
                "\nTTL: "+getTempatTanggalLahir()+
                "\nNomor Telepon: "+getTelepon()+
                "\nNIK: "+nik;
    }
}
