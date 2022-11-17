/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kullanicigirisi;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class KullaniciGirisi {

    public static void main(String[] args) {
        String userName, password, sifreYenileme,yeniSifre;
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Kullanıcı adınız: ");
        userName= s.nextLine();
        
        System.out.print("Şifreniz: ");
        password=s.nextLine();
        
        if (userName.equals("patika")&& password.equals("java123")) {  //(userName=="patika") char için hatalı bunun yerine .equals kullanılır
            System.out.println("Giriş yaptınız.");
        }else{
            System.out.println("Hatalı giriş. Şifrenizi yenilemek ister misiniz? evet/hayır");
            sifreYenileme=s.nextLine();
            if(sifreYenileme.equals("evet"));
            System.out.println("Yeni şifreyi giriniz: ");
            yeniSifre=s.nextLine();
               if(yeniSifre.equals("java123")){
                   System.out.println("Yeni şifre eskisi ile aynı olamaz. Şifre oluşturulamadı, lütfen başka şifre giriniz.");
               }else{
                   System.out.println("Şifre oluşturuldu");
               }
                   
            
            
                
                    
        }
            
        }

        
    }


