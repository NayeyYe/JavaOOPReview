package QuesThree.ProgramFive;
//创建一个基类Vehicle，包含一个startEngine方法。
// 创建一个子类Car，它重写startEngine方法，
// 并在其中使用super.startEngine()。
public class ProgramFive {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
    }
}
