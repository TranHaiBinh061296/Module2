package array.Find_element_in_aray;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String[] students = {"Bình", "Khanh", "Lộc", "Hiếu", "Tùng", "Tài", "Hà", "Hướng"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học viên bạn muốn tìm : ");
        String input_name = sc.next();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input_name)) {
                System.out.println("Học viên bạn muốn tìm là " + input_name + " ở vị trí " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println(input_name + " không có trong danh sách học viên bạn muốn tìm");
        }
    }
}
