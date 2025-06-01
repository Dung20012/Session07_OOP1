package Exercise03;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
//        Khởi tạo Scanner
        Scanner scanner = new Scanner(System.in);

//    Khởi tạo Person
        Person person1 = new Person();
        Person person2 = new Person();

//    Nhập thông tin cho person 1
        System.out.println("Nhập tên người thứ 1: ");
        person1.setName(scanner.nextLine());
        System.out.println("Nhập tuổi người thứ 1: ");
        person1.setAge(scanner.nextInt());
        scanner.nextLine(); // xóa dòng thừa sau nextInt()

//        Nhập thông tin cho person 2
        System.out.println("Nhập tên người thứ 2: ");
        person2.setName(scanner.nextLine());
        System.out.println("Nhập tuổi người thứ 2: ");
        person2.setAge(scanner.nextInt());

//        So sánh và in kết quả ai lớn tuổi hơn
        if (person1.getAge() > person2.getAge()){
            System.out.println(person1.getName()+ " lớn tuổi hơn");
        } else if (person1.getAge() < person2.getAge()) {
            System.out.println(person2.getName()+ " lớn tuổi hơn");
        }else {
            System.out.println("Hai người bằng tuổi nhau");
        }
    }
}
