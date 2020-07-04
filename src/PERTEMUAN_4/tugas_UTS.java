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
public class tugas_UTS {
public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("====================");
        System.out.println("====TOKO BAGUS MOJOKERTO====");
        System.out.println("====================");
        
        System.out.println("JUMLAH BARANG YANG AKAN DIBELI");
        int beli = input.nextInt();
        
        for (int i = 1; i<=beli; i++)
        {    
            System.out.println("NAMA BARANG KE- "+i+":");
            String nama =input.next();
            System.out.println("HARGA BARANG KE- "+i+":");
            int harga = input.nextInt();
            System.out.println("JUMLAH BARANG KE- "+i+":");
            int jumlah = input.nextInt();
            System.out.println("");
            
            System.out.println("=============================");
            System.out.println("  NAMA BARANG    : " + nama   );
            System.out.println("  HARGA BARANG   : " + harga  );
            System.out.println("  JUMLAH BARANG  : " + jumlah );
            System.out.println("=============================");
            
            int total,totalb,diskon =0;
            total = harga * jumlah;
            System.out.println("total belanja = RP"+ total);
            if (total>100000){
                diskon = total/5;
            } else{diskon = 0; }
            
                    System.out.println("DISKON = Rp."+ diskon);
                    totalb = total - diskon;
                    System.out.println("TOTAL BAYAR = Rp."+ totalb);
                    System.out.println("UANG BAYAR = Rp.");
                    int bayar = input.nextInt();
                    
                    int kembali = bayar - totalb;
                    System.out.println("UANG KEMBALI = Rp." + kembali);
                    System.out.println("=======================");
                    System.out.println("TERIMAKASIH");
                    System.out.println("SELAMAT BELANJA KEMBALI");
                    
            }
    }
}    

