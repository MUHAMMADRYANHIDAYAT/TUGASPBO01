/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bmb
 */
import java.util.Scanner;

public class SOAL3 {
    public static void main(String[] args) {
        String nama,nim,semester,kelas;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Nama");
        nama = inputan.nextLine();
        System.out.println("Nama : "+nama);
        System.out.print("Maukkan Nim:");
        nim = inputan.nextLine();
        System.out.println("Nim :"+nim);
        System.out.print("Masukkan Semester");
        semester = inputan.nextLine();
        System.out.println("Semester : "+semester);
        System.out.println("Masukkan Kelas");
        kelas = inputan.nextLine();
        System.out.println("Kelas : "+kelas);
        
    }
}
