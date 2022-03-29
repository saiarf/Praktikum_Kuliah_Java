package com.tutorial.PrakPert04.PersegiPanjang;

import com.tutorial.Pola;

public class PersegiPanjang extends Pola{
    private int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;

    }

    @Override
    public double getLuas(){
        return panjang*lebar;
    }

    public String toString(){
        return "Persegi Panjang";
    }
}
