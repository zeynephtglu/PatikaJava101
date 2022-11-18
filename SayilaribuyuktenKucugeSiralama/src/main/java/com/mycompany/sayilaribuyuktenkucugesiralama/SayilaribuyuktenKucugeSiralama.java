/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sayilaribuyuktenkucugesiralama;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class SayilaribuyuktenKucugeSiralama {

    public static void main(String[] args) {
        int a,b,c;
        
        Scanner s=new Scanner (System.in);
        
        System.out.println("İlk sayı: ");
        a=s.nextInt();
        System.out.println("İkinci sayı: ");
        b=s.nextInt();
        System.out.println("Üçüncü sayı: ");
        c=s.nextInt();
        
        if(a>b && a>c){
            if (b>c){
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }
        }else if(b>a && b>c){
            if(a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }
        }else if(c>a && c>b){
            if(a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }
            }
        }
            }
        
    

