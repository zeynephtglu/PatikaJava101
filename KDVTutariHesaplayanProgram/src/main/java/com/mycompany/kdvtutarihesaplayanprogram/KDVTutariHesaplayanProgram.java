/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kdvtutarihesaplayanprogram;
import java.util.Scanner;
/**
 *
 * @author Hotoğlu
 */
public class KDVTutariHesaplayanProgram {

    public static void main(String[] args) {
      double Tutar, kdvTurari1=0.18, kdvTutari2=0.08, kdvliTutar;
      Scanner s= new Scanner(System.in);
      System.out.println("Ürün fiyatını giriniz: ");
      Tutar = s.nextDouble();
      
      kdvliTutar= Tutar>0 && Tutar<1000 ? Tutar*kdvTurari1 : Tutar*kdvTutari2;
      System.out.println("Kdvli tutar:"+ kdvliTutar);
      

      

      
    }
}

