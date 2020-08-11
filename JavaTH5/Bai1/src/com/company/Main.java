package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c;
        Hinh hinh = new Hinh() {
            @Override
            public void Nhap() {

            }

            @Override
            public void Out() {

            }
        };
        while (true) {
            hinh.Menu();
            c = in.nextInt();
            switch (c) {
                case 1:
                    hinh = new HV();
                    hinh.Nhap();
                    hinh.Out();
                    break;
                case 2:
                    hinh = new HCN();
                    hinh.Nhap();
                    hinh.Out();
                    break;
                case 3:
                    return;
            }
        }
    }
}
