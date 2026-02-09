package lab4;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham() {}

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    public void nhap(Scanner sc) {
        System.out.print("Tên sản phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Giảm giá: ");
        giamGia = sc.nextDouble();
        sc.nextLine();
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
        System.out.println("---------------------------");
    }

    private double getThueNhapKhau() {
        return (donGia - giamGia) * 0.1;
    }

    // Getter/Setter
    public String getTenSp() { return tenSp; }
    public void setTenSp(String tenSp) { this.tenSp = tenSp; }
    public double getDonGia() { return donGia; }
    public void setDonGia(double donGia) { this.donGia = donGia; }
    public double getGiamGia() { return giamGia; }
    public void setGiamGia(double giamGia) { this.giamGia = giamGia; }
}
