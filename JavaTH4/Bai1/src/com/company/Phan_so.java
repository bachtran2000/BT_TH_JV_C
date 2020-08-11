package com.company;

import java.util.Scanner;

public class Phan_so {
    private int a, b;

    public Phan_so() {

    }

    public Phan_so(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void Nhap() {
        Scanner in = new Scanner(System.in);
        this.a = in.nextInt();
        this.b = in.nextInt();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void Xuat() {
        System.out.println(a + "/" + b);
    }

    public void Sum(int ts1, int ms1) {
        int tong_ts;
        int tong_ms;
        int Ts1, Ts2;
        if (ms1 == b) {
            tong_ts = a + ts1;
            System.out.println("Tong " + a + "/" + b + " + " + ts1 + "/" + ms1 + " = " + tong_ts + "/" + ms1);
        } else {
            tong_ms = ms1 * b;
            Ts1 = a * ms1;
            Ts2 = ts1 * b;
            tong_ts = Ts1 + Ts2;
            System.out.println("Tong " + a + "/" + b + " + " + ts1 + "/" + ms1 + " = " + tong_ts + "/" + tong_ms);
        }

    }

    public void Hieu(int ts1, int ms1) {
        int hieu_ts;
        int hieu_ms;
        int Ts1, Ts2;
        if (ms1 == b) {
            hieu_ts = a + ts1;
            System.out.println("Hieu " + a + "/" + b + " - " + ts1 + "/" + ms1 + " = " + hieu_ts + "/" + ms1);
        } else {
            hieu_ms = ms1 * b;
            Ts1 = a * ms1;
            Ts2 = ts1 * b;
            hieu_ts = Ts1 - Ts2;
            System.out.println("Hieu " + a + "/" + b + " - " + ts1 + "/" + ms1 + " = " + hieu_ts + "/" + hieu_ms);
        }

    }

    public void Tich(int ts1, int ms1){
        int tich_ts, tich_ms;
        tich_ms = b * ms1;
        tich_ts = a * ts1;
        System.out.println("Tich cua "+a+"/"+b+" * "+ts1+"/"+ms1+" = "+tich_ts+"/"+tich_ms);
    }

    public void Thuong(int ts1, int ms1){
        int thuong_ts, thuong_ms;
        thuong_ms = b * ts1;
        thuong_ts = a * ms1;
        System.out.println("Thuong cua "+a+"/"+b+" : "+ts1+"/"+ms1+" = "+thuong_ts+"/"+thuong_ms);
    }
}
