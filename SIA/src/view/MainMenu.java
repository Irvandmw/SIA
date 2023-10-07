/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import controller.Controller;
import main.Main;
/**
 *
 * @author Irvan
 */
public class MainMenu {
    public MainMenu() {
        showUserData();
    }
    
    private void showUserData(){
        boolean status = false;
        String nama,NIM,nik,kodeMk;
        Controller control = new Controller();   
            while (status == false){
                String pilihan = JOptionPane.showInputDialog(null, "1.Print user data\n2.Print Nilai Akhir\n3.Print rata-rata NA\n4.Jumlah mahasiswa yang tidak lulus\n5.Print ambil matkul\n6.Print total jumlah berapa jam seorang dosen\n7.Print gaji seorang staff");
                switch (pilihan){
                    case "1" :
                        nama = JOptionPane.showInputDialog(null, "Input nama yang dicari: ");
                        JOptionPane.showMessageDialog(null, control.printUserData(nama,Main.listUser));
                        break; 
                        
                    case "2" :
                        NIM = JOptionPane.showInputDialog(null, "Masukkan nim : ", JOptionPane.QUESTION_MESSAGE);
                        kodeMk = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ", JOptionPane.QUESTION_MESSAGE);
                        JOptionPane.showMessageDialog(null, control.printNilaiAkhir(NIM, kodeMk, Main.listUser));
                        break;
                        
                    case "3" :
                        kodeMk = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ", JOptionPane.QUESTION_MESSAGE);
                        JOptionPane.showMessageDialog(null, control.printRataNilai(kodeMk, Main.listUser));
                        break;
                    
                    case "4" :
                        kodeMk = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ", JOptionPane.QUESTION_MESSAGE);
                        JOptionPane.showMessageDialog(null, control.printMahasiswaTidakLulus(kodeMk, Main.listUser));
                        break;
                     
                    case "5" :
                        NIM = JOptionPane.showInputDialog(null, "Masukkan nim : ", JOptionPane.QUESTION_MESSAGE);
                        JOptionPane.showMessageDialog(null, control.printMatkulAmbil(NIM, Main.listUser));
                        break;    
                        
                    case "6" :
                        nik = JOptionPane.showInputDialog(null, "Masukkan NIK : ", JOptionPane.QUESTION_MESSAGE);
                        JOptionPane.showMessageDialog(null, control.printTotalNgajar(nik, Main.listUser));
                        break;   
                        
                    case "7" :
                        nik = JOptionPane.showInputDialog(null, "Masukkan NIK : ", JOptionPane.QUESTION_MESSAGE);
                        JOptionPane.showMessageDialog(null, control.printGajiStaff(nik, Main.listUser));
                        break;  
                        
                    case "8": 
                        status = true;
                    break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Input Error","", JOptionPane.ERROR_MESSAGE);
                        
                }
            
        }
    }
}
