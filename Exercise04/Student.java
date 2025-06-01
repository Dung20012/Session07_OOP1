package Exercise04;

public class Student {
//    Quản lý sinh viên theo điểm trung bình
//    Thuộc tính private
    private String name;
    private int age;
    private String className;
    private double avgScore;

//    Constructor mặc định
    public Student(){

    }
//    Constructor tham số

    public Student(String name, int age, String className, double avgScore) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.avgScore = avgScore;
    }

//    Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }
    public String toString(){
        return "Tên: " + name + " Tuổi: " + age + " Lớp: " + className + " Điểm TB: " + avgScore;
    }
}
