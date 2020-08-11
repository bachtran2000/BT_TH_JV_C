package com.company;

import java.util.Scanner;

public abstract class Person {

    protected String HT, NS, GT;
    protected double Luong, HSL, Luong_cb;

    public void Nhap() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao ho ten nhan vien: ");
        HT = in.nextLine();
        System.out.print("Nhap vao gioi tinh:(nam/nu) ");
        GT = in.nextLine();
        System.out.print("Nhap vao ngay sinh:(dd/mm/yyyy) ");
        NS = in.nextLine();
        System.out.print("Nhap vao he so luong: ");
        HSL = in.nextDouble();
        System.out.print("Nhap vao luong co ban: ");
        Luong_cb = in.nextDouble();
    }

    public void Xuat() {
        System.out.println("|           Ho va ten          |" + "| Gioi tinh |" + "| Ngay sinh |");
        System.out.println("| " + HT + "  |" + GT + " | " + NS + " | ");
    }
}
