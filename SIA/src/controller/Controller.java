package controller;

import java.util.ArrayList;
import model.Dosen;
import model.DosenHonorer;
import model.DosenTetap;
import model.Karyawan;
import model.Mahasiswa;
import model.Doktor;
import model.Magister;
import model.Sarjana;
import model.MataKuliahAmbil;
import model.Staff;
import model.User;

public class Controller {

    public Controller(){

    }

    public String printUserData(String nama, ArrayList<User> list) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNama().equalsIgnoreCase(nama)) {
                found = true;
                index = i;
                break;
            }
        }
        String temp;
        if (!found) {
            return "User not found 404";
        } else {
            if (list.get(index) instanceof Doktor) {
                temp = "Status = Mahasiswa Doktor";
            } else if (list.get(index) instanceof Magister) {
                temp = "Status = Mahasiswa Magister";
            } else if (list.get(index) instanceof Sarjana) {
                temp = "Status = Mahasiswa Sarjana";
            } else if (list.get(index) instanceof DosenHonorer) {
                temp = "Status = Dosen Honorer";
            } else if (list.get(index) instanceof DosenTetap) {
                temp = "Status = Dosen Tetap";
            } else {
                temp = "Status = Karyawan";
            }
        }
        return list.get(index).toString() + temp;
    }
    
    public String printNilaiAkhir(String NIM, String kodeMk, ArrayList<User> listUser) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Mahasiswa) {
                Mahasiswa temp = (Mahasiswa) listUser.get(i);
                if (temp.getNim().equalsIgnoreCase(NIM)) {
                    found = true;
                    index = i;
                    break;
                }
            }
        }

        if (!found) {
            return "User not found 404";
        } else {
            Mahasiswa temp = (Mahasiswa) listUser.get(index);
            if (temp instanceof Doktor) {
                Doktor temp2 = (Doktor) temp;
                double total = (temp2.getNilSidang1() + temp2.getNilSidang2() + temp2.getNilSidang3()) / 3.0;
                return "Nilai Akhir : " + total;
            } else if (temp instanceof Magister) {
                Magister temp2 = (Magister) temp;
                for (int i = 0; i < temp2.getMataKuliahAmbil().size(); i++) {
                    if (temp2.getMataKuliahAmbil().get(i).getKode().equalsIgnoreCase(kodeMk)) {
                        double total = (temp2.getMataKuliahAmbil().get(i).getN1() + temp2.getMataKuliahAmbil().get(i).getN2() + temp2.getMataKuliahAmbil().get(i).getN3()) / 3.0;
                        return "Nilai Akhir : " + total;
                    }
                }
                return "Kode Matakuliah Not Found";
            } else if (temp instanceof Sarjana){
                Sarjana temp2 = (Sarjana) temp;
                for (int i = 0; i < temp2.getMataKuliahAmbil().size(); i++) {
                    if (temp2.getMataKuliahAmbil().get(i).getKode().equalsIgnoreCase(kodeMk)) {
                        double total = (temp2.getMataKuliahAmbil().get(i).getN1() + temp2.getMataKuliahAmbil().get(i).getN2() + temp2.getMataKuliahAmbil().get(i).getN3()) / 3.0;
                        return "Nilai Akhir : " + total;
                    }
                }
            }
            return "Kode Matakuliah Not Found";
        }
    }
    public String printRataNilai(String kodeMk, ArrayList<User> listUser) {
        double total = 0;
        int counter = 0;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Mahasiswa) {
                Mahasiswa temp = (Mahasiswa) listUser.get(i);
                if (temp instanceof Magister) {
                    Magister temp2 = (Magister) temp;
                    for (int j = 0; j < temp2.getMataKuliahAmbil().size(); j++) {
                        if (temp2.getMataKuliahAmbil().get(j).getKode().equalsIgnoreCase(kodeMk)) {
                            total += (temp2.getMataKuliahAmbil().get(j).getN1() + temp2.getMataKuliahAmbil().get(j).getN2() + temp2.getMataKuliahAmbil().get(j).getN3()) / 3.0;
                            counter++;
                        }
                    }
                } else if (temp instanceof Sarjana) {
                    Sarjana temp2 = (Sarjana) temp;
                    for (int j = 0; j < temp2.getMataKuliahAmbil().size(); j++) {
                        if (temp2.getMataKuliahAmbil().get(j).getKode().equalsIgnoreCase(kodeMk)) {
                            total += (temp2.getMataKuliahAmbil().get(j).getN1() + temp2.getMataKuliahAmbil().get(j).getN2() + temp2.getMataKuliahAmbil().get(j).getN3()) / 3.0;
                            counter++;
                        }
                    }
                }if (temp instanceof Doktor) {
                    Doktor temp2 = (Doktor) temp;
                    for (int j = 0; j < temp2.getMataKuliahAmbil().size(); j++) {
                        if (temp2.getMataKuliahAmbil().get(j).getKode().equalsIgnoreCase(kodeMk)) {
                            total += (temp2.getMataKuliahAmbil().get(j).getN1() + temp2.getMataKuliahAmbil().get(j).getN2() + temp2.getMataKuliahAmbil().get(j).getN3()) / 3.0;
                            counter++;
                        }
                    }
                }
            }
        }
        return "Rata-Rata Nilai Akhir : " + (total / counter);
    }

    public String printMahasiswaTidakLulus(String kodeMk, ArrayList<User> listUser) {
        int counter = 0;
        int counterMhs = 0;
        String namaMk = "";
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Mahasiswa) {
                counterMhs++;
                Mahasiswa temp = (Mahasiswa) listUser.get(i);
                if (temp instanceof Magister) {
                    Magister temp2 = (Magister) temp;
                    for (int j = 0; j < temp2.getMataKuliahAmbil().size(); j++) {
                        if (temp2.getMataKuliahAmbil().get(j).getKode().equalsIgnoreCase(kodeMk)) {
                            found = true;
                            namaMk = temp2.getMataKuliahAmbil().get(j).getNama();
                            double total = (temp2.getMataKuliahAmbil().get(j).getN1() + temp2.getMataKuliahAmbil().get(j).getN2() + temp2.getMataKuliahAmbil().get(j).getN3()) / 3.0;
                            if (total < 56) {
                                counter++;
                            }
                            break;
                        }

                    }
                } else if (temp instanceof Sarjana) {
                    Sarjana temp2 = (Sarjana) temp;
                    for (int j = 0; j < temp2.getMataKuliahAmbil().size(); j++) {
                        if (temp2.getMataKuliahAmbil().get(j).getKode().equalsIgnoreCase(kodeMk)) {
                            found = true;
                            namaMk = temp2.getMataKuliahAmbil().get(j).getNama();
                            double total = (temp2.getMataKuliahAmbil().get(j).getN1() + temp2.getMataKuliahAmbil().get(j).getN2() + temp2.getMataKuliahAmbil().get(j).getN3()) / 3.0;
                            if (total < 56) {
                                counter++;
                            }
                            break;
                        }
                    }
                }
            }
        }
        if (found) {
            return "<" + counter + "> dari <" + counterMhs + "> mahasiswa tidak lulus matakuliah <" + namaMk + ">";
        } else {
            return "Matakuliah tidak ditemukan";
        }
    }

    public String printMatkulAmbil(String NIM, ArrayList<User> listUser) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Mahasiswa) {
                Mahasiswa temp = (Mahasiswa) listUser.get(i);
                if (temp.getNim().equalsIgnoreCase(NIM)) {
                    found = true;
                    index = i;
                    break;
                }
            }
        }

        if (!found) {
            return "User Not Found 404";
        } else {
            Mahasiswa temp = (Mahasiswa) listUser.get(index);

            if (temp instanceof Doktor) {
                return "Mahasiswa Doktor tidak memiliki matakuliah yang diambil";
            } else if (temp instanceof Magister) {
                Magister temp2 = (Magister) temp;
                String output = "";
                for (int i = 0; i < temp2.getMataKuliahAmbil().size(); i++) {
                    output += "======" + temp2.getMataKuliahAmbil().get(i).getNama() + "======\n";
                    output += "List Presensi :\n";
                    for (int j = 0; j < temp2.getMataKuliahAmbil().get(i).getPresensiList().size(); j++) {
                        output += temp2.getMataKuliahAmbil().get(i).getPresensiList().get(j).getTanggal() + " " + temp2.getMataKuliahAmbil().get(i).getPresensiList().get(j).getStatus() + "\n";
                    }
                }
                return output;
            } else {
                Sarjana temp2 = (Sarjana) temp;
                String output = "";
                for (int i = 0; i < temp2.getMataKuliahAmbil().size(); i++) {
                    output += "======" + temp2.getMataKuliahAmbil().get(i).getNama() + "======\n";
                    output += "List Presensi :\n";
                    for (int j = 0; j < temp2.getMataKuliahAmbil().get(i).getPresensiList().size(); j++) {
                        output += temp2.getMataKuliahAmbil().get(i).getPresensiList().get(j).getTanggal() + " " + temp2.getMataKuliahAmbil().get(i).getPresensiList().get(j).getStatus() + "\n";
                    }
                }
                return output;

            }
        }
    }
        
    public String printTotalNgajar(String NIK, ArrayList<User> listUser){
        int index = 0;
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Dosen) {
                Dosen temp = (Dosen) listUser.get(i);
                if (temp.getNik().equalsIgnoreCase(NIK)) {
                    found = true;
                    index = i;
                    break;
                }
            }
        }
        
        if (!found){
            return "Dosen Tidak ditemukan";
        } else {
            Dosen temp = (Dosen) listUser.get(index);
            
            if (temp instanceof DosenHonorer){
                DosenHonorer temp2 = (DosenHonorer) temp;
                double total = 0;
                for (int i = 0; i < temp2.getListMkAjar().size(); i++) {
                    for (int j = 0; j < temp2.getListMkAjar().get(i).getPresensiList().size(); j++) {
                        if (temp2.getListMkAjar().get(i).getPresensiList().get(j).getStatus()==0){
                            total += temp2.getListMkAjar().get(i).getPresensiList().get(j).getJam();
                        }
                    }
                }
                
                return temp2.getNama() + " sudah mengajar dengan total " + total + " jam" ;
            } else {
                DosenTetap temp2 = (DosenTetap) temp;
                double total = 0;
                for (int i = 0; i < temp2.getListMkAjar().size(); i++) {
                    for (int j = 0; j < temp2.getListMkAjar().get(i).getPresensiList().size(); j++) {
                        if (temp2.getListMkAjar().get(i).getPresensiList().get(j).getStatus()==0){
                            total += temp2.getListMkAjar().get(i).getPresensiList().get(j).getJam();
                        }
                    }
                }
                
                return temp2.getNama() + " sudah mengajar dengan total " + total + " jam" ;
            }
        }
    }
    
    public String printGajiStaff(String NIK, ArrayList<User> listUser){
        int index = 0;
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Staff) {
                Staff temp = (Staff) listUser.get(i);
                if (temp.getNik().equalsIgnoreCase(NIK)) {
                    found = true;
                    index = i;
                    break;
                }
            }
        }
        if (!found){
            return "Staff tidak ditemukan";
        } else {
            Staff temp = (Staff) listUser.get(index);
            if (temp instanceof Karyawan){
                Karyawan temp2 = (Karyawan) temp;
                int unit = 0;
                for (int i = 0; i < temp2.getPresensiStaff().size(); i++) {
                    if (temp2.getPresensiStaff().get(i).getStatus()==0){
                        unit++;
                    }
                }
                double gaji = unit / 22.0 * temp2.getSalary();
                return "Gaji Karyawan = " + gaji;
            } else {
                Dosen temp2 = (Dosen) temp;
                if (temp2 instanceof DosenHonorer){
                    DosenHonorer temp3 = (DosenHonorer) temp2;
                    int unit = 0;
                    for (int i = 0; i < temp3.getListMkAjar().size(); i++) {
                        for (int j = 0; j < temp3.getListMkAjar().get(i).getPresensiList().size(); j++) {
                            if (temp3.getListMkAjar().get(i).getPresensiList().get(j).getStatus()==0){
                                unit++;
                            }
                        }  
                    }
                    double gaji = temp3.getHonorPerSKS() * unit;
                    return "Gaji Dosen Honorer = " + gaji;
                } else {
                    DosenTetap temp3 = (DosenTetap) temp2;
                    int unit = 0;
                    for (int i = 0; i < temp3.getListMkAjar().size(); i++) {
                        for (int j = 0; j < temp3.getListMkAjar().get(i).getPresensiList().size(); j++) {
                            if (temp3.getListMkAjar().get(i).getPresensiList().get(j).getStatus()==0){
                                unit++;
                            }
                        }  
                    }
                    double gaji = temp3.getSalary() + (unit * 25000);
                    return "Gaji Dosen Tetap = " + gaji;
                }
            } 
        }
    }
}
        
    
    
    


