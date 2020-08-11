package com.company;

import java.util.Scanner;

public abstract class Hinh {

    protected float cDai, cRong;

    public Hinh(float cDai, float cRong) {
        this.cDai = cDai;
        this.cRong = cRong;
    }

    public Hinh() {
    }

    public float getcDai() {
        return cDai;
    }

    public float getcRong() {
        return cRong;
    }
    public void Menu(){
        System.out.println("1. Hinh vuong");
        System.out.println("2. Hinh chu nhat");
        System.out.println("3. Thoat");
        System.out.printf("Chon: ");
    }

    public abstract void Nhap();
    public abstract void Out();
}
