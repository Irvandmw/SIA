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
public class MataKuliahAjar extends MataKuliah{
    private MataKuliah mataKuliah;
    private ArrayList<PresensiStaff> presensiList = new ArrayList<PresensiStaff>();

    public MataKuliahAjar(MataKuliah mataKuliah, String kode, String SKS, String nama, ArrayList<PresensiStaff> presensiList) {
        super(kode, SKS, nama);
        this.mataKuliah = mataKuliah;
        this.presensiList = presensiList;
    }

    public ArrayList<PresensiStaff> getPresensiList() {
        return presensiList;
    }

    public void setPresensiList(ArrayList<PresensiStaff> presensiList) {
        this.presensiList = presensiList;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    

    @Override
    public String toString() {
        return "MataKuliah=" + mataKuliah;
    }
    
}
