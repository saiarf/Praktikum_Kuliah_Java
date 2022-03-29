package com.tutorial;

public class Praktikum {
    public static void main(String[] args) {
        int bilangan1 = 10;
        int bilangan2 = 20;
        int kuadrat = bilangan1*bilangan1;
        int tambah = bilangan1 + bilangan2 + bilangan1;

        System.out.println(bilangan1 + " Pangkat 2 = " + kuadrat);
        System.out.println("Hasil dari penjumlahannya adalah " + tambah);
    }

    public static double Keliling(double sisiAB, double sisiBC, double sisiCA){
        double Keliling;
        sisiAB = 2;
        sisiBC = 4;
        sisiCA = 6;
        Keliling = sisiAB + sisiBC + sisiCA;

        System.out.println("Hasilnya adalah = "+Keliling);
        return Keliling;        
    }
}