package QuesTen.ProgramFour;
//编程题：
// 创建一个自定义异常InvalidAgeException，
// 并在处理用户年龄输入时抛出这个异常。
public class Main {
    public static void checkAge(int age) throws InterruptedException {
        if (age < 0 || age > 120){
            // 抛出自定义异常
            throw new InterruptedException("年龄无效: " + age + "。年龄必须在 0 到 120 之间。");
        }
        System.out.println("年龄有效: " + age);
    }
    // main
    public static void main(String[] args) {
        // 测试年龄
        int[] ages = {25, -5, 130};

        for (int age : ages) {
            try{
                // 检查年龄
                checkAge(age);
            }catch (InterruptedException e){
                // 捕获并处理自定义异常
                System.out.println(e.getMessage());
            }
        }
    }
}
