/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmatematikadiskrit;

import java.util.Scanner;

/**
 *
 * @author udin
 */
public class Permutation {
    
    public static void main(String[] args){
        sorting();
    }
    
    public static void sorting(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        for(int i = 0; i < angka; i++){
            System.out.println(i+1);
        }
    }
    
    
    
}
