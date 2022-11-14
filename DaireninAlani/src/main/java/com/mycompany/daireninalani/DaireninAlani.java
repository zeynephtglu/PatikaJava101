/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.daireninalani;
import java.util.Scanner;
/**
 *
 * @author Hotoğlu
 */
public class DaireninAlani {

    public static void main(String[] args) {
        double r, 𝛼, 𝜋=3.14, alan;
        
        Scanner s= new Scanner(System.in);
        
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = s.nextDouble();
        
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        𝛼 = s.nextDouble();
        
        alan = (𝜋 * (r*r) * 𝛼) / 360;
        System.out.print("Dairenin alanı: "+ alan);
    }
}
