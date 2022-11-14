/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manavkasaprogrami;
import java.util.Scanner;
/**
 *
 * @author Hotoğlu
 */
public class ManavKasaProgrami {

    public static void main(String[] args) {
        double armutFiyat,armutKg, elmaFiyat ,elmaKg, domatesFiyat ,domatesKg, muzFiyat,muzKg, patlicanFiyat,patlicanKg,toplam ;
        Scanner s=new Scanner(System.in);
               
        System.out.println("Armut Kaç Kilo ?");
        armutKg=s.nextDouble();
        armutFiyat=armutKg*2.14;
        
        System.out.println("Elma Kaç Kilo ?");
        elmaKg=s.nextDouble();
        elmaFiyat=3.67*elmaKg;
        
        System.out.println("domates Kaç Kilo ?");
        domatesKg=s.nextDouble();
        domatesFiyat=1.11*domatesKg;
        
        System.out.println("muz Kaç Kilo ?");
        muzKg=s.nextDouble();
        muzFiyat=0.95*muzKg;
                
        System.out.println("patlıcan Kaç Kilo ?");
        patlicanKg=s.nextDouble();
        patlicanFiyat=5.00*patlicanKg;
                
        toplam=patlicanFiyat+muzFiyat+domatesFiyat+elmaFiyat+armutFiyat;
        System.out.println("Toplam: "+ toplam);
       
    }
}
