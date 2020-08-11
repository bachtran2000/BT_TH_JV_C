package com.company;

import java.util.Scanner;

public class NV extends Person {

    protected String CV, Phong;
    Scanner in = new Scanner(System.in);

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap vao Chuc vu: ");
        CV = in.nextLine();
        System.out.print("Nhap vao phong: ");
        Phong = in.nextLine();
    }

    @Override
    public void Xuat() {

        super.Xuat();
        System.out.println("Luong: " + tinh_Luong());
        System.out.println("Chuc vu: " + CV);
        System.out.println("Phong: " + Phong);
    }

    public double tinh_Luong() {
        switch (CV) {
            case "GD":
                Luong = Luong_cb * HSL;
                Luong = Luong + Luong * 0.4;
                break;
            case "PGD":
                Luong = Luong_cb * HSL;
                Luong = Luong + Luong * 0.3;
                break;
            case "TP":
                Luong = Luong_cb * HSL;
                Luong = Luong + Luong * 0.25;
                break;
            case "PP":
                Luong = Luong_cb * HSL;
                Luong = Luong + Luong * 0.2;
                break;
            case "NV":
                Luong = Luong_cb * HSL;
                Luong = Luong + Luong * 0.15;
                break;
        }
        return Luong;
    }


}
