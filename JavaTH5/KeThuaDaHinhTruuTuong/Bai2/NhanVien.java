package KeThuaDaHinhTruuTuong.Bai2;

import java.util.Scanner;

public class NhanVien extends DiLam{
    String chucVu, phong;

    public NhanVien(){

    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    @Override
    public void nhap() {
        System.out.println("-------------------------");
        System.out.println("Nhap thong tin nhan vien");
        super.nhap();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap chuc vu: "); setChucVu(scan.nextLine());
        System.out.print("Nhap phong: "); setPhong(scan.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println("Thong tin nhan vien");
        super.xuat();
        System.out.println("\tChuc vu: "+getChucVu());
        System.out.println("\tPhong: "+getPhong());
    }

    @Override
    public double getLuong() {
        if (getChucVu().equals("GD")) return (getLuong() * getHeSoLuong()) + (getLuong()*0.4);
        else if(getChucVu().equals("PGD")) return (getLuong() * getHeSoLuong()) + (getLuong()*0.3);
        else if(getChucVu().equals("TP")) return (getLuong() * getHeSoLuong()) + (getLuong()*0.25);
        else if(getChucVu().equals("PP")) return (getLuong() * getHeSoLuong()) + (getLuong()*0.2);
        else return (getLuong() * getHeSoLuong()) + (getLuong()*0.15);
    }


}
