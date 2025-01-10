package QuesEight.ProgramOne;

public class Car extends Vehicle {
    private String model;

    // Car的构造器
    public Car(String model, String brand) {
        super(brand);
        this.model = model;
    }

    // 获取型号信息
    public String getModel() {
        return model;
    }
}
