package com.juaracoding.ujianjf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan jumlah film  : ");
        int jumlahFilm = input.nextInt();
        String[] film = new String[jumlahFilm];

        System.out.println("Daftar film bioskop");
        for (int i = 0; i < film.length; i++) {
            System.out.println("Masukkan nama film " + (i+1) + ":");;
            film[i] = input.nextLine();
        }
        System.out.println("Film yang ditonton:");
        for (int j = 0; j < film.length; j++) {
            System.out.println((j + 1) + ". " + (film[j]));
        }
    }
}
