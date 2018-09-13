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
public class JasaAngkutBarang {
    public static void main(String[] args){
         String identitas = "Najwa Kusuma Mustafa / X RPL 5 / 28";
          System.out.println("identitas : " + identitas);
          
          Scanner scanner = new Scanner(System.in);
          String jenis[] = new String[]{"E", "B", "A", "D", "C"};
        int berat[] = new int[]{7, 5, 4, 3, 2};
        int bayaran[] = new int[]{10000, 7000, 5000, 3000, 2000};
        int harga;
        int total = 0;
        int jumlah;
        System.out.print("Masukkan berat barang : ");
        int barang = scanner.nextInt();
        
        for (int i = 0; i < jenis.length; i++){
            if(barang >= berat[i]){
                jumlah = barang / berat[i];
                barang = barang % berat[i];
                harga = jumlah * bayaran[i];
                total += harga;
                System.out.println("jenis " + jenis[i]+" sebanyak " +jumlah);
                System.out.println("Bayaran : Rp. "+harga);
            }
        }
        System.out.println("Total bayaran : Rp. "+ total);
    }
}
