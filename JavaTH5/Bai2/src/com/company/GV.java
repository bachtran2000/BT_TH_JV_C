package com.company;

import java.util.Scanner;

public class GV extends Person {
    protected String CN;
    protected int PC_DL;

    Scanner in = new Scanner(System.in);

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap vao Chuyen nganh: ");
        CN = in.nextLine();
        System.out.print("Co dung lop khong: (1/0) ");
        PC_DL = in.nextInt();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Chuyen nganh: " + CN);
        System.out.println("Luong: " + tinh_Luong());
    }

    public double tinh_Luong() {
        double tong = 0;
        switch (PC_DL) {
            case 0:
                tong = Luong_cb * HSL;
                break;
            case 1:
                Luong = Luong_cb * HSL;
                tong = Luong * 1.3;
                break;
        }
        return tong;
    }

}
