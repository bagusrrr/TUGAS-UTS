/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class contoh_ifElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
 {
        int nilai;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
        char grade;
         
        try {
            System.out.print ("Input nilai (0-100): ");
            nilai = Integer.parseInt(input.readLine());
            if (nilai >= 60) {
                System.out.println ("LULUS");
            } else {
                System.out.println ("GAGAL");
                 
            }
            if (nilai >= 85 && nilai <= 100) {
                grade = 'A';
            } else if (nilai >= 75 && nilai < 85) {
                grade = 'B';
            } else if (nilai >= 60 && nilai < 75) {
                grade = 'C';
            } else if (nilai >= 45 && nilai < 60) {
                grade = 'D';
            } else if (nilai >= 0 && nilai < 45) {
                grade = 'E';
            } else {
                grade = '-';
            }
            System.out.println ("Grade : " + grade);
             
        }
        catch (Exception e) {
        }
    }
}
}

    

