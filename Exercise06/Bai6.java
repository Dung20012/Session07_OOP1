package Exercise06;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
//        Khởi tạo Scanner
        Scanner scanner = new Scanner(System.in);
//        Khởi tạo mảng
        CategoryManagement[] categorys = new CategoryManagement[100];

        int count = 0;
        int choice;

        do {
//            Khởi tạo menu
            System.out.println("Menu:");
            System.out.println("1: Thêm mới danh mục ");
            System.out.println("2: Hiển thị danh sách danh mục ");
            System.out.println("3: Cập nhật danh mục danh mục ");
            System.out.println("4: Xóa danh mục danh mục ");
            System.out.println("5: Tìm kiếm danh mục theo tên ");
            System.out.println("6: Thoát ");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
//                      Thêm mới danh mục
                    System.out.println("Nhập ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập mô tả: ");
                    String description = scanner.nextLine();
                    categorys[count] = new CategoryManagement(id, name, description);
                    count++;
                    System.out.println("Danh mục đã được thêm.");
                    break;
                case 2:
//                    Hiển thị danh sách danh mục
                    System.out.println("Danh sách danh mục:");
                    if (count == 0){
                        System.out.println("Chưa có danh mục nào.");
                    }else {
                        for (int i = 0; i < count; i++){
                            System.out.println(categorys[i]);
                        }
                    }
                    break;
                case 3:
//                    Cập nhật danh mục
                    System.out.println("Nhập ID danh mục cần cập nhật");
                    String updateID = scanner.nextLine();
                    boolean foundUpdate = false;
                    for (int i = 0; i < count; i++){
                        if (categorys[i].getId().equals(updateID)){
                            System.out.println("Nhập ID danh mục cần cập nhật: ");
//                            sao của em id nó cứ lặp lại 2 lần
                            categorys[i].setId(scanner.nextLine());
                            System.out.println("Nhập tên mới: ");
                            categorys[i].setName(scanner.nextLine());
                            System.out.println("Nhập mô tả mới: ");
                            categorys[i].setDescription(scanner.nextLine());
                            System.out.println("Danh mục đã được cập nhật");
                            foundUpdate = true;
                            break;
                        }
                    }
                    if (!foundUpdate){
                        System.out.println("Không tìm thấy tên danh mục với ID cần tìm" + updateID);
                    }
                    break;
                case 4:
//                    Xóa danh mục
                    System.out.println("Nhập ID danh mục cần xóa: ");
                    String deleteID = scanner.nextLine();
                    boolean delete = false;
                    for (int i = 0; i < count; i++){
                        if (categorys[i].getId().equals(deleteID)){
                            for (int j = i; j < count -1; j++){
                                categorys[i] = categorys[i + 1];
                            }
                            categorys[count - 1] = null;
                            count--;
                            delete = true;
                            System.out.println("Danh mục đã được xóa");
                        }
                    }
                    if (!delete){
                        System.out.println("Không tìm thấy danh mục nào với ID: " + deleteID);
                    }
                    break;
                case 5:
//                    Tìm kiếm danh mục theo tên
                    System.out.println("Nhập tên danh mục cần tìm: ");
                    String searchName = scanner.nextLine().toLowerCase(); // chuyển về chứ thường
                    boolean findName = false;

                    for (int i = 0; i < count; i++){
//                        Tìm 1 phần tử trong tên
                        if (categorys[i].getName().toLowerCase().contains(searchName)){
                            System.out.println(categorys[i]);
                            findName = true;
                        }
                    }
                    if (!findName){
                        System.out.println("Không tìm thấy danh mục nào có tên: " + searchName);
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }while (true);
    }
}
