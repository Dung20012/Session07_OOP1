package Exercise06;

public class CategoryManagement {
//    Quản lý danh mục
//    Thuoc tính private
    private String id;
    private String name;
    private String description;

//    Constructor mặc định
    public CategoryManagement(){
    }
//    Constructor tham số

    public CategoryManagement(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "ID: " + id + " Tên: " + name + " Mô tả: " + description;
    }
}
