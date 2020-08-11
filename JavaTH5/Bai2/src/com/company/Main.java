package com.company;

import java.util.Scanner;

public class Main {

    public static void Menu() {
        System.out.println("1. Nhap thong tin: ");
        System.out.println("2. In danh sach: ");
        System.out.println("3. Sap xep theo luong");
        System.out.println("4. TIm kiem theo ten");
        System.out.printf("Chon: ");
    }

    public static void main(String[] args) {
        Manager mn = new Manager();
        Scanner in = new Scanner(System.in);

        int chon;

        while (true) {
            Menu();
            chon = in.nextInt();
            switch (chon) {
                case 1:
                    mn.Nhap();
                    break;
                case 2:
                    mn.Xuat();
                    break;
                case 3:
                    mn.sort();
                    break;
                case 4:
                    mn.search();
                    break;
            }
        }

    }
}
