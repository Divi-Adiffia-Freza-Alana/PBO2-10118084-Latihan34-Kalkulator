/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk Kalkulator

 */
public class PBO210118084Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
         Scanner Scanner = new Scanner (System.in);
         System.out.println("Masukkan Angka ke -1 :");
         kalkulator.value1= Scanner.nextDouble();
         System.out.println("Masukkan Angka ke -2 :");
         kalkulator.value2 = Scanner.nextDouble();
         
         System.out.println("Hasil Pertambahan : "+kalkulator.tambahBilangan());
         System.out.println("Hasil Pengurangan : "+kalkulator.kurangBilangan());
         System.out.println("Hasil Perkalian   : "+kalkulator.kaliBilangan());
         System.out.println("Hasil Pembagian   : "+kalkulator.bagiBilangan());
         System.out.println("Hasi Sisa Bagi    : "+kalkulator.sisaBilangan());
    }
    
}
