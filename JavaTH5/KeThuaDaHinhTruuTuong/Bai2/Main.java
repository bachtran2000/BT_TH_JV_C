package KeThuaDaHinhTruuTuong.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void timKiem(ArrayList<DiLam> arr, String ma){
        for (DiLam x: arr){
            if (x.getCode().equals(ma)){
                x.xuat();
                break;
            }
        }
    }

//    public static ArrayList<DiLam> sapxep(ArrayList<DiLam> arr){
//        Collections.sort(arr, new Comparator<DiLam>() {
//            @Override
//            public int compare(DiLam o1, DiLam o2) {
//                if (o1.getLuong() > o2.getLuong())
//                    return 1;
//                else if(o1.getLuong() == o2.getLuong())
//                    return 0;
//                else return -1;
//            }
//        });
//        return arr;
//    }

    public static void main(String[] args) {
        ArrayList<DiLam> arr = new ArrayList<DiLam>();
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("1. Nhap thong tin danh sach nguoi di lam.");
            System.out.println("2. In danh sach nguoi di lam theo chieu tang cua luong.");
            System.out.println("3. Tim kiem theo ten.");
            System.out.println("4. Out.");
            System.out.print("Nhap lua chon ne: "); String choose = scan.next();
            switch (choose){
                case "1":
                    System.out.print("Chon 1 - nhap in4 giao vien, 2 - nhap in4 nhan vien: ");
                    String choose_temp = scan.next();
                    switch (choose_temp){
                        case "1":
                            GiaoVien gv = new GiaoVien();
                            gv.nhap();
                            arr.add(gv);
                            break;
                        case "2":
                            NhanVien nv = new NhanVien();
                            nv.nhap();
                            arr.add(nv);
                            break;
                    }
                    continue;
                case "2":
//                    arr = sapxep(arr);
                    for (DiLam x: arr){
                        x.xuat();
                    }
                    continue;
                case "3":
                    scan.nextLine();
                    System.out.print("Nhap ma giao vien or nhan vien: "); String ma = scan.nextLine();
                    timKiem(arr, ma);
                    continue;
                case "4":
                    break;
            }
            break;
        }
    }
}
