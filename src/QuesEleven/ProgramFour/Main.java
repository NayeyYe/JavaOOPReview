package QuesEleven.ProgramFour;
//编程题：
// 创建一个基类MathUtils，
// 其中包含一个静态方法add(int a, int b)。
// 尝试在子类AdvancedMath中重写这个方法。
public class Main {
    public static void main(String[] args) {
        // 通过基类调用静态方法
        System.out.println("MathUtils.add(2, 3): " + MathUtils.add(2, 3));

        // 通过子类调用静态方法
        System.out.println("AdvancedMath.add(2, 3): " + AdvancedMath.add(2, 3));

        // 多态：父类引用指向子类对象
        MathUtils mathUtils = new AdvancedMath();
        System.out.println("mathUtils.add(2, 3): " + MathUtils.add(2, 3)); // 调用的是 MathUtils 的 add 方法
    }
}
