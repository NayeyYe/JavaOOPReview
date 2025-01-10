package QuesTen.ProgramFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//编程题：
// 编写一个方法，
// 该方法接受一个文件路径作为参数，
// 并在尝试打开文件时捕获IOException，
// 同时将原始异常作为新异常的cause抛出。
public class Main {
    // 方法：尝试打开文件并且读取内容
    public static void readFile(String filePath) throws FileReadException{
        File file = new File(filePath);
        Scanner scanner = null;

        try{
            // 尝试打开文件
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch(FileNotFoundException e){
            // 捕获 FileNotFoundException异常，并且抛出自定义异常
            throw new FileReadException("文件未找到: " + filePath, e);
        }finally {
            // 确保资源被关闭
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner 已关闭");
            }
        }
    }

    public static void main(String[] args) {
        // 测试文件路径
        String filePath = "nonexistent.txt";

        try {
            // 调用方法读取文件
            readFile(filePath);
        } catch (FileReadException e) {
            // 捕获并处理自定义异常
            System.out.println("捕获异常: " + e.getMessage());
            System.out.println("原始异常: " + e.getCause().getMessage());
        }
    }
}
