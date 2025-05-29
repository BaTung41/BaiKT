package BaiKiemTraJava;

import java.util.Scanner;

public class Person {
    String Name;
    int Age;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        Name = sc.nextLine();
        while (true) {
            try {
                System.out.println("Nhập tuổi: ");
                Age = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Tuổi phải là số nguyên. Vui lòng nhập lại.");
            }
        }
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + Name);
        System.out.println("Tuổi: " + Age);
    }

}
