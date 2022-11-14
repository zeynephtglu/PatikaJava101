/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taksimetreprogrami;
import java.util.Scanner;
/**
 *
 * @author Hotoğlu
 */
public class TaksimetreProgrami {

    public static void main(String[] args) {
        int acilisUcreti=10;
        double gidilenKM, ucret,perKm=2.20;
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Kaç km yol gidildiğini yazınız: ");
        gidilenKM=s.nextDouble();
        
        ucret=acilisUcreti+(gidilenKM*perKm) ;
        
        ucret= (ucret<20)? 20 : ucret;
        
        System.out.print("Ücret: "+ ucret);
        
        
        
                
    }
}
