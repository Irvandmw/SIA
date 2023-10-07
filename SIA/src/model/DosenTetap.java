/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Irvan
 */
public class DosenTetap extends Dosen{
    private double salary;

    public DosenTetap(double salary, String departemen, String nik, String nama, String alamat, String TTL, String telepon) {
        super(departemen, nik, nama, alamat, TTL, telepon);
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Nama: "+getNama()+
                "\nAlamat: "+getAlamat()+
                "\nTTL: "+getTempatTanggalLahir()+
                "\nNomor Telepon: "+getTelepon()+
                "\nNIK: "+getNik()+
                "\nDepartemen: "+getDepartemen()+
                "\nSalary: "+salary;
    }
}
