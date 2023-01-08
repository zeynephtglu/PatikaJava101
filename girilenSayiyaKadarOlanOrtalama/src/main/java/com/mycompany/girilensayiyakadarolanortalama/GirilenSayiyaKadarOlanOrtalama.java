/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.girilensayiyakadarolanortalama;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GirilenSayiyaKadarOlanOrtalama {

    public static void main(String[] args) {
int sayi,count=0,sum=0;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        sayi=s.nextInt();
        
        for(int i=1; i<=sayi; i++){
            if(i%3==0 && i%4==0){
                sum+=i;
                count++;
            }
        }
        double result=sum/count;
        System.out.println(result);
    }
}
