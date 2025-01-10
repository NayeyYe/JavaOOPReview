package QuesFifteen.ProgramTwo;
//编程题：
// 创建一个泛型类Box<T>，
// 它包含一个泛型类型T的私有成员变量，
// 并提供相应的getter和setter方法。
// 然后创建一个泛型接口ComparableBox<T>，
// 其中包含一个比较两个泛型类型对象的方法。
public class Main {
    public static void main(String[] args) {
        // 测试泛型类Box<T>
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics!");
        System.out.println(stringBox);

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(42);
        System.out.println(integerBox);

        // 测试泛型接口ComparableBox<T>
        ComparableBoxImpl<Integer> comparableBox1 = new ComparableBoxImpl<>(10);
        ComparableBoxImpl<Integer> comparableBox2 = new ComparableBoxImpl<>(20);

        System.out.println("比较结果: " + comparableBox1.compareTo(comparableBox2.getContent()));
    }
}
