package QuesFourteen.ProgramOne;
//编程题：编写一个Java程序，
// 尝试解析用户输入的整数，
// 并处理可能发生的NumberFormatException。


import java.util.Scanner;

public class NumberParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数: ");

        try {
            // 尝试解析用户输入的整数
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("解析的整数是: " + number);
        } catch (NumberFormatException e) {
            // 捕获并处理NumberFormatException
            System.err.println("输入的不是有效的整数: " + e.getMessage());
        } finally {
            // 关闭Scanner
            scanner.close();
            System.out.println("Scanner已关闭。");
        }
    }
}
