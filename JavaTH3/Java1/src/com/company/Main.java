package com.company;

import java.util.Scanner;

public class Main {

    public static int GT(int a) {
        if (a <= 1) return 1;
        else return (a * GT(a - 1));
    }

    public static int Sum(int a) {
        int tong_gt = 1;
        if (a <= 1) return tong_gt;
        else {
            for (int i = 2; i <= a; i++) {
                tong_gt = tong_gt + GT(i);
                System.out.println("Gia tri "+i+"! = "+GT(i));
            }
            return tong_gt;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int Tong_GT = 0;
        System.out.print("Nhap vao so n: ");
        a = input.nextInt();
        Tong_GT = Sum(a);
        System.out.println("Tong cua n la: " + Tong_GT);
    }
}
