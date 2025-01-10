package QuesSixteen.ProgramThree;
import java.util.ArrayList;
import java.util.List;
public class TrafficLight {
    private List<Car> cars;

    public TrafficLight() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void signal() {
        System.out.println("交通灯信号变化。");
        for (Car car : cars) {
            car.stopCar();
        }
    }
}
