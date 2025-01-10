package QuesFourteen.ProgramFive;
//编程题：
// 编写一个Java程序，
// 使用try-catch-finally块打开和关闭文件。
// 确保即使在发生异常的情况下，文件也能被正确关闭。

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // 打开文件
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            // 读取文件内容
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // 捕获并处理异常
            System.err.println("读取文件时发生错误: " + e.getMessage());
        } finally {
            // 确保文件流被关闭
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("文件流已关闭。");
                } catch (IOException e) {
                    System.err.println("关闭文件流时发生错误: " + e.getMessage());
                }
            }
        }
    }
}
