package QuesTwo.ProgramFour;
//编写一个方法，
// 该方法接受一个字符串参数并检查是否为空。
// 如果为空，则使用throw关键字抛出一个NullPointerException。
public class DifferenceFromThrowAndThrows {
    // 检查字符串是否为null或者空字符串
    public static void checkString(String str){
        // 检查字符串是否为空字符串
        if (str == null || str.isEmpty()){
            // 抛出异常NullPointerException
            throw new NullPointerException("字符串不能为空");
        }
        System.out.println("字符串有效"+str);
    }

    public static void main(String[] args) {
        // 测试字符串
        String str1 = "Hello";
        String str2 = "";
        String str3 = null;

        // 调用方法
        try{
            System.out.println("检查字符串1：");
            checkString(str1);

            System.out.println("\n检查字符串2：");
            checkString(str2);

            System.out.println("\n检查字符串3");
            checkString(str3);
        }catch (NullPointerException e){
            System.err.println("捕获到异常：" + e.getMessage());
        }
    }
}