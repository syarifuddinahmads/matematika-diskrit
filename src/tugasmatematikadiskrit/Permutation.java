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

    public static int[] numberArray;
    public static int noMenu;
    public static int jumlahAngka;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        do {
            System.out.print("Masukkan menu : ");
            noMenu = input.nextInt();
            switch (noMenu) {
                case 1:
                    inputAngka();
                    break;
                case 2:
                    showNumberBeforeSorting();
                    break;
                case 3:
                    sortingNumberAndCount();
                    break;
                case 4:
                    TugasMatematikaDiskrit.main(args);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid !");
                    break;
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("Menu Permutation : ");
        System.out.println("1. Masukkan Angka");
        System.out.println("2. Tampilkan Angka");
        System.out.println("3. Sorting Angka");
        System.out.println("4. Kembali Ke Menu Utama");
        System.out.println("5. Exit");
    }

    public static void inputAngka() {
        System.out.print("Masukkan jumlah Angka : ");
        jumlahAngka = input.nextInt();
        numberArray = new int[jumlahAngka];
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Angka ke - " + (i + 1) + " : ");
            numberArray[i] = input.nextInt();
        }
    }

    public static void showNumberBeforeSorting() {
        if (numberArray.length == 0) {
            System.out.println("Angka masih kosong !");
        }
        System.out.print("Angka sebelum di sorting : [ ");
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print(numberArray[i] + " ");
        }
        System.out.println("]");
    }

    public static void sortingNumberAndCount() {
        int numberTemp = 0;
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 1; j < numberArray.length; j++) {
                if (numberArray[j - 1] > numberArray[j]) {
                    numberTemp = numberArray[j - 1];
                    numberArray[j - 1] = numberArray[j];
                    numberArray[j] = numberTemp;
                }
            }
        }

        System.out.print("Angka sesudah di sorting : [ ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
        System.out.println(" ] ");

        int jumlah;
        for (int i = 0; i < numberArray.length; i++) {
            jumlah = 0;
            for (int j = 0; j < numberArray.length; j++) {
                if (numberArray[i] == numberArray[j]) {
                    jumlah++;
                }
            }
            if (numberArray[i] != numberArray[i-1]) {
                System.out.println("Angka : " + numberArray[i] + " Muncul Sebanyak : " + jumlah);
            }
        }

    }

}
