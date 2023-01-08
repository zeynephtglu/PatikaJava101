/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.girilensayilardante;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GirilenSayilardante {

    public static void main(String[] args) {
        int total=0, num;
        Scanner s=new Scanner(System.in);
        
        do{
            System.out.println("Bir sayı giriniz: ");
            num=s.nextInt();
            if(num%4==0){
            total+=num;
            }
        }while(num%2==0);
        
        System.out.println(total);
    }
}
