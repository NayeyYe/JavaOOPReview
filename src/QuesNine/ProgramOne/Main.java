package QuesNine.ProgramOne;
//编程题：
// 创建一个类MathUtils，
// 包含一个静态方法add(int a, int b)
// 和一个非静态方法subtract(int a, int b)。
// 在主方法中调用这两个方法，并解释调用方式的不同。
public class Main {
    public static void main(String[] args) {
        // 调用静态方法：直接通过类名调用
        int sum = MathUtils.add(10, 5);
        System.out.println("10 + 5 = " + sum);

        // 调用非静态方法：需要创建对象
        MathUtils mathUtils = new MathUtils();
        int difference = mathUtils.subtract(10, 5);
        System.out.println("10 - 5 = " + difference);
    }
}
