package QuesFourteen.ProgramTwo;
//编程题：
// 创建一个自定义异常InvalidDataException，
// 并在处理特定业务逻辑时抛出此异常。
public class Main {
    public static void main(String[] args) {
        DataValidator validator = new DataValidator();

        try {
            // 测试空数据
            validator.validateData("");
        } catch (InvalidDataException e) {
            System.err.println("错误: " + e.getMessage() + "，错误代码: " + e.getErrorCode());
        }

        try {
            // 测试短数据
            validator.validateData("abc");
        } catch (InvalidDataException e) {
            System.err.println("错误: " + e.getMessage() + "，错误代码: " + e.getErrorCode());
        }

        try {
            // 测试有效数据
            validator.validateData("abcdef");
        } catch (InvalidDataException e) {
            System.err.println("错误: " + e.getMessage() + "，错误代码: " + e.getErrorCode());
        }
    }
}
