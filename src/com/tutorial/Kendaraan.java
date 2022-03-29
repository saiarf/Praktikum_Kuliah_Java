/*
Nama: Muhamad Saiful Arif
NIM: 1903015008
Kelas: 4D
*/

package com.tutorial;

public class Kendaraan {
    static class Kendaraan1{
        String TenagaMekanik;

        void cetakTenagaMekanik(){
            System.out.println("Tenaga Mekanik: "+TenagaMekanik);
        }
    }
    static class Sepeda extends Kendaraan1{
        String TenagaMekanik;
        String JumlahRoda;
    }
    static class Motor extends Sepeda{
        String bahanBakar;
        String JenisMesin;
    }
    static class Mobil extends Motor{
        String TenagaMekanik;
        int jumlahRoda;
        String jenisMesin;
        int LuasKabin;
    }
    public static void main(String[] args){
        //To Do code Application logic Here
        Kendaraan1 kendaraan1 = new Kendaraan1();
        Sepeda sepeda = new Sepeda();
        Motor motor = new Motor();
        Mobil mobil = new Mobil();

        //Beri nilai "tenaga gerak" masing-masing class
        kendaraan1.TenagaMekanik = "Tidak jelas";
        ((Kendaraan1) sepeda).TenagaMekanik = "Kaki Mengayuh";
        ((Kendaraan1) motor).TenagaMekanik = "Mesin Bahan Bakar";
        ((Kendaraan1) mobil).TenagaMekanik = "Mesin Turbo";

        kendaraan1.cetakTenagaMekanik();
        sepeda.cetakTenagaMekanik();
        motor.cetakTenagaMekanik();
        mobil.cetakTenagaMekanik();
    }
}
