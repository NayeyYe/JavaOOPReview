package QuesFifteen.ProgramOne;

abstract class Shape {
    // 抽象方法，子类必须实现
    public abstract double calculateArea();

    // 具体方法，子类可以继承
    public void displayArea() {
        System.out.println("面积: " + calculateArea());
    }
}
