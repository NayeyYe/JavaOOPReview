package QuesTwo.ProgramTwo;
// 创建一个方法，
// 该方法接受一个整数数组并检查其中是否包含负数。
//如果包含，则抛出一个IllegalArgumentException（Checked异常），并在方法调用处进行处理。
public class CheckArray {
    public static void checkForNegativeNumbers(int[] array) throws IllegalArgumentException {
        for(int num : array)
        {
            if (num < 0){
                throw new IllegalArgumentException("数组中有负数：" + num);
            }
        }
        System.out.println("数组中没有负数");
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, -2, 3, -4, 5};
        // 调用方法捕获异常
        try{
            System.out.println("检查数组1：");
            checkForNegativeNumbers(array1);

            System.out.println("\n检查数组2");
            checkForNegativeNumbers(array2);
        }catch(IllegalArgumentException e){
            // 捕获到异常处理
            System.out.println("捕获到异常：" + e.getMessage());
        }
    }
}
