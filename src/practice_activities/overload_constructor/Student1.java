package practice_activities.overload_constructor;

public class Student1 {
    int id;
    String name;
    int age;

    // Constructor có 2 tham số
    Student1(int i,String n){
        id = i;
        name = n;
    }

    // Constructor có 3 tham số
    Student1(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }

    // Phương thức
    void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]){
        // Tạo đối tượng và truyền vào 2 tham số
        Student1 s1 = new Student1(0612, "Hải Bình"); //0 là giá trị mặc định của kiểu int

        // Tạo đối tượng và truyền vào 3 tham số
        Student1 s2 = new Student1(69, "A Lộc sa đô", 18);

        // Gọi phương thức
        s1.display();
        s2.display();
    }
}
