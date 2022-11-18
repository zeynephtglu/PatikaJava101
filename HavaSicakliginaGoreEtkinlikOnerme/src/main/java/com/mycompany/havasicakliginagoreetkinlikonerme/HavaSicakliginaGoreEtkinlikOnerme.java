/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.havasicakliginagoreetkinlikonerme;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class HavaSicakliginaGoreEtkinlikOnerme {

    public static void main(String[] args) {
        int heat;
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Havanın sıcaklığını giriniz: ");
        heat=s.nextInt();
        
        if(heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(heat<15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if(heat<25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
            
            
        }
    }
}
