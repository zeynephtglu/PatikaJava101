/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dikucgendehipotenusbulanprogram;
import java.util.Scanner;
/**
 *
 * @author Hotoğlu
 */
public class DikUcgendeHipotenusBulanProgram {

    public static void main(String[] args) {
        int kenar1, kenar2;
        double hipotenus; 
        Scanner s=new Scanner(System.in);
        
        System.out.print("kenar1'i giriniz: ");
        kenar1 = s.nextInt();
        
        System.out.print("Diğer kenarı giriniz: ");
        kenar2 = s.nextInt();   
        
        hipotenus = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2)); //Math.sqrt()=karekök alma yöntemi
        System.out.print("hipotenüs: "+ hipotenus);
        
    }
}
