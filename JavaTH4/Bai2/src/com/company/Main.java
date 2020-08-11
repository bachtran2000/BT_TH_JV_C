package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Manager sv = new Manager();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("CHUONG TRINH QUAN LY SINH VIEN");
            System.out.println("---CHUC NANG CHINH---");
            System.out.println("1. Nhap ");
            System.out.println("2. Xuat ");
            System.out.println("3. Sap xep tang");
            System.out.println("4. Tim theo ten");
            System.out.println("5. Them sinh vien");
            System.out.println("6. Xoa sinh vien ");
            System.out.println("7. Thoat chuong trinh");
            int n;
            System.out.print("Nhap lua chon ban muon : ");
            n = sc.nextInt();
            switch(n) {
                case 1:
                    sv.Nhap();
                    break;
                case 2:
                    sv.Xuat();
                    break;
                case 3:
                    sv.sort();
                    break;
                case 4:
                    sv.search();
                    break;
                case 5:
                    sv.add();
                    break;
                case 6:
                    sv.remove();
                    break;
                case 7:
                    return;
            }
        }
    }
}
