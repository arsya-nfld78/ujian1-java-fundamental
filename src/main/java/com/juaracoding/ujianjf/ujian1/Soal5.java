package com.juaracoding.ujianjf.ujian1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan jumlah film: ");
        int dataLength = input.nextInt();
        int[] prices = new int[dataLength];
        int totalPrice = 0;

        for (int y = 0; y < prices.length; y++){
            System.out.println("Harga tiket film "+(y+1)+":");
            prices[y] = input.nextInt();
        }
        for (int price : prices){
            totalPrice += price;
        }
        System.out.println("Total harga tiket: " +totalPrice);

    }
}
