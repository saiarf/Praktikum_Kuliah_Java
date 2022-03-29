package com.tutorial.PrakPert04.Persegi;

public class Demo_1 {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(6);
        System.out.println("Keliling Persegi: " +
        persegi.hitungKeliling());
        System.out.println("Luas Persegi: " +
        persegi.hitungLuas());
    }
}
