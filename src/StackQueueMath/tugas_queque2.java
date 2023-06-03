package StackQueueMath;

public class tugas_queque2{
    private int front; // Indeks depan dari Queue
    private int rear; // Indeks belakang dari Queue
    private int maxSize; // Ukuran maksimal Queue
    private String[] queueArray; // Array untuk menyimpan elemen-elemen Queue
    private int currentSize; // Jumlah elemen saat ini di dalam Queue

    public tugas_queque2(int size) {
        maxSize = size;
        queueArray = new String[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void enqueue(String data) {
        if (isFull()) {
            System.out.println("Queue penuh. Enqueue gagal.");
            return;
        }

        rear++;
        if (rear == maxSize) {
            rear = 0;
        }
        queueArray[rear] = data;
        currentSize++;
        System.out.println("Elemen " + data + " ditambahkan ke dalam Queue.");
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong. Dequeue gagal.");
            return null;
        }

        String removedElement = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        currentSize--;
        System.out.println("Elemen " + removedElement + " dihapus dari Queue.");
        return removedElement;
    }

    public static void main(String[] args) {
        tugas_queque2 queue = new tugas_queque2(5);

        // Menambahkan elemen ke dalam Queue
        queue.enqueue("Elemen 1");
        queue.enqueue("Elemen 2");
        queue.enqueue("Elemen 3");
        queue.enqueue("Elemen 4");

        // Menghapus elemen dari Queue
        queue.dequeue();
        queue.dequeue();

        // Menambahkan elemen lagi ke dalam Queue
        queue.enqueue("Elemen 5");

        // Menghapus elemen dari Queue
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
