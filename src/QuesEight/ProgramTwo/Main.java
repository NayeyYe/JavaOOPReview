package QuesEight.ProgramTwo;
//编程题：
// 创建一个基类Animal和一个子类Dog。
// Animal有一个成员变量name和一个构造器。
// Dog也有一个成员变量breed和一个构造器。
// 展示在创建Dog对象时成员变量的初始化顺序。
public class Main {
    public static void main(String[] args) {
        // 创建一个 Dog 对象
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // 输出 name 和 breed
        System.out.println("Name: " + myDog.getName());
        System.out.println("Breed: " + myDog.getBreed());
    }
}
