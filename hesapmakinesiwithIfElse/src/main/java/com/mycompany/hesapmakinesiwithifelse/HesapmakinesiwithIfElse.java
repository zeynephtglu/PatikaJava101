/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hesapmakinesiwithifelse;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class HesapmakinesiwithIfElse {

    public static void main(String[] args) {
        int n1, n2, select;
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("İlk sayıyı giriniz: ");
        n1=s.nextInt();
        
        System.out.print("İkinci sayıyı giriniz: ");
        n2=s.nextInt();        
        
        // System.out.print(n1 + "-" +n2); (kod çalışıyor mu kontrolü)
        
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.print("Seçiniz: ");
        select=s.nextInt();
        
        //System.out.print(select); (kod çalışıyor mu kontrolü)
        
        if(select==1) {
            System.out.print("Toplam: "+ (n1+n2) );
        } else if (select==2){
            System.out.print("Çıkarma: "+ (n1-n2) );
        } else if (select==3){
            System.out.print("Çarpma: "+ (n1*n2) );  
        }else if (select==4){
            if(n2!=0){
            System.out.print("Bölme: "+ (n1/n2) );  
            }else{
            System.out.println("Bir say 0'a bölünemez.");
            }
        }else{
            System.out.print("Yanlış seçim girdiniz. Tekrar deneyiniz.");  
            
       
        
            
            

        } 
        
        


    }
}
