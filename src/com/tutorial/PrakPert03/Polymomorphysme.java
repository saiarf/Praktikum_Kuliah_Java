package com.tutorial.PrakPert03;

public class Polymomorphysme {
    public static void main(String[] args) {
        PolyBangunData bangunDatar = new PolyBangunData();
        PolyPersegi persegi = new PolyPersegi(6);
        PolyLingkaran lingkaran = new PolyLingkaran(100);

        //Memanggil Method Luas dan Keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("Luas persegi: "+ persegi.luas());
        System.out.println("keliling persegi: "+ persegi.keliling());
        System.out.println("Luas lingkaran: "+ lingkaran.luas());
        System.out.println("Keliling lingkaran: "+ lingkaran.keliling());                
    }
}
