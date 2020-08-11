package com.company;

import java.util.Scanner;

public class HV extends Hinh {
    @Override
    public void Nhap() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhap vao canh hinh vuong: ");
        cDai = in.nextFloat();
    }

    @Override
    public void Out() {
        System.out.println("Chu vi cua hv la: " + (cDai + cRong) * 2);
        System.out.println("Dien tich hv la: " + (cDai * cDai));
        System.out.println();
        for (int i = 0; i < Math.round(cDai); i++) {
            for (int j = 0; j < Math.round(cDai); j++)
                System.out.printf("*    ");
            System.out.println();
        }
        System.out.println();
    }
}
