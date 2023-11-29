/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
     public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
         Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên theo ID");
            System.out.println("3. Tìm sinh viên theo tên");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm giảm dần");
            System.out.println("5. Hiển thị danh sách sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng (0-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    
                    studentService.addStudent();
                    break;
                case 2:
                    
                    studentService.deleteStudent();
                    break;
                case 3:
                    
                    studentService.searchStudent(studentService, scanner);
                    break;
                case 4:
                    
                    studentService.sortedStudent();
                    System.out.println("Danh sách sinh viên đã được sắp xếp theo điểm giảm dần.");
                    break;
                case 5:
                    
                    studentService.showAllStudent();
                    break;
                case 0:
                   
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
