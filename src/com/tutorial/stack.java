package com.tutorial;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack kotor = new Stack();//deklarasi objek stack kotor
        Stack bersih = new Stack();//deklarasi objek stack bersih
        
        for (int i = 1; i <= 5; i++){//perulangan for
            kotor.push("piring " + i);//proses memasukkan data pada stack
        }
        System.out.println("SEBELUM DICUCI" + "\nJumlah piring kotor : " + kotor.size() + "\nJumlah piring bersih : " + bersih.size() + "\nTumpukan piring kotor :"); //menampilkan jumlah piring kotor

        for (int i = 1; i <= 5; i++){//perulangan for
            System.out.println(kotor.peek());
            bersih.push(kotor.pop());//proses pengeluaran data pada stack
        }
        
        System.out.println("\nSETELAH DICUCI" + "\nJumlah piring kotor : " + kotor.size() + "\nJumlah piring bersih : " + bersih.size() + "\nTumpukan piring bersih :");//menampilkan jumlah piring bersih dan piring yang telah dicuci
        
        for (int i = 4; i >= 0; i--){
            System.out.println(bersih.elementAt(i));
        }
    }
}