/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Irvan
 */
public class PresensiStaff extends Presensi {
    private int jam;

    public PresensiStaff(String tanggal, int status, int jam) {
        super(tanggal,status);
        this.jam = jam;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
    
    @Override
    public String toString() {
        return "Tanggal: " + getTanggal() + 
                "\nStatus:" + getStatus()+
                "\nJam: " + jam;
    }
}
