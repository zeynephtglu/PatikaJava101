/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ucakbiletifiyatihesaplama;
import java.util.Scanner;
/**
 *
 * @author PC
 */

public class UcakBiletiFiyatiHesaplama {

    public static void main(String[] args) {
        int km, yas, yolculukTipi ;
        double ucret, indirim=0, total=0;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Gideceğiniz mesafe?");
        km=s.nextInt();
        if(km<0){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        System.out.println("Yaşınız?");
        yas=s.nextInt();
        if(yas<0){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        System.out.println("Yolculuk tipiniz nedir? (Tek yön ise 1, Gidiş-Dönüş ise 2 giriniz.)");
        yolculukTipi=s.nextInt();
        if(yolculukTipi!=1 && yolculukTipi!=2){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        
        ucret=km*0.10;
        System.out.println("İndirimsiz Ücret:"+ ucret);
        
        if(yas<12){
            indirim=ucret*0.50;
        }else if(yas<24){
            indirim=ucret*0.10;
        }else if(yas>65){
            indirim=ucret*0.30;
        }
        else if(yolculukTipi==2){
            indirim=ucret*0.20;
        }
        
        total=ucret-indirim;
                
        System.out.println("Toplam tutar: "+total);

    }
}

