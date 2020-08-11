package KeThuaDaHinhTruuTuong.Bai2;

import java.util.Scanner;

public class DiLam {
    String hoTen, ngaySinh, gioiTinh, code;
    double heSoLuong;
    int luong;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ma: "); setCode(scan.nextLine());
        System.out.print("Nhap ho ten: "); setHoTen(scan.nextLine());
        System.out.print("Nhap ngay sinh: "); setNgaySinh(scan.nextLine());
        System.out.print("Nhap gioi tinh: "); setGioiTinh(scan.nextLine());
        System.out.print("Nhap he so luong: "); setHeSoLuong(scan.nextDouble());
        System.out.print("Nhap luong: "); setLuong(scan.nextInt());
    }

    public void xuat(){
        System.out.println("\tMa: "+getCode());
        System.out.println("\tHo ten: "+getHoTen());
        System.out.println("\tNgay sinh: "+getNgaySinh());
        System.out.println("\tGioi tinh: "+getGioiTinh());
        System.out.println("\tLuong: "+getLuong());
    }

    public double getLuong(){
        return 0;
    }

}
