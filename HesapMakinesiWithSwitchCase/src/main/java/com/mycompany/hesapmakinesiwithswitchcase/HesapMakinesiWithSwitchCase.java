/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hesapmakinesiwithswitchcase;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class HesapMakinesiWithSwitchCase {

    public static void main(String[] args) {
        int n1, n2, select;
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("İlk sayıyı giriniz: ");
        n1=s.nextInt();
        
        System.out.print("İkinci sayıyı giriniz: ");
        n2=s.nextInt();        
        
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.print("Seçiniz: ");
        select=s.nextInt();
        
        switch(select){
            case 1: 
                System.out.print("Toplam: "+ (n1+n2) );
                break;
            case 2:
                System.out.print("Çıkarma: "+ (n1-n2) );
                break;
            case 3:
                System.out.print("Çarpma: "+ (n1*n2) ); 
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Bir say 0'a bölünemez.");
                    default:
                        System.out.print("Bölme: "+ (n1/n2) ); 
                }
                break;
            default:
            System.out.print("Yanlış seçim girdiniz. Tekrar deneyiniz.");
                
                

                
                
        }
    }
}
