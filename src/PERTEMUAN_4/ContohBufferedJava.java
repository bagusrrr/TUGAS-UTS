/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.time.Clock.system;

/**
 *
 * @author ASUS
 */
public class ContohBufferedJava 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    
    String nama  ;
    String alamat  ;
    String hobi  ;
    String umur  ;
    String no_hp  ;
   
     //   // TODO code application logic here
        System.out.println("nama kamu");
        nama = br.readLine();
        System.out.println("alamat kamu");
        alamat = br.readLine();
        System.out.println("hobi kamu");
        hobi = br.readLine();
        System.out.println("umur kamu");
        umur = br.readLine();
        System.out.println("no_hp kamu");
        no_hp = br.readLine();
        //output
        System.out.println("============= BIODATA =========");
        System.out.println("nama    :" + nama);
        System.out.println("alamat  :" + alamat);
        System.out.println("hobi    :" + hobi);
        System.out.println("umur    :" + umur);
        System.out.println("no_hp   :D"
                + "" + no_hp);
        
        
    }
    
}
