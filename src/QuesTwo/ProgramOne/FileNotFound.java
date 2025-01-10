package QuesTwo.ProgramOne;
//尝试打开并读取一个不存在的文件，
// 并在catch块中处理FileNotFoundException，
// 在finally块中释放资源。

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileNotFound {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            File file = new File("nonexistent_file.txt");
            fileInputStream = new FileInputStream(file);

            // 如果文件存在，读取文件内容
            int data;
            while((data = fileInputStream.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found " + e.getMessage());
        }catch (IOException e) {
            System.err.println("I/O error" + e.getMessage());
        }finally {
            // 释放资源，关闭文件流
            if(fileInputStream != null) {
                try{
                    fileInputStream.close();
                    System.out.println("File closed");
                }catch (IOException e) {
                    System.err.println("I/O error" + e.getMessage());
                }
            }
        }
    }
}
