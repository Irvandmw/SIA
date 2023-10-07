/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Irvan
 */
public class DosenHonorer extends Dosen{
    private double honorPerSKS;

    public DosenHonorer(double honorPerSKS, String departemen, String nik, String nama, String alamat, String TTL, String telepon) {
        super(departemen, nik, nama, alamat, TTL, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }
    
    @Override
    public String toString(){
        return "Nama: "+getNama()+
                "\nAlamat: "+getAlamat()+
                "\nTTL: "+getTempatTanggalLahir()+
                "\nNomor Telepon: "+getTelepon()+
                "\nNIK: "+getNik()+
                "\nDepartemen: "+getDepartemen()+
                "\nHonor: "+honorPerSKS;
    } 
    
}
