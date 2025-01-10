package QuesFifteen.ProgramThree;
//编程题：
// 编写一个程序，
// 使用Java集合框架实现一个简单的电话簿，
// 允许添加、删除和查找联系人信息。

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n请选择操作:");
            System.out.println("1. 添加联系人");
            System.out.println("2. 删除联系人");
            System.out.println("3. 查找联系人");
            System.out.println("4. 显示所有联系人");
            System.out.println("5. 退出");
            System.out.print("请输入选项: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 消耗换行符

            switch (choice) {
                case 1:
                    System.out.print("请输入联系人姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("请输入联系人电话: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("请输入要删除的联系人姓名: ");
                    String deleteName = scanner.nextLine();
                    phoneBook.deleteContact(deleteName);
                    break;
                case 3:
                    System.out.print("请输入要查找的联系人姓名: ");
                    String findName = scanner.nextLine();
                    phoneBook.findContact(findName);
                    break;
                case 4:
                    phoneBook.displayAllContacts();
                    break;
                case 5:
                    running = false;
                    System.out.println("退出程序。");
                    break;
                default:
                    System.out.println("无效选项，请重新选择。");
            }
        }

        scanner.close();

    }

}
