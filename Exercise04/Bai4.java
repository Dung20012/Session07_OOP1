package Exercise04;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//        Mảng lưu trữ sinh viên
        Student[] studentArray = new Student[5];

//        Tạo danh sách sinh viên
        studentArray[0] = new Student("Alice", 20, "A1",8.5);
        studentArray[1] = new Student("Bob", 21, "A1",7.0);
        studentArray[2] = new Student("Charlie", 19, "A2",9.5);
        studentArray[3] = new Student("David", 22, "A2",6.5);
        studentArray[4] = new Student("Evar", 20, "A1",8.0);

//        Khởi tạo Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm min: ");
        double min = scanner.nextDouble();
        System.out.println("Nhập điểm max: ");
        double max = scanner.nextDouble();

//        Hiển thị danh sách sinh viên theo điểm
        System.out.println("Danh sách sinh viên theo điểm: ");
        for (Student student : studentArray){
            if (student.getAvgScore() >= min && student.getAvgScore() <= max){
                System.out.println(student);
            }
            if (min > max){
                System.out.println("Điểm min không được lớn hơn max");
                return;
            }
        }
        scanner.close();
    }
}
