package QuesFourteen.ProgramFour;
//编程题：
// 编写一个程序，
// 该程序包含一个可能抛出Checked异常的方法，
// 并在调用处适当处理这个异常。

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String content = readFile("example.txt");
            System.out.println("文件内容: " + content);
        } catch (IOException e) {
            System.err.println("读取文件时发生错误: " + e.getMessage());
        }
    }

    // 可能抛出Checked异常的方法
    public static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("关闭文件时发生错误: " + e.getMessage());
                }
            }
        }

        return content.toString();
    }
}
