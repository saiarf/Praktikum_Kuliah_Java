package com.tutorial.PrakPert01;

public class PrakPert1 {
    public static void main(String[] args) {
        PrakPert1Buah buah1 = new PrakPert1Buah();
        buah1.setName("Mangga");
        buah1.setIsi("10");

        System.out.println("Nama Buahnya adalah "+buah1.getNama()+", Isi buahnya adalah "+buah1.getIsi());

        PrakPert1Hewan hewan1 = new PrakPert1Hewan();
        hewan1.setName("Sapi");
        hewan1.setMany("12 Ekor");
        hewan1.setLife("Darat");
        hewan1.setKind("Mamalia");
        System.out.println("\n\nNama hewannya adalah "+hewan1.getNama()
                        +" Jumlahnya ada "+hewan1.getJmlh()
                        +" Hidupnya berada di "+hewan1.getHidup()
                        +" Termasuk hewan "+hewan1.getJenis());
    }
}