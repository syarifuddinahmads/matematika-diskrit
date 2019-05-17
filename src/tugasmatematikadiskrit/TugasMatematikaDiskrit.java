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
public class TugasMatematikaDiskrit {

    public static int noMenu;
    public static Scanner input = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
        do {   
            System.out.print("Masukkan menu : ");
            noMenu = input.nextInt();
            switch(noMenu){
                case 1:
                    Permutation.main(args);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Menu tidak valid !");
                    break;
            }
        } while (true);
    }
    
    public static void menu(){
        System.out.println("Pilih Menu Program : ");
        System.out.println("1. Permutation ");
        System.out.println("2. Exit");
    }
    
}
