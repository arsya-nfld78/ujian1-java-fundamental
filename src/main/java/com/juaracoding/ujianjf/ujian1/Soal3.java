package com.juaracoding.ujianjf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan jumlah tiket: ");
        int totalTicket = input.nextInt();
        System.out.println("Jumlah tiket: " + totalTicket);

        float discount = 0.0f;
        int diskonHarga;
        boolean isWeekend = false;
        int priceWeekday = 35000;
        int priceWeekend = 45000;

        if (totalTicket > 5) {
            if (isWeekend == true) {
                discount = 0.1f;
                diskonHarga = (int) (totalTicket * (priceWeekend - priceWeekend * discount));
                System.out.println("Total harga (dengan diskon): " + diskonHarga);
            } else {
                discount = 0.1f;
                diskonHarga = (int) (totalTicket * (priceWeekday - priceWeekday * discount));
                System.out.println("Total harga (dengan diskon): " + diskonHarga);
            }
        } else if (isWeekend == true){
            System.out.println("Total harga :" + totalTicket * priceWeekend);
        } else {
            System.out.println("Total harga :" + totalTicket * priceWeekday);
        }

    }
}
