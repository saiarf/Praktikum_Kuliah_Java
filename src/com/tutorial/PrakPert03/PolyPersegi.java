package com.tutorial.PrakPert03;

public class PolyPersegi extends PolyBangunData{
    int sisi;

    public PolyPersegi(int sisi){
        this.sisi = sisi;
    }

    @Override
    public float luas(){
        return this.sisi * this.sisi;
    }

    @Override
    public float keliling(){
        return this.sisi*4;
    }
}
