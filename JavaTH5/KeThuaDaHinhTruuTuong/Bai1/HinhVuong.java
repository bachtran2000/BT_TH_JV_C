package KeThuaDaHinhTruuTuong.Bai1;

import java.util.Scanner;

public class HinhVuong extends Hinh {
    double canh;

    public HinhVuong() {

    }

    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap canh hv: ");
        this.canh = scan.nextDouble();
    }

    @Override
    public void xuat() {
        System.out.println("\tChu vi hv: " + tinhChuVi());
        System.out.println("\tDien tich hv: " + tinhDienTich());
    }

    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
}
