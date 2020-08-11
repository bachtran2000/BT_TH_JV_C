package com.company;

import java.util.Scanner;

public class Prime {

    public static boolean kt_nt(int so, int i) {
        if(so<2) return false;
        if (i == so) return true;
        if (so % i == 0) return false;
        return kt_nt(so, i + 1);
    }

    public static int In_Prime(int so, int sum) {
        if (so < 2) {
            System.out.println();
            return sum;
        }
        if (kt_nt(so, 2)) {
            System.out.print(so + "  ");
            sum = sum + so;
        }
        return In_Prime(so - 1, sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int so, i, sum = 0;
        System.out.printf("Nhap vao so can kiem tra: ");
        so = in.nextInt();
        if (kt_nt(so, 2))
            System.out.println("La SNT!");
        else System.out.println(so+" khong phai SNT!");
        System.out.println("Cac so nt be hon "+so);
        sum = In_Prime(so, sum);
        System.out.println("Tong cac so NT la: "+sum);
    }
}
