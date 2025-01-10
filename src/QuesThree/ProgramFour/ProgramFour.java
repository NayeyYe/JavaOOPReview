package QuesThree.ProgramFour;
// 创建一个抽象类Shape，其中包含一个抽象方法draw。
// 然后创建一个接口Colorable，包含一个方法setColor。
// 实现这两个抽象概念的Circle类。
public class ProgramFour {
    public static void main(String[] args) {
        // 创建Circle对象
        Circle circle = new Circle();
        // draw
        circle.draw();
        // setColor
        circle.setColor("Red");
    }
}
