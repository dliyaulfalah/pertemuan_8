package StackQueueMath;

import java.util.LinkedList;
import java.util.Queue;
public class latihan1 {


    static class Sepeda {
        private String merek;

        public Sepeda(String merek) {
            this.merek = merek;
        }

        public String getMerek() {
            return merek;
        }

        public void setMerek(String merek) {
            this.merek = merek;
        }

        @Override
        public String toString() {
            return "Sepeda{" +
                    "merek='" + merek + '\'' +
                    '}';
        }
    }

    public static class QueueExample {
        public static void main(String[] args) {
            // Membuat objek Queue menggunakan LinkedList
            Queue<Sepeda> queue = new LinkedList<>();

            // Menambahkan sepeda ke dalam Queue
            queue.add(new Sepeda("Polygon"));
            queue.add(new Sepeda("United"));
            queue.add(new Sepeda("Giant"));

            // Menampilkan isi Queue
            System.out.println("Isi awal Queue: " + queue);

            // Mengakses sepeda pertama (head) dari Queue tanpa menghapusnya
            Sepeda head = queue.peek();
            System.out.println("Sepeda pertama (head) dari Queue: " + head);

            // Menghapus sepeda pertama (head) dari Queue
            Sepeda removedBike = queue.poll();
            System.out.println("Sepeda yang dihapus dari Queue: " + removedBike);

            // Menampilkan isi Queue setelah menghapus sepeda pertama
            System.out.println("Isi Queue setelah penghapusan: " + queue);

            // Mengganti merek sepeda kedua (elemen ke-2) dalam Queue
            Sepeda bikeToUpdate = queue.peek();
            bikeToUpdate.setMerek("Polygon Xtrada");
            System.out.println("Isi Queue setelah mengganti merek sepeda: " + queue);
        }
    }

}
