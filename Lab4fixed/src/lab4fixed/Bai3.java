package lab4fixed;
import java.util.Scanner;

public class Bai3 {
    public String tenSp;
    public double donGia;
    public double giamGia;

    public Bai3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public Bai3(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }
    private double getThueNhapKhau() {
        return donGia * 0.10;
    }
    public void xuat() {
        System.out.println("\nTên sản phẩm: " + tenSp);
        System.out.printf("Đơn giá     : %.2f\n", donGia);
        System.out.printf("Giảm giá    : %.2f\n", giamGia);
        System.out.printf("Thuế nhập khẩu: %.2f\n", getThueNhapKhau());
        System.out.println("---------------------");
    }

    // thay vì main, viết run
    public static void run(Scanner sc) {
        System.out.println("=== BÀI 3 - Sử dụng constructor ===");
        Bai3 sp1 = new Bai3("Laptop Dell XPS", 28000000, 1500000);
        Bai3 sp2 = new Bai3("Tai nghe Sony", 1800000);

        System.out.println("Thông tin sản phẩm:");
        sp1.xuat();
        sp2.xuat();

        System.out.println("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
    }
}
