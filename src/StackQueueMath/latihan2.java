package StackQueueMath;

import java.util.LinkedList;
import java.util.Queue;

class TehBotol {
    private String nama;
    private int jumlah;

    public TehBotol(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }
}

public class latihan2 {
    public static void main(String[] args) {
        Queue<TehBotol> antrianTehBotol = new LinkedList<>();

        // Menambahkan teh botol ke dalam antrian
        antrianTehBotol.add(new TehBotol("Teh Botol Sosro", 5));
        antrianTehBotol.add(new TehBotol("Teh Pucuk Harum", 3));
        antrianTehBotol.add(new TehBotol("Teh Gelas", 2));

        // Mengakses elemen pertama dalam antrian
        TehBotol tehPertama = antrianTehBotol.peek();
        System.out.println("Teh botol pertama dalam antrian: " + tehPertama.getNama());

        // Menghapus elemen pertama dalam antrian
        TehBotol tehDihapus = antrianTehBotol.poll();
        System.out.println("Teh botol yang dihapus dari antrian: " + tehDihapus.getNama());

        // Mengakses elemen pertama setelah penghapusan
        TehBotol tehBaruPertama = antrianTehBotol.peek();
        System.out.println("Teh botol baru pertama dalam antrian: " + tehBaruPertama.getNama());

        // Menambahkan teh botol baru ke dalam antrian
        antrianTehBotol.add(new TehBotol("Teh Kotak", 4));

        // Mengiterasi semua teh botol dalam antrian
        System.out.println("Semua teh botol dalam antrian:");
        for (TehBotol teh : antrianTehBotol) {
            System.out.println(teh.getNama() + " - Jumlah: " + teh.getJumlah());
        }
    }
}

