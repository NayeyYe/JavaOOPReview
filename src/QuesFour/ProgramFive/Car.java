package QuesFour.ProgramFive;

public class Car {
    // 属性
    private String model = "Unknown";
    private int year = 0;
    private String color = "Unknown";

    // 默认构造器
    public Car(){
        this.year = 0;
    }
    // 两参数构造器
    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }
    // 三参数构造器
    public Car(String model, int year, String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }
    // 获取信息方法
    public void displayInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
    }
}
