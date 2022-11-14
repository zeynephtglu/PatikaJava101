/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.notortalamasihesaplayanprogram;
import java.util.Scanner;
/**
 *
 * @author Hotoğlu
 */
public class NotOrtalamasiHesaplayanProgram {

    public static void main(String[] args) {
        
    int mat, fizik, kimya,turkce,tarih,muzik;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Mat notunuzu giriniz:");
        mat = s.nextInt();
        
        System.out.print("fizik notunuzu giriniz: ");
        fizik = s.nextInt();
        
        System.out.print("kimya notunuzu giriniz: ");
        kimya = s.nextInt();
        
        System.out.print("turkce notunuzu giriniz: ");
        turkce = s.nextInt();
        
        System.out.print("tarih notunuzu giriniz: ");
        tarih = s.nextInt();
        
        System.out.print("muzik notunuzu giriniz: ");
        muzik = s.nextInt();
        
        int toplam = mat + fizik +  kimya + turkce + tarih + +muzik;
        double ortalama = toplam/6;
        System.out.println("Ortalamanız: " + ortalama);
        
        String sonuc = ortalama>60 ? "Geçtiniz" : "Kaldınız" ;
        System.out.print(sonuc);
    }
}
