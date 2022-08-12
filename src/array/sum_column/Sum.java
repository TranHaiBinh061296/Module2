package array.sum_column;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập mảng  2 chiều
        System.out.println("Enter row and column : ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) Math.floor(Math.random() * (10 - 2 + 1) + 2);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        // nhập vào stt 1 cột
        System.out.println("Enter column :");
        int number = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == number) {
                    sum += arr[i][j];
                }
            }
        }
        // tổng cột đó.
        System.out.print("Sum is: " + sum);
    }
}
