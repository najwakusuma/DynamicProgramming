/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Uang {
    public static void main(String[] args){
         String identitas = "Najwa Kusuma Mustafa / X RPL 5 / 28";
          System.out.println("identitas : " + identitas);
          
          Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang : ");
        int uang = scanner.nextInt();
        int pecahan[] = new int[]{5000, 2000, 1000, 500, 100};
        int jumlah;
        
        for (int i = 0; i < pecahan.length; i++){
            if(uang >= pecahan[i]){
                jumlah = uang / pecahan[i];
                uang = uang % pecahan[i];
                System.out.println("pecahan " + pecahan[i]+" sebanyak " +jumlah+" keping");
            }
        }
    }
}
