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
public class MataKuliahAmbil extends MataKuliah{
    private int n1,n2,n3;
    private ArrayList<Presensi> presensiList = new ArrayList<Presensi>();

    public MataKuliahAmbil(int n1, int n2, int n3, String kode, String SKS, String nama, ArrayList<Presensi> listPresensi) {
        super(kode, SKS, nama);
        this.presensiList = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public ArrayList<Presensi> getPresensiList() {
        return presensiList;
    }

    public void setPresensiList(ArrayList<Presensi> presensiList) {
        this.presensiList = presensiList;
    }

    @Override
    public String toString() {
        return "MataKuliah=" + getNama() + 
                "\nN1=" + n1 + 
                "\nN2=" + n2 + 
                "\nN3=" + n3 + 
                "\nPresensi List=" + presensiList;
    }

    

    
}
