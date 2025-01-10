package QuesFour.ProgramFive;
// 编程题：
// 设计一个Car类，
// 包含model、year和color属性，
// 以及使用this关键字链式调用的多个构造器。
public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("China", 2020);
        Car car3 = new Car("China", 2020, "Red");

        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
    }
}
