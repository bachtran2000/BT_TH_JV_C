package com.company;


import java.util.*;

public class Manager {
    SV[] sv = new SV[100];

    private int n;


    public void Nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so sinh vien: ");
        n = input.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            sv[i] = new SV();
            sv[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("Danh sach sinh vien vua nhap: ");
        for (int i = 0; i < n; i++) {
            sv[i].Xuat();
        }
    }

    public void sort() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sv[i].getScore() < sv[j].getScore()) {
                    SV tmp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = tmp;
                }
            }
        }
    }

    public void search() {
        System.out.println("Nhap vao ten sinh vien can tim: ");
        Scanner input = new Scanner(System.in);
        String TenSV = input.next();
        for (int i = 0; i < n; i++) {
            if (sv[i].getHT().equals(TenSV)) {
                System.out.println("Tim thay sinh vien: " + sv[i].getHT());
            }
        }
    }

    public void add() {
        System.out.println("Nhap vao thon tin sinh vien can them: ");
        Scanner input = new Scanner(System.in);

        sv[n] = new SV();
        sv[n].Nhap();
        n = n + 1;
        sort();
        Xuat();
    }

    public void remove() {
        System.out.println("Nhap MaSV can xoa: ");
        Scanner input = new Scanner(System.in);
        int k = n;
        String ma_remove = input.nextLine();
        int i, j;
        for (i = 0; i < n; i++) {
            if (sv[i].getMSV().equals(ma_remove)) {
                sv[i] = sv[i + 1];
            }
        }
        j = i;
        for (j = j + 2, i = i++; j < n - 1; j++) {
            sv[i] = sv[j];
        }
        this.n = n - 1;
        Xuat();
    }
}
