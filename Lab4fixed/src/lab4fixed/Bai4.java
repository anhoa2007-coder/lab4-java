package lab4fixed;
import java.util.Scanner;

public class Bai4 {

    private String tenSp;
    private double donGia;
    private double giamGia;

    public Bai4(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public Bai4(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }
    public String getTenSp() { return tenSp; }
    public void setTenSp(String tenSp) { this.tenSp = tenSp; }
    public double getDonGia() { return donGia; }
    public void setDonGia(double donGia) { this.donGia = donGia; }
    public double getGiamGia() { return giamGia; }
    public void setGiamGia(double giamGia) { this.giamGia = giamGia; }

    private double getThueNhapKhau() {
        return donGia * 0.10;
    }
    public void xuat() {
        System.out.println("\nTên sản phẩm: " + getTenSp());
        System.out.printf("Đơn giá     : %.2f\n", getDonGia());
        System.out.printf("Giảm giá    : %.2f\n", getGiamGia());
        System.out.printf("Thuế nhập khẩu: %.2f\n", getThueNhapKhau());
        System.out.println("---------------------");
    }
    public static void run(Scanner sc) {
        System.out.println("=== BÀI 4 - Private fields + Getter/Setter ===");
        Bai4 sp1 = new Bai4("Điện thoại iPhone 15", 25000000, 2000000);
        Bai4 sp2 = new Bai4("Máy tính bảng iPad", 12000000);
        sp2.setGiamGia(800000);
        sp1.xuat();
        sp2.xuat();
        System.out.println("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
    }
}
