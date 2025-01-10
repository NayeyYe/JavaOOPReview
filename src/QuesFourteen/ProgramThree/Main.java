package QuesFourteen.ProgramThree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//编程题：
// 编写一个方法，
// 该方法打开一个文件并读取内容。
// 在捕获IOException的同时，
// 将原始异常包装在新的异常中抛出。
public class Main {
    public static void readFile(String filePath) throws FileReadException {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new FileReadException("读取文件时发生错误", e);
        }finally {
            if (reader != null){
                try{
                    reader.close();
                }catch (IOException e){
                    System.err.println("关闭文件时发生错误: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        try{
            readFile("nonexistent.txt");
        }catch (FileReadException e ){
            System.err.println("捕获到异常: " + e.getMessage());
            System.err.println("原始异常: " + e.getCause().getMessage());
        }
    }
}
