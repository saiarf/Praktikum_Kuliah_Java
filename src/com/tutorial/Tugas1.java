package com.tutorial;

public class Tugas1 {
    public static void main(String[] args) {
        int a,b;
        
        System.out.println("Tugas 1 PBO looping");
        for(a=10; a>=1; a--){
            for(b=1; b<=a; b++){
                System.out.print("@");
            }
            System.out.println();
        }
    }   
}