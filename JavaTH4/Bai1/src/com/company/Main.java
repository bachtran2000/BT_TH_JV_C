package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Phan_so pt1 = new Phan_so();
        Phan_so pt2 = new Phan_so();
        System.out.print("Nhap vao phan so thu 1: ");
        pt1.Nhap();
        pt1.Xuat();
        System.out.print("Nhap vao phan so thu 2: ");
        pt2.Nhap();
        pt2.Xuat();

        pt1.Sum(pt2.getA(),pt2.getB());

        pt1.Hieu(pt2.getA(),pt2.getB());

        pt1.Tich(pt2.getA(),pt2.getB());

        pt1.Thuong(pt2.getA(),pt2.getB());
    }
}
