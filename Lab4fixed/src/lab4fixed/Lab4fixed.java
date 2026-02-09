/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4fixed;

import java.util.Scanner;

/**
 *
 * @author Expedition 33
 */
public class Lab4fixed {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int chon = -1;
    do {
        System.out.println("\n========== LAB 4 - LỚP VÀ ĐỐI TƯỢNG ==========");
        System.out.println("1. Bài 1 & 2 (fields public + nhap/xuat)");
        System.out.println("2. Bài 3 (constructor + private thuế)");
        System.out.println("3. Bài 4 (private fields + getter/setter)");
        System.out.println("0. Thoát");
        System.out.print("Chọn bài: ");

        if (!sc.hasNextLine()) {
            System.out.println("Luồng nhập đã đóng, thoát chương trình.");
            break;
        }

        String line = sc.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("Bạn chưa nhập gì, quay lại menu.");
            continue;
        }

        try {
            chon = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số hợp lệ!");
            continue;
        }

        switch (chon) {
            case 1:
                Bai1va2.run(sc);
                break;
            case 2:
                Bai3.run(sc);
                break;
            case 3:
                Bai4.run(sc);
                break;
            case 0:
                System.out.println("Tạm biệt!");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    } while (chon != 0);

    sc.close();
}}