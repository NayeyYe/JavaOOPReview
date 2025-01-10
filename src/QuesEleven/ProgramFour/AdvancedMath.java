package QuesEleven.ProgramFour;

public class AdvancedMath extends MathUtils{
    // 尝试重写静态方法
    public static int add(int a, int b) {
        System.out.println("调用 AdvancedMath 的 add 方法");
        return a + b + 10; // 添加额外的逻辑
    }
}
