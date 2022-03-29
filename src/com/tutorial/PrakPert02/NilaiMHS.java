package com.tutorial.PrakPert02;

import java.io.*;

public class NilaiMHS {
    private double uas,uts;
    private int password;

    public static String bacainputan(){
        String baca = " ";
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(input);

        try{
            baca = buf.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        return baca;
    }

    //Lengkapi

    public double getuas(){
        return uas;
    }
    public void setuas(double uas){
        this.uas = 6.5;
    }
    public double getuts(){
        return uts;
    }
    public void setuts(double uts){
        this.uts = 7.9;
    }
    public double getavg(){
        return (uas+uts)/2;//((uas+uts)/2);
    }

    public void cetak(){
        //Lengkapi
        System.out.println("nilai uas: "+uas);
        System.out.println("nilai uts: "+uts);
        //System.out.println("nilai rata-rata: "+NilaiMHS.avg());
    }

    public void getNilai(){
        System.out.print("Masukan Password: ");
        password = Integer.parseInt(bacainputan());
        if(password == 123){
            // Lengkapi
            System.out.println("Berikut ini adalah Nilai anda ");
            cetak();
        }else{
            System.out.println("Password salah");
        }
    }
}
