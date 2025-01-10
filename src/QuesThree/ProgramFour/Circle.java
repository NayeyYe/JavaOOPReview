package QuesThree.ProgramFour;

public class Circle extends Shape implements Colorable{
    private String color;

    // 实现Shape的抽象方法draw
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }

    // 实现Colorable接口的方法setcolor
    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Set color to " + color);
    }
}
