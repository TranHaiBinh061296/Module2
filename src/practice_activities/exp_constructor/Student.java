package practice_activities.exp_constructor;

public class Student {
    int id;
    String name;

    Student(int i,String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id+" "+name);
    }

    public static void main(String args[]) {
        Student s1 = new Student(0612,"Binh");
        Student s2 = new Student(699,"Khanh");
        s1.display();
        s2.display();
    }
}
