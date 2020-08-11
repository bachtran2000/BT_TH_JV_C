package com.company;

import java.util.Scanner;

public class Changer {
    public static String decTobin(int a, String target) {
        if (a < 2) return (a) + target;
        target = (a % 2) + target;
        return decTobin(a / 2, target);
    }

    public static String decToOct(int a, String target) {
        if (a < 8) return (a) + target;
        target = (a % 8) + target;
        return decToOct(a / 8, target);
    }

    public static String decToHex(int a, String target) {
        if (a < 16) {
            if (a < 10)
                return (a) + target;
            else {
                switch (a) {
                    case 10:
                        return "A" + target;
                    case 11:
                        return "B" + target;
                    case 12:
                        return "C" + target;
                    case 13:
                        return "D" + target;
                    case 14:
                        return "E" + target;
                    case 15:
                        return "F" + target;
                }
            }
        }
        if (a % 16 < 10) {
            target = (a % 16) + target;
        } else {
            switch (a % 16) {
                case 10:
                    target = "A" + target;
                case 11:
                    target = "B" + target;
                case 12:
                    target = "C" + target;
                case 13:
                    target = "D" + target;
                case 14:
                    target = "E" + target;
                case 15:
                    target = "F" + target;
            }
        }
        return decToHex(a / 16, target);
    }

    public static void Menu() {
        System.out.println("1.Dec to Bin");
        System.out.println("2.Dec to Oct");
        System.out.println("3.Dec to Hex");
        System.out.println("4.Thoat");
        System.out.printf("Chon: ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int a = sc.nextInt();
        int c;
        while (true) {
            Menu();
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Bin: " + decTobin(a, ""));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Oct: " + decToOct(a, ""));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Hex: 0x" + decToHex(a, ""));
                    System.out.println();
                    break;
                case 4:
                    return;
            }
        }
    }
}
