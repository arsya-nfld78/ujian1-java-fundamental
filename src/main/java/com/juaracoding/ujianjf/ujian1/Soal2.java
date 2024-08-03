package com.juaracoding.ujianjf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {

        //Input data
        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan nama film: ");
        String film = input.nextLine().toUpperCase(); //Inisiasi variabel input dan ubah ke upper case
        System.out.println("Nama film dalam huruf besar: " + film);

    }
}
