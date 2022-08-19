package design_menu;

import java.util.Scanner;

public class Menu {
//    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        public void menuAdmin() {
            System.out.println("❖◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛❖");
            System.out.printf("%-44s❖\n", "❖");
            System.out.printf("%-44s❖\n", "❖");
            System.out.printf("%s%26s%18s\n", "❖", "1.Đăng nhập", "❖");
            System.out.printf("%s%24s%20s\n", "❖", "2.Đăng ký", "❖");
            System.out.printf("%s%22s%22s\n", "❖", "0.Thoát", "❖");
            System.out.printf("%-44s❖\n", "❖");
            System.out.printf("%-44s❖\n", "❖");
            System.out.println("❖◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛◛❖");
            do {
                System.out.println("Xin vui lòng đăng nhập hoặc đăng ký");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        menuAdmin1();
                        break;
                    case 2:
                        System.out.println("Không cho đăng ký :)))");
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Nhập sai. Vui lòng nhập lại !");
                }
            } while (choice != 0);

        }
        public void menuAdmin1() {
            System.out.println("❐◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈❐");
            System.out.printf("%-44s❐\n", "❐");
            System.out.printf("%s%30s%14s\n", "❐", "1.Quản lý người dùng", "❐");
            System.out.printf("%s%24s%20s\n", "❐", "2.Quản lý hàng hóa", "❐");
            System.out.printf("%s%32s%12s\n", "❐", "3.Quản lý đơn đặt hàng", "❐");
            System.out.printf("%s%17s%27s\n", "❐", "0.Thoát", "❐");
            System.out.printf("%-44s❐\n", "❐");
            System.out.println("❐◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈❐");
            do {
                System.out.println("Nhập đến nơi bạn muốn quản lý");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        menuAdmin2();
                        break;
                    case 2:
                        menuAdmin3();
                        break;
                    case 3:
                        menuAdmin4();
                        break;
                    case 0:
                        System.out.println("Tạm biệt");
                        System.exit(0);
                    default:

                }
            } while (choice != 4);
        }

        public void menuAdmin2() {
            System.out.println("웃▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬웃");
            System.out.printf("%-42s✉▋웃\n", "웃▋✆");
            System.out.printf("%s%30s%14s\n", "웃▋", "1.Thêm người dùng", "▋웃");
            System.out.printf("%s%29s%15s\n", "웃▋", "2.Sửa người dùng", "▋웃");
            System.out.printf("%s%29s%15s\n", "웃▋", "3.Xóa người dùng", "▋웃");
            System.out.printf("%s%23s%21s\n", "웃▋", "4.Quay lại", "▋웃");
            System.out.printf("%s%20s%24s\n", "웃▋", "0.Thoát", "▋웃");
            System.out.printf("%-42s☎▋웃\n", "웃▋✍");
            System.out.println("웃▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬웃");
        }

        public void menuAdmin3() {
            System.out.println("�◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘�");
            System.out.printf("%-43s❂�\n", "�❂");
            System.out.printf("%s%30s%15s\n", "�", "1.Thêm sản phẩm", "�");
            System.out.printf("%s%29s%16s\n", "�", "2.Sửa sản phẩm", "�");
            System.out.printf("%s%29s%16s\n", "�", "3.Xóa sản phẩm", "�");
            System.out.printf("%s%25s%20s\n", "�", "4.Quay lại", "�");
            System.out.printf("%s%22s%23s\n", "�", "0.Thoát", "�");
            System.out.printf("%-43s❂�\n", "�❂");
            System.out.println("�◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘�");
        }

        public void menuAdmin4() {
            System.out.println("✬⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿✬");
            System.out.printf("%-43sდ✬\n", "✬დ");
            System.out.printf("%s%30s%15s\n", "✬", "1.Thêm đơn hàng", "✬");
            System.out.printf("%s%29s%16s\n", "✬", "2.Sửa đơn hàng", "✬");
            System.out.printf("%s%29s%16s\n", "✬", "3.Xóa đơn hàng", "✬");
            System.out.printf("%s%25s%20s\n", "✬", "4.Quay lại", "✬");
            System.out.printf("%s%22s%23s\n", "✬", "0.Thoát", "✬");
            System.out.printf("%-43sდ✬\n", "✬დ");
            System.out.println("✬⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿⦿✬");
        }

    }

//}



