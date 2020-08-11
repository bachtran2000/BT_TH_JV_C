package com.company;

import java.util.Scanner;

public class SV {
    private String MSV;
    private String HT;
    private int Score;

    public SV(String MSV, String HT, int score) {
        this.MSV = MSV;
        this.HT = HT;
        Score = score;
    }

    public SV() {
    }

    public String getMSV() {
        return MSV;
    }

    public String getHT() {
        return HT;
    }

    public int getScore() {
        return Score;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public void setHT(String HT) {
        this.HT = HT;
    }

    public void setScore(int score) {
        Score = score;
    }

    public void Nhap() {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap MSV: ");
        this.MSV = in.nextLine();
        System.out.print("Nhap vao ho va ten: ");
        this.HT = in.nextLine();
        System.out.print("Nhap diem: ");
        this.Score = in.nextInt();
    }

    public void Xuat() {
        System.out.println("MSV: " + MSV+"|"+"Ho va ten: "+HT+"|"+"Diem: "+Score+"|");

    }
}
