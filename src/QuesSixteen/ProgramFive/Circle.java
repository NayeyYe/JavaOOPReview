package QuesSixteen.ProgramFive;

class Circle extends Shape implements Colorable {
    private String color;

    @Override
    public void draw() {
        System.out.println("绘制圆形。");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("设置圆形颜色为: " + color);
    }
}
