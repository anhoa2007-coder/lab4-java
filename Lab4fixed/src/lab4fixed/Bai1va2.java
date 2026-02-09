package lab4fixed;

import java.util.Scanner;

public class Bai1va2 {
    public String tenSp;
    public double donGia;
    public double giamGia;

    public double getThueNhapKhau() {
        return donGia * 0.10;
    }

    // Dùng Scanner truyền từ ngoài vào, không tạo mới
    public void nhap(Scanner sc) {
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
        sc.nextLine(); // bỏ qua Enter
    }

    public void xuat() {
        System.out.println("\nTên sản phẩm: " + tenSp);
        System.out.printf("Đơn giá     : %.2f\n", donGia);
        System.out.printf("Giảm giá    : %.2f\n", giamGia);
        System.out.printf("Thuế nhập khẩu: %.2f\n", getThueNhapKhau());
        System.out.println("---------------------");
    }

    // Viết hàm run thay vì main, để gọi từ menu
    public static void run(Scanner sc) {
        System.out.println("=== BÀI 1 & 2 - Tạo 2 sản phẩm nhập từ bàn phím ===");
        Bai1va2 sp1 = new Bai1va2();
        System.out.println("Nhập sản phẩm 1:");
        sp1.nhap(sc);

        Bai1va2 sp2 = new Bai1va2();
        System.out.println("\nNhập sản phẩm 2:");
        sp2.nhap(sc);

        System.out.println("\n=== THÔNG TIN SẢN PHẨM ===");
        sp1.xuat();
        sp2.xuat();
        System.out.println("\nNhấn Enter để tiếp tục..."); 
    sc.nextLine();
    }
    
}
