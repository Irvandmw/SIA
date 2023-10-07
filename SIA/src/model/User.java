/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Irvan
 */
public class User {
    private String nama;
    private String alamat;
    private String tempatTanggalLahir;
    private String telepon;

    public User(String nama, String alamat, String tempatTanggalLahir, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatTanggalLahir = tempatTanggalLahir;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTempatTanggalLahir() {
        return tempatTanggalLahir;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTempatTanggalLahir(String tempatTanggalLahir) {
        this.tempatTanggalLahir = tempatTanggalLahir;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    @Override
    public String toString(){
        return "Nama: "+nama+"\nAlamat: "+alamat+"\nTTL: "+tempatTanggalLahir+"\nNomor Telepon: "+telepon;
    }
    
}
