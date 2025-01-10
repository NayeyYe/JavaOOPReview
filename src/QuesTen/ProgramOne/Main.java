package QuesTen.ProgramOne;
//编程题：
// 编写一个Java程序，
// 尝试打开一个不存在的文件，
// 并捕获并处理FileNotFoundException（检查型异常）。

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 尝试打开一个不存在的文件
        File file = new File("nonexistent.txt");

        try{
            // 创建 Scanner 对象读取文件
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            // 捕捉并且处理FileNotFoundException
            System.out.println("文件未找到：" + e.getMessage());
        }finally {
            System.out.println("文件读取操作结束");
        }
    }
}
