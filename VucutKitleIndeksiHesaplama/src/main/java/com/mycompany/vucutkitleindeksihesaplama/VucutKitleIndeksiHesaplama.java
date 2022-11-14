/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vucutkitleindeksihesaplama;
import java.util.Scanner;
/**
 *
 * @author Hotoğlu
 */
public class VucutKitleIndeksiHesaplama {

    public static void main(String[] args) {
        double boy,kilo,vki;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Boyunuzu (metre cinsinde) giriniz: ");
        boy = s.nextDouble();
        System.out.println("Kilonuzu (kg cinsinde) giriniz: ");
        kilo = s.nextDouble();
        
        vki= kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz: "+ vki);

       
    }
}
