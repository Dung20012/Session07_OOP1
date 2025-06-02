package Exercise05;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
//        Khởi tạo Sanner
        Scanner scanner = new Scanner(System.in);
        ProductManagement[] products = new ProductManagement[100]; // lữu trữ tối đa 100 sản phẩm

        int count = 0;
        int choice;
        do {
//            Khởi tạo Menu
            System.out.println("*****Menu:*****");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
//                    Thêm mới sản phẩm
                    System.out.println("Nhập ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Nhật tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    products[count] = new ProductManagement(id, name, price);
                    count++;
                    System.out.println("Đã thêm mới sản phẩm");
                    break;
                case 2:
//                    Hiển thị danh sách sản phầm
                    System.out.println("**Danh sách sản phẩm**");
                    if (count == 0){
                        System.out.println("Chưa có sản phẩm nào");
                    }else {
                        for (int i = 0; i < count; i++){
                            System.out.println(products[i]);
                        }
                    }
                    break;
                case 3:
//                      Cập nhật sản phẩm
                    System.out.println("Nhập ID sản phẩm cần cập nhật ");
                    String updateId = scanner.nextLine();
                    boolean foundUpdate = false;
                    for (int i = 0; i < count; i++){
                        if (products[i].getId().equals(updateId)){
                            System.out.println("Nhập tên mới");
                            products[i].setName(scanner.nextLine());
                            System.out.println("Nhập giá mới");
                            products[i].setPrice(Double.parseDouble(scanner.nextLine()));
                            System.out.println("Sản phẩm đã được cập nhật");
                            foundUpdate = true;
                        }
                    }
                    if (!foundUpdate){
                        System.out.println("Không tìm thấy sản phẩm với ID: " + updateId);
                    }
                    break;
                case 4:
//                    Xóa sản phẩm
                    System.out.println("Nhập ID sản phẩm cần xóa");
                    String deleteId = scanner.nextLine();
                    boolean delete = false;
                    for (int i = 0; i < count; i++){
                        if (products[i].getId().equals(deleteId)){
//                            Dời phẩn tử sau lên trước
                            for (int j = i; j < count - 1; j++){
                                products[j] = products[j + 1];
                            }
                            products[count - 1] = null;
                            count--;
                            delete = true;
                            System.out.println("Sản phẩm đã được xóa");
                        }
                    }
                    if (!delete){
                        System.out.println("Không tìm thấy sản phẩm nào với ID: " + deleteId);
                    }
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("Thoát chương trình");
                    break;
                default:
               System.out.println("Lựa chọn không hợp lệ");
            }
        }while (true);
    }
}
