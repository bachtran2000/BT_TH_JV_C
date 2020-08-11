package com.company;

import java.util.Scanner;

public class Main {

    public static int is_SNT(int a){
        if(a<2) return 0;
        else
            for(int i = 2; i<a; i++){
                if (a%i==0) return 0;
            }
        return 1;
    }

    public static void In_SNT(int a){
        for(int i = 2; i<a;i++){
            if (is_SNT(i)==1) System.out.print(i+" ");
        }
    }

    public static int Sum_Prime(int a){
        int tong=0;
        for(int i=2;i<a;i++){
            if (is_SNT(i)==1) tong = tong + i;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so n: ");
        n = scanner.nextInt();
        System.out.println("Danh sach cac SNT nho hon n: ");
        In_SNT(n);
        System.out.println();

        System.out.println("Tong cua cac SNT be hon n la: " + Sum_Prime(n));
    }
}
