package Exercise05;

public class ProductManagement {
//    Quản lý sản phẩm
//    Thuộc tính private
    private String id;
    private String name;
    private double price;

//    Constructor mặc định
    public ProductManagement(){

    }
//    Constructor tham số

    public ProductManagement(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
//    Getter và Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "ID: " + id + " Tên: " + name + " Giá: " + price;
    }
}
