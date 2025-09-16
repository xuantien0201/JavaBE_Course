package BaiTapOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Nhập sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. In SV có ĐTB cao nhất");
            System.out.println("4. In tất cả SV yếu");
            System.out.println("5. Tìm SV theo tên");
            System.out.println("6. Tìm SV theo mã");
            System.out.println("7. Xóa SV theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã SV: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập điểm Toán: ");
                    float toan = sc.nextFloat();
                    System.out.print("Nhập điểm Lý: ");
                    float ly = sc.nextFloat();
                    System.out.print("Nhập điểm Hóa: ");
                    float hoa = sc.nextFloat();
                    sc.nextLine();
                    ql.add(new SinhVien(ten, ma, toan, ly, hoa));
                    break;
                case 2:
                    ql.dsAll();
                    break;
//                case 3:
//                    ql.inSVCoDTBCaoNhat();
//                    break;
                case 4:
                    ql.svYeu();
                    break;
//                case 5:
//                    System.out.print("Nhập tên cần tìm: ");
//                    String tenTim = sc.nextLine();
//                    ql.timTheoTen(tenTim);
//                    break;
//                case 6:
//                    System.out.print("Nhập mã cần tìm: ");
//                    String maTim = sc.nextLine();
//                    ql.timTheoMa(maTim);
//                    break;
                case 7:
                    System.out.print("Nhập mã cần xóa: ");
                    String maXoa = sc.nextLine();
                    ql.xoaSV(maXoa);
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        sc.close();
    }
}
