/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan22.perhitunganlingkaran;

import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Perhitungan lingkaran
 */
public class PBOIF11K10118905Latihan22PerhitunganLingkaran {

   public static final float PHI =(float)3.14;
   
   public static boolean isInteger(String s) {
        try {
        Integer.parseInt(s);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }
   
   public static void hitungLingkaran(float diameter){
       float jarijari, luas, keliling ;
       jarijari = diameter / 2;
       keliling = PHI * diameter;
       luas = (float) Math.pow(jarijari, 2)* PHI;
       
       
       System.out.println("====== Hasil Perhitungan Lingkaran ======");
       System.out.println(String.format("jari-jari lingkaran = %.2f cm",jarijari));
       System.out.println(String.format("Luas Lingkaran \t\t= %2f cm", luas));
       System.out.println(String.format("Keliling lingkaran\t= %.2f cm", keliling));
       
   }
    
public static void main(String [] args){
    System.out.println("======= Perhitungan Lingkaran =======");
    System.out.println("Masukkan nilai diameter lingkaran:");
    Scanner scanner = new Scanner(System.in);
    String diameter = scanner.nextLine();
    
    while (!isInteger(diameter)){
        System.out.println("Nilai diameter tidak sesuai!");
        System.out.println("\nMasukkan nilai diameter lingkaran:");
        diameter = scanner.nextLine();
    }
    hitungLingkaran(Float.valueOf(diameter));
   
   }
    
}
