package StackQueueMath;

import java.util.LinkedList;
import java.util.Queue;

public class tugas_queque {
    public static void main(String[] args) {
        // Membuat objek Queue menggunakan LinkedList
        Queue<String> queue = new LinkedList<>();

        // Menambahkan elemen ke dalam Queue
        queue.add("Elemen 1");
        queue.add("Elemen 2");
        queue.add("Elemen 3");
        queue.add("Elemen 4");

        // Menampilkan isi Queue
        System.out.println("Isi awal Queue: " + queue);

        // Mengakses elemen pertama (head) dari Queue tanpa menghapusnya
        String head = queue.peek();
        System.out.println("Elemen pertama (head) dari Queue: " + head);

        // Menghapus elemen pertama (head) dari Queue
        String removedElement = queue.poll();
        System.out.println("Elemen yang dihapus dari Queue: " + removedElement);

        // Menampilkan isi Queue setelah menghapus elemen pertama
        System.out.println("Isi Queue setelah penghapusan: " + queue);
    }
}
