package com.tutorial.PrakPert03;

public class PolyLingkaran extends PolyBangunData{
    int r;

    public PolyLingkaran(int r){
        this.r = r;
    }

    @Override
    public float luas(){
        return (float) (Math.PI*r*r);
    }

    @Override
    public float keliling(){
        return (float) (2*Math.PI*r);
    }
}
