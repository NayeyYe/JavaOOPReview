package QuesFive.ProgramFour;
// 编程题：
// 创建一个抽象类Painter，
// 包含一个抽象方法paint()。
// 创建两个子类HousePainter和CarPainter实现paint()方法。
// 编写一个方法paintObject(Painter painter)，
// 接受Painter对象并调用paint()方法。
public class Test {
    // 方法paintObject
    public static void paintObject(Painter painter){
        painter.paint();
    }

    // main
    public static void main(String[] args) {
        // 创建HousePainter 和 CarPainter对象
        Painter housePainter = new HousePainter();
        Painter carPainter = new CarPainter();

        // 调用paintObject方法
        paintObject(housePainter);
        paintObject(carPainter);
    }
}
