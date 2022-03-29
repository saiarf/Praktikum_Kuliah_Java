package com.tutorial.PrakPert02;

public class DemoNilaiMHS {
    public static void main(String[] args) {
        NilaiMHS nilai = new NilaiMHS();
        NilaiMHS password = new NilaiMHS();
        password.getNilai();
        nilai.setuas(6.5);
        nilai.setuts(7.9);
        
        System.out.println("Masukan Password: "+password);
    }
}
