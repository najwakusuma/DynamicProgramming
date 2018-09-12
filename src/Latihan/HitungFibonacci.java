/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class HitungFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void tampilJudul(String identitas) {
        // TODO code application logic here
        System.out.println("identitas : " + identitas);
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main(String[] args){
        String identitas = "Najwa Kusuma Mustafa / X RPL 5 / 28";
        tampilJudul(identitas);
    }
    private static int tampilInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan ke-: ");
        int n = scanner.nextInt();
        
        return n;
    }
    int n = tampilInput();  
    
    private static BigInteger fibo(int n){
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        
        for (int i = 2; i < n; i++){
            hasil[i] = hasil[i-1].add(hasil[i-2]);
        }
        return hasil[n-1];
    }
    BigInteger hasil = fibo(n);
}

