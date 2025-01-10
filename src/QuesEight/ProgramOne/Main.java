package QuesEight.ProgramOne;
//编程题：
// 创建一个基类Vehicle和一个子类Car。
// Vehicle有一个构造器，
// 接受一个品牌参数。
// Car也有一个构造器，
// 接受一个品牌和一个型号参数。
// 在Car的构造器中调用Vehicle的构造器。
public class Main {
    public static void main(String[] args) {
        // 创建一个 Car 对象
        Car myCar = new Car("Toyota", "Corolla");

        // 输出品牌和型号
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
    }
}
