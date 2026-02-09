package lab4;

import java.util.Scanner;

/**
 * @author Expedition 33
 */
public class Lab4 {
    static void menu() {
        System.out.println("===== MENU LAB =====");
        System.out.println("1. Lab1");
        System.out.println("2. Lab2");
        System.out.println("3. Lab3");
        System.out.println("4. Lab4");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            menu();
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1: Lab4Bai1.run(); break;
                case 2: Lab4Bai2.run(); break;
                case 3: Lab3.run(); break;
                case 4: Lab4.run(); break;
                case 0: System.out.println("Tạm biệt!"); break;
                default: System.out.println("Không hợp lệ!");
            }
            System.out.println("----------------------");
        } while (chon != 0);
        sc.close();
    }
