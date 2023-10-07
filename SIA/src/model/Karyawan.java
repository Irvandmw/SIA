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
public class Karyawan extends Staff{
    double salary;

    public Karyawan(double salary, String nik, String nama, String alamat, String tempatTanggalLahir, String telepon) {
        super(nik, nama, alamat, tempatTanggalLahir, telepon);
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
                "\nSalary: "+salary+
                "\nPresensi: "+getPresensiStaff();
    }
}
