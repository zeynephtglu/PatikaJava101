/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dowhileex;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class DoWhileEx {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int pass;
        boolean askPass=true;
        
        do {
            System.out.println("Şife giriniz: ");
            pass=s.nextInt();
            if(pass==123){
                System.out.println("doğru");
                askPass=false;
            }else{
                System.out.println("yanlış");
            }
            
        }while(askPass);
        
        }
    }

