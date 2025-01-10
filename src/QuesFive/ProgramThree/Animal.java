package QuesFive.ProgramThree;

abstract class Animal {
    // 属性
    private String name;
    // 构造器
    public Animal(String name) {
        this.name = name;
    }
    // 抽象方法
    abstract void makeSound();
}
