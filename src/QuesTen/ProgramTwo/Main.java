package QuesTen.ProgramTwo;
//编程题：
// 编写一个方法，
// 当传入的整数数组包含负数时，
// 抛出IllegalArgumentException，
// 并在主方法中测试这个行为。
public class Main {
    // 方法：检查数组中是否包含负数
    public static void checkForNegativeNumbers(int[] numbers){
        for (int num : numbers){
            if (num < 0){
                // 抛出异常 IllegalArgumentException
                throw new IllegalArgumentException("数组中包含负数：" + num);
            }
        }
        System.out.println("数组中没有负数");
    }

    // main
    public static void main(String[] args) {
        // 测试数组
        int[] validArray = {1, 2, 3, 4};
        int[] invalidArray = {1, -2, 3, 4};

        try{
            // 测试合法数组
            System.out.println("测试合法数组:");
            checkForNegativeNumbers(validArray);

            // 测试非法数组
            System.out.println("测试非法数组:");
            checkForNegativeNumbers(invalidArray);
        } catch (IllegalArgumentException e) {
            // 捕获并处理异常
            System.out.println("捕获异常: " + e.getMessage());
        }
    }
}
