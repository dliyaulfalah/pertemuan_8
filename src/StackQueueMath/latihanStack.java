package StackQueueMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class latihanStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<String> st = new Stack<>();
        System.out.println("nama prodi 1 = "+st.push("SI"));
        System.out.println("nama prodi 2 = "+st.push("MANAJEMEN"));
        System.out.println("nama prodi 3 = "+st.push("DKV"));

        while (!st.empty()){
            System.out.println("Cetak nama urutan = " + st.pop());
            System.out.println("Jumlah urutan  = "+ st.size() + st);
        }
    }
}

