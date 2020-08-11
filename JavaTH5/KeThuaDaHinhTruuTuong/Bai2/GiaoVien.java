package KeThuaDaHinhTruuTuong.Bai2;

import java.util.Scanner;

public class GiaoVien extends DiLam{
    String chuyenNghanh;

    public GiaoVien(){

    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    @Override
    public void nhap() {
        System.out.println("-------------------------");
        System.out.println("Nhap thong tin giao vien.");
        super.nhap();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap chuyen nghanh: "); setChuyenNghanh(scan.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println("Thong tin giao vien.");
        super.xuat();
        System.out.println("\tChuyen nghanh: "+getChuyenNghanh());
    }

    @Override
    public double getLuong() {
        return (getLuong() * getHeSoLuong()) + (getLuong()*0.3);
    }


}
