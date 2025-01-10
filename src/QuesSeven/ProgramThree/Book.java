package QuesSeven.ProgramThree;

public class Book extends Document implements Printable {
    // 实现print方法
    @Override
    public void print() {
        System.out.println("Book");
    }
}
