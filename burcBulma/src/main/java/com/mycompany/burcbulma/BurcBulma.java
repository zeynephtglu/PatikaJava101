/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.burcbulma;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class BurcBulma {

    public static void main(String[] args) {
       int month, day;
       String burc = " ";
       boolean isError = false;
       
       Scanner s=new Scanner(System.in);
       
        System.out.println("Doğduğunuz ay? ");
        month=s.nextInt();
        
        System.out.println("Doğduğunuz gün? ");
        day=s.nextInt();
        
        switch (month) {
            case 1:
                
                if(day>1 && day<31){
                    if(day<22){
                    burc= "Oğlak";
                }else{
                    System.out.println("Kova");
                    }
                }else{
                      isError= true;
                }
                break;
            default:
                System.out.println("Hatalı ay girdiniz.");
            case 2:
                
        }
    }
}
