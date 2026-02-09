/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Expedition 33
 */
public class Lab4Bai2 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        System.out.println("Nhập sản phẩm 1:");
        sp1.nhap(sc);
        System.out.println("Nhập sản phẩm 2:");
        sp2.nhap(sc);

        System.out.println("\nThông tin sản phẩm:");
        sp1.xuat();
        sp2.xuat();
    }
}

    
}
