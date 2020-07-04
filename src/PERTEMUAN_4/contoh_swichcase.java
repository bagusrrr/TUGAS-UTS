/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class contoh_swichcase {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String minuman,pilih,bonus = null;
        int total, jumlah,harga,total_bayar;
        
        System.out.println("=========MINUMAN SEGAR=========");
        System.out.println("");
        
        System.out.println("1. Es Oyen 2. Es Degan 3. Es Doger");
        System.out.println("masukkan pilihan anda");
        pilih = input.nextLine();
        
        switch (pilih){
            case "1" : minuman = "Es Oyen" ;
            harga = 7000;
            break;
            case "2" : minuman = "Es Degan";
            harga = 6500;
            break;
            case "3" : minuman = "Es Doger";
            harga = 7500;
            break;
            default : minuman = "tidak ada";
            harga = 0;
            break;
        }
        System.out.println("jumlah yang dibeli");
        jumlah = input.nextInt();
        total = harga*jumlah;
        if (total>=50000)
        bonus ="air mineral";
        
        System.out.println(" minuman :" + minuman);
        System.out.println(" harga :" + harga);
        System.out.println(" jumlah beli :" + jumlah);
        System.out.println(" total :" + total);
        System.out.println(" bonus :" + bonus);
        
    }
    
}