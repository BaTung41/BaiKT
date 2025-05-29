package BaiKiemTraJava;

import java.util.Scanner;
import java.util.ArrayList;

public class Employee extends Person {
    String EmployeeID;
    Float Score;

    public static ArrayList<Employee> arrListEmp = new ArrayList<>();

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        EmployeeID = sc.nextLine();
        System.out.print("Nhập điểm: ");
        Score = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Mã nhân viên: " + EmployeeID);
        System.out.println("Điểm: " + Score);
    }

    public static void themEmployee() {
        Employee emp = new Employee();
        emp.nhapThongTin();
        arrListEmp.add(emp);
    }

    public static void suaEmployeeTheoID(String id) {
        boolean found = false;
        for (Employee emp : arrListEmp) {
            if (emp.EmployeeID.equals(id)) {
                System.out.println("Nhập lại thông tin cho nhân viên có mã: " + id);
                emp.nhapThongTin();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với mã: " + id);
        }
    }

    public static void hienThiTatCaEmployee() {
        if (arrListEmp.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
        } else {
            for (Employee emp : arrListEmp) {
                emp.hienThiThongTin();
                System.out.println("----------------------");
            }
        }

    }
}
