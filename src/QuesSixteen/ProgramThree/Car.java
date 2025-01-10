package QuesSixteen.ProgramThree;

public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine(); // Engine对象是Car对象的一部分
    }

    public void startCar() {
        engine.start();
        System.out.println("汽车启动。");
    }

    public void stopCar() {
        engine.stop();
        System.out.println("汽车停止。");
    }
}