/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sinifigecmedurumu;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class SinifiGecmeDurumu {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,sosyal;
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Matematik notunuz: ");
        mat=s.nextInt();
        System.out.println("fizik notunuz: ");
        fizik=s.nextInt();        
        System.out.println("kimya notunuz: ");
        kimya=s.nextInt();        
        System.out.println("turkçe notunuz: ");
        turkce=s.nextInt();        
        System.out.println("sosyal notunuz: ");
        sosyal=s.nextInt();      
        
        if (mat>0 && mat<100 && fizik>0 && fizik<100 && turkce>0 && turkce<100 && kimya>0 && kimya<100 && sosyal>0 && sosyal<100 ){
            double avarage= (mat+fizik+kimya+turkce+sosyal/5); 
            System.out.print("Ortalamanız: "+ avarage);
            
                 if(avarage<=55){
                 System.out.println("Sınıfta kaldınız.");
                 }else {
                     System.out.println("Geçtiniz.");
                      }
            }
    }
}
