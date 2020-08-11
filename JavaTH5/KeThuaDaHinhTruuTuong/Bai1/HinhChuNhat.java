package KeThuaDaHinhTruuTuong.Bai1;

import java.util.Scanner;

public class HinhChuNhat extends Hinh {
    double chieuDai, chieuRong;

    public HinhChuNhat() {

    }

    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap chieu dai hcn: ");
        this.chieuDai = scan.nextDouble();
        System.out.print("Nhap chieu rong hcn: ");
        this.chieuRong = scan.nextDouble();
    }

    @Override
    public void xuat() {
        System.out.println("\tChu vi hcn: " + tinhChuVi());
        System.out.println("\tDien tich hcn: " + tinhDienTich());
    }

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
