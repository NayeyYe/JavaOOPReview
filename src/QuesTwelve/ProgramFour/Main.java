package QuesTwelve.ProgramFour;
//编程题：
// 编写一个泛型方法，
// 返回一个泛型类型的数组，
// 并尝试将返回值转换为特定类型的数组。
import java.util.Arrays;

public class Main {
    // 泛型方法：返回一个泛型类型的数组
    public static <T> T[] createArray(T... elements){
        return elements;
    }

    public static void main(String[] args) {
        // 调用泛型方法，创建Integer数组
        Integer[] intArray = createArray(1, 2, 3);
        System.out.println("Integer 数组: " + Arrays.toString(intArray));

        // 尝试放回值转换为String数组
        try{
            Character[] strArray = createArray('A', 'B', 'C');
            System.out.println("Character数组: " + Arrays.toString(strArray));
        }catch (ClassCastException e ){
            System.out.println("类型转换失败: " + e.getMessage());
        }

        // 尝试将 Integer 数组转换为 Number 数组
        Number[] numArray = intArray; // 数组协变
        System.out.println("Number 数组: " + Arrays.toString(numArray));
    }
}
