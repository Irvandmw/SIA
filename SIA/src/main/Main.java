/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Doktor;
import model.DosenHonorer;
import model.DosenTetap;
import model.InterfaceStatus;
import model.Karyawan;
import model.Magister;
import model.MataKuliah;
import model.MataKuliahAmbil;
import model.Presensi;
import model.PresensiStaff;
import model.Sarjana;
import model.User;
import view.MainMenu;
/**
 *
 * @author Irvan
 */
public class Main {
    
    public static ArrayList<User> listUser = new ArrayList<>();    
    public void main() {
        
        User user = new User("Irvan", "Pajajaran", "Surabaya", "0880");
//        System.out.println(user.toString());
//        System.out.println("");
        // Data Dummy Mahasiswa Sarjana
        ArrayList<MataKuliahAmbil> mataKuliahSarjana1 = new ArrayList<>();
        mataKuliahSarjana1.add(new MataKuliahAmbil(80, 85, 88, "MK001", "3", "Matematika Dasar", new ArrayList<Presensi>()));
        mataKuliahSarjana1.add(new MataKuliahAmbil(75, 90, 92, "MK002", "4", "Fisika Dasar", new ArrayList<Presensi>()));

        ArrayList<Presensi> presensiList1MK1 = new ArrayList<>();
        presensiList1MK1.add(new Presensi("2023-09-28", InterfaceStatus.HADIR));
        presensiList1MK1.add(new Presensi("2023-09-29", InterfaceStatus.HADIR));

        ArrayList<Presensi> presensiList1MK2 = new ArrayList<>();
        presensiList1MK2.add(new Presensi("2023-09-28", InterfaceStatus.HADIR));
        presensiList1MK2.add(new Presensi("2023-09-29", InterfaceStatus.ALPHA));

        mataKuliahSarjana1.get(0).setPresensiList(presensiList1MK1);
        mataKuliahSarjana1.get(1).setPresensiList(presensiList1MK2);

        Sarjana sarjana1 = new Sarjana(mataKuliahSarjana1, "1234567890", "Teknik Informatika", "John Doe", "Jl. Raya No. 123", "01/01/1990", "1234567890");
//        System.out.println(sarjana1);
//        System.out.println("");

        ArrayList<MataKuliahAmbil> mataKuliahSarjana2 = new ArrayList<>();
        mataKuliahSarjana2.add(new MataKuliahAmbil(85, 88, 90, "MK003", "3", "Kimia Dasar", new ArrayList<Presensi>()));
        mataKuliahSarjana2.add(new MataKuliahAmbil(78, 92, 87, "MK004", "4", "Biologi Dasar", new ArrayList<Presensi>()));

        ArrayList<Presensi> presensiList2MK1 = new ArrayList<>();
        presensiList2MK1.add(new Presensi("2023-09-28", InterfaceStatus.HADIR));
        presensiList2MK1.add(new Presensi("2023-09-29", InterfaceStatus.HADIR));

        ArrayList<Presensi> presensiList2MK2 = new ArrayList<>();
        presensiList2MK2.add(new Presensi("2023-09-28", InterfaceStatus.HADIR));
        presensiList2MK2.add(new Presensi("2023-09-29", InterfaceStatus.ALPHA));

        mataKuliahSarjana2.get(0).setPresensiList(presensiList2MK1);
        mataKuliahSarjana2.get(1).setPresensiList(presensiList2MK2);

        Sarjana sarjana2 = new Sarjana(mataKuliahSarjana2, "9876543210", "Kimia", "Jane Smith", "Jl. ABC No. 456", "02/02/1995", "9876543210");
//        System.out.println(sarjana2);
//        System.out.println("");
        
        
        ArrayList<Presensi> presensiMK1 = new ArrayList<>();
        presensiMK1.add(new Presensi("2023-09-28", InterfaceStatus.HADIR));
        presensiMK1.add(new Presensi("2023-09-29", InterfaceStatus.HADIR));
        ArrayList<Presensi> presensiMK2 = new ArrayList<>();
        presensiMK2.add(new Presensi("2023-09-28", InterfaceStatus.HADIR));
        presensiMK2.add(new Presensi("2023-09-29", InterfaceStatus.HADIR));
        ArrayList<MataKuliahAmbil> mataKuliahMagister1 = new ArrayList<>();
        mataKuliahMagister1.add(new MataKuliahAmbil(80, 85, 90, "MK101", "3", "Metode Penelitian", presensiMK1));
        mataKuliahMagister1.add(new MataKuliahAmbil(75, 88, 92, "MK102", "4", "Statistik Lanjutan", presensiMK2));

        Magister magister1 = new Magister(mataKuliahMagister1, "Dampak Media Sosial terhadap Masyarakat", "1234567890", "Sosiologi", "Alice Johnson", "Jl. XYZ No. 789", "03/03/1988", "5555555555");
//        System.out.println(magister1);
//        System.out.println("");

        
        ArrayList<Presensi> presensiMK3 = new ArrayList<>();
        presensiMK3.add(new Presensi("2023-09-28", InterfaceStatus.HADIR));
        presensiMK3.add(new Presensi("2023-09-29", InterfaceStatus.HADIR));
        ArrayList<Presensi> presensiMK4 = new ArrayList<>();
        presensiMK4.add(new Presensi("2023-09-28", InterfaceStatus.HADIR));
        presensiMK4.add(new Presensi("2023-09-29", InterfaceStatus.HADIR));
        ArrayList<MataKuliahAmbil> mataKuliahMagister2 = new ArrayList<>();
        mataKuliahMagister2.add(new MataKuliahAmbil(85, 90, 92, "MK103", "3", "Manajemen Proyek", presensiMK3));
        mataKuliahMagister2.add(new MataKuliahAmbil(78, 88, 91, "MK104", "4", "Pemasaran Digital", presensiMK4));

        Magister magister2 = new Magister(mataKuliahMagister2, "Strategi Pemasaran Online", "9876543210", "Manajemen", "Bob Wilson", "Jl. PQR No. 101", "04/04/1992", "7777777777");
//        System.out.println(magister2);
//        System.out.println("");

        
        // Data Dummy Mahasiswa Doktor
        ArrayList<MataKuliahAmbil> mataKuliahDoktor1 = new ArrayList<>();
        mataKuliahDoktor1.add(new MataKuliahAmbil(90, 85, 88, "MK201", "3", "Metodologi Penelitian Lanjutan", presensiMK1));
        mataKuliahDoktor1.add(new MataKuliahAmbil(88, 92, 90, "MK202", "4", "Analisis Data Kompleks", presensiMK2));

        Doktor doktor1 = new Doktor(mataKuliahDoktor1, "1234567890", "Ilmu Komputer", "Dr. James Brown", "Jl. MNO No. 222", "05/05/1980", "9999999999",
            "Pengembangan Algoritma Kecerdasan Buatan", 3.2, 3, 4);

//        System.out.println(doktor1);
//        System.out.println("");
        
        ArrayList<MataKuliahAmbil> mataKuliahDoktor2 = new ArrayList<>();
        mataKuliahDoktor2.add(new MataKuliahAmbil(85, 90, 87, "MK203", "3", "Biomedis Lanjutan", presensiMK1));
        mataKuliahDoktor2.add(new MataKuliahAmbil(92, 88, 86, "MK204", "4", "Teknik Genetika", presensiMK2));

        Doktor doktor2 = new Doktor(mataKuliahDoktor2, "9876543210", "Biomedis", "Dr. Emily Davis", "Jl. GHI No. 333", "06/06/1975", "8888888888",
            "Studi Genetika pada Penyakit Alzheimer", 4, 3.5, 3);

//        System.out.println(doktor2);
//        System.out.println("");

        // Data Dummy Karyawan 1
        ArrayList<PresensiStaff> presensiKaryawan1 = new ArrayList<>();
        presensiKaryawan1.add(new PresensiStaff("2023-09-28", InterfaceStatus.HADIR, 8));
        presensiKaryawan1.add(new PresensiStaff("2023-09-29", InterfaceStatus.HADIR, 8));
        Karyawan karyawan1 = new Karyawan(5000.0, "K001", "John Smith", "Jl. ABC No. 123", "01/01/1990", "5551234");
//        System.out.println(karyawan1);
//        System.out.println("");

        // Data Dummy Karyawan 2
        ArrayList<PresensiStaff> presensiKaryawan2 = new ArrayList<>();
        presensiKaryawan2.add(new PresensiStaff("2023-09-28", InterfaceStatus.HADIR, 8));
        presensiKaryawan2.add(new PresensiStaff("2023-09-29", InterfaceStatus.ALPHA, 0));
        Karyawan karyawan2 = new Karyawan(5500.0, "K002", "Jane Doe", "Jl. XYZ No. 456", "02/02/1995", "5555678");
//        System.out.println(karyawan2);
//        System.out.println("");

        
        // Data Dummy Dosen Tetap
        DosenTetap dosenTetap1 = new DosenTetap(8000.0, "Informatika", "DT001", "Dr. Sarah Anderson", "Jl. PQR No. 789", "03/03/1975", "555-1111");
//        System.out.println(dosenTetap1);
//        System.out.println("");

        DosenTetap dosenTetap2 = new DosenTetap(8500.0, "Manajemen", "DT002", "Prof. Michael Johnson", "Jl. LMN No. 456", "04/04/1968", "555-2222");
//        System.out.println(dosenTetap2);
//        System.out.println("");

        // Data Dummy Dosen Honorer
        DosenHonorer dosenHonorer1 = new DosenHonorer(500.0, "Biologi", "DH001", "Mia Davis", "Jl. XYZ No. 101", "05/05/1980", "555-3333");
//        System.out.println(dosenHonorer1);
//        System.out.println("");

        DosenHonorer dosenHonorer2 = new DosenHonorer(550.0, "Kimia", "DH002", "Dr. Robert Wilson", "Jl. ABC No. 202", "06/06/1972", "555-4444");
//        System.out.println(dosenHonorer2);
//        System.out.println("");
        listUser.add(sarjana1);
        listUser.add(sarjana2);
        listUser.add(magister1);
        listUser.add(magister2);
        listUser.add(doktor1);
        listUser.add(doktor2);
        listUser.add(karyawan1);
        listUser.add(karyawan2);
        listUser.add(dosenTetap1);
        listUser.add(dosenTetap2);
        listUser.add(dosenHonorer1);
        listUser.add(dosenHonorer2);

        new MainMenu();
    }


    public static void main(String[] args) {
        Main run = new Main();
        run.main();
    }
    
}
