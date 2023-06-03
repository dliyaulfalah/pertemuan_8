package StackQueueMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanMath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        MATH.SQRT
        System.out.println("Masukkan angka = ");
        double angka = Integer.parseInt(br.readLine());
        double kuadrat = Math.sqrt(angka);
        System.out.println("Hasil = " + kuadrat);

//        MATH.POW
        System.out.println("Masukkan angka = ");
        double angkaPow = Integer.parseInt(br.readLine());
        double pangkat = Math.pow(angkaPow, 3);
        System.out.println("Hasil = " + pangkat);

//        MATH.RANDOM
        System.out.println(Math.random());
    }
}
