package com.company;

import java.util.Scanner;

public class Day_so {
    protected int[] a = new int[100];
    public int n = 0;

    public void add_int() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu: ");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu thu " + (i + 1) + " : ");
            a[i] = in.nextInt();
        }
    }

    public void Xuat() {
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1) + ": " + a[i]);
        }
    }

    public void find_Min() {
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i])
                min = a[i];
        }
        System.out.println("Phan tu nho nhat la: " + min);

    }

    public void sort(){
        
    }
}
