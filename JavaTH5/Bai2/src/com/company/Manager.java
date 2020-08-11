package com.company;

import java.util.Scanner;

public class Manager {
    Person[] list_nv = new Person[100];
    Person[] list_gv = new Person[100];
    int n = 0, m = 0;

    public void Nhap() {
        String yn;
        Scanner in = new Scanner(System.in);
        while (true) {
            int c;

            System.out.println("1. Giao vien");
            System.out.println("2. Nhan vien");
            System.out.print("Chon: ");
            c = in.nextInt();
            switch (c) {
                case 1:
                    list_gv[n] = new GV();
                    list_gv[n].Nhap();
                    n++;
                    break;
                case 2:
                    list_nv[m] = new NV();
                    list_nv[m].Nhap();
                    m++;
                    break;
            }
            System.out.print("Ban co muon nhap nua khong (y/n)?: ");
            in.nextLine();
            yn = in.nextLine();
            if (yn.equals("n") || yn.equals("N")) return;
        }
    }

    public void Xuat() {
        int c;
        Scanner in = new Scanner(System.in);
        System.out.println("1. Giao vien");
        System.out.println("2. Nhan vien");
        System.out.print("Chon: ");
        c = in.nextInt();
        if (c == 1) {
            for (int i = 0; i < n; i++) {
                list_gv[i].Xuat();
            }
        } else for (int i = 0; i < m; i++) {
            list_nv[i].Xuat();
        }
    }

    public void sort() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (list_gv[i].Luong < list_gv[j].Luong) {
                    Person tmp = new GV();
                    tmp = list_gv[i];
                    list_gv[i] = list_gv[j];
                    list_gv[j] = tmp;
                }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++)
                if (list_nv[i].Luong < list_nv[j].Luong) {
                    Person tmp = new NV();
                    tmp = list_nv[i];
                    list_nv[i] = list_nv[j];
                    list_nv[j] = tmp;
                }
        }
    }

    public void search() {
        Scanner in = new Scanner(System.in);

        String find_name;
        int c;

        System.out.println("1. Giao vien");
        System.out.println("2. Nhan vien");
        System.out.print("Chon: ");
        c = in.nextInt();
        switch (c) {
            case 1:
                System.out.print("Nhap vao ten can tim: ");
                in.nextLine();
                find_name = in.nextLine();
                for (int i = 0; i < n; i++) {
                    if (list_gv[i].HT.equals(find_name))
                        System.out.println("Tim thay " + find_name);
                }
                    else System.out.println("Khong tim thay!");
                break;
            case 2:
                System.out.print("Nhap vao ten can tim: ");
                in.nextLine();
                find_name = in.nextLine();
                for (int i = 0; i < m; i++) {
                    if (list_nv[i].HT.equals(find_name))
                        System.out.println("Tim thay " + find_name);
                }
                    else System.out.println("Khong tim thay!");
                break;
        }


    }
}