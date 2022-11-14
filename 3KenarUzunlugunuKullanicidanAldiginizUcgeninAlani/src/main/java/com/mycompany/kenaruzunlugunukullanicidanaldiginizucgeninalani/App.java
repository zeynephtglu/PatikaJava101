/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kenaruzunlugunukullanicidanaldiginizucgeninalani;
import java.util.Scanner;
/**
 *
 * @author Hotoğlu
 */
public class App {

    public static void main(String[] args) {
        
        int a,b,c;
        double alan,u;
        Scanner s=new Scanner(System.in);
        
        System.out.print("Üçgenin 1.kenarını giriniz: ");
        a=s.nextInt();

        System.out.print("Üçgenin 2.kenarını giriniz: ");
        b=s.nextInt();

        System.out.print("Üçgenin 3.kenarını giriniz: ");
        c=s.nextInt();        
        
        u =(a+b+c)/2;
        
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Alan: "+ alan);

    }
}
