package array.Find_max_element;


import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài : ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Độ dài vượt quá cho phép !");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập các tài sản " + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Danh sách tài sản : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max;
        max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if(array[j] > max) {
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("Giá trị lớn nhất là " + max + " ở vị trí " + index);
    }
}
