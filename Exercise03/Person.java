package Exercise03;

public class Person {
//    So sánh tuổi của 2 đối tượng Person
//    Thuộc tính private
    private String name;
    private int age;

//    Getter cho name
    public String getName(){
        return name;
    }
//    Setter cho name
    public void setName(String name){
        this.name = name;
    }
//    Getter cho age
    public int getAge(){
        return age;
    }
//    Setter cho age và ktra tính hợp lệ
    public void setAge(int age){
        this.age = age;
    }
}
