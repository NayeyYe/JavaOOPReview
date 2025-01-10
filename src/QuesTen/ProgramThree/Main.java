package QuesTen.ProgramThree;
//编程题：
// 编写一个Java程序，
// 演示在try-catch块中打开一个资源，
// 并在finally块中确保资源被关闭。

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 定义文件路径
        File file = new File("example.txt");
        Scanner scanner = null;

        try{
            // 打开文件
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch(FileNotFoundException e ){
            // 捕捉并且处理异常
            System.out.println("文件未找到: " + e.getMessage());
        }finally {
            // 确保资源被关闭
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner 已关闭");
            }
        }
    }

}
