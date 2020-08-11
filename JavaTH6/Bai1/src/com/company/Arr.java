package com.company;

import java.util.Scanner;

public class Arr {
    private static int sum = 0;
    private static int mul = 1;
    static Scanner in = new Scanner(System.in);

    public static int Nhap_arr(int[] a, int n, int i) {

        if (i == n) return 0;
        if (i < n) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ": ");
            a[i] = in.nextInt();
            return Nhap_arr(a, n, i + 1);
        }
        return 0;
    }

    public static int Xuat(int[] a, int n, int i) {
        if (i == n) return 0;
        if (i < n) {
            System.out.print(a[i] + "  ");

            return Xuat(a, n, i + 1);
        }
        return 0;
    }

    public static int find_Max(int[] a, int n, int i, int max) {

        if (i == n) {
            return max;
        }
        if (i < n) {
            if (max < a[i]) max = a[i];
            return find_Max(a, n, i + 1, max);
        }
        return max;
    }

    public static int find_Min(int[] a, int n, int i, int min) {

        if (i == n) {
            return min;
        }
        if (i < n) {
            if (a[i] < min) min = a[i];
            return find_Min(a, n, i + 1, min);
        }
        return min;
    }

    public static int Sum(int[] so, int n, int i) {

        if (i == n) return sum;
        if (i < n) {
            sum = sum + so[i];
            return Sum(so, n, i + 1);
        }
        return 1;

    }

    public static int Mul(int[] so, int n, int i) {

        if (i == n) return mul;
        if (i < n) {
            mul = mul * so[i];
            return Mul(so, n, i + 1);
        }
        return 1;

    }

    public static boolean kt_nt(int so, int i) {
        if (so < 2) return false;
        if (i == so) return true;
        if (so % i == 0) return false;
        return kt_nt(so, i + 1);
    }

    public static int count_Prime(int[] a, int n, int i, int count) {
        if (i == n) return count;
        if (i < n) {
            if (kt_nt(a[i], 2))
                return count_Prime(a, n, i + 1, count + 1);
        }
        return count_Prime(a, n, i + 1, count);
    }

    public static void main(String[] args) {

        System.out.print("Nhap vao so phan tu: ");
        int n;

        int count = 0;
        n = in.nextInt();
        int[] a = new int[100];

        Nhap_arr(a, n, 0);
        System.out.println();
        Xuat(a, n, 0);
        System.out.println();
        System.out.println();
        sum = Sum(a, n, 0);
        mul = Mul(a,n,0);
        System.out.println("Sum = "+ sum);
        System.out.println("Mutiple = "+mul);
        System.out.println("Max = " + find_Max(a, n, 0, a[0]));
        System.out.println("Min = " + find_Min(a, n, 0, a[0]));
        System.out.println();
        System.out.println("Tong so NT trong day: " + count_Prime(a, n, 0, 0));
    }
}
