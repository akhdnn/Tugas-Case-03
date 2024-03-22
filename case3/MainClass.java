package case3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner dan = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        System.out.print("Masukan Nama: ");
        String nim = dan.nextLine();
        System.out.print("Masukan NIM: ");
        String nama = dan.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama);
        listMahasiswa.add(mahasiswa);

        ArrayList<MataKuliah> listMataKuliah = new ArrayList<>();
        while (true) {
            System.out.print("Masukkan kode mata kuliah: ");
            String kode = dan.nextLine();

            System.out.print("Masukkan nama mata kuliah: ");
            String namaMK = dan.nextLine();

            System.out.print("Masukkan nilai angka: ");
            int nilaiAngka = dan.nextInt();
            dan.nextLine();
            listMataKuliah.add(new MataKuliah(kode, namaMK, nilaiAngka));

            System.out.println("Apakah Anda ingin menambahkan mata kuliah lagi? (iya/tidak)");
            String input = dan.nextLine();

            if (!input.equalsIgnoreCase("iya")) {
                break;
            }
        }

        System.out.println("\nKHS:");
        System.out.println("Name: " + mahasiswa.nama);
        System.out.println("NIM: " + mahasiswa.nim);
        System.out.printf("%-10s %-30s %-10s\n", "Kode", "Mata Kuliah", "Grade");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < listMataKuliah.size(); i++) {
            System.out.printf("%-10s %-30s %-10s\n", listMataKuliah.get(i).kode, listMataKuliah.get(i).namaMk, listMataKuliah.get(i).nilaiHuruf);
        }
    }
}