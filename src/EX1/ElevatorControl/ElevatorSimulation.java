package EX1.ElevatorControl;

public class ElevatorSimulation {
    public static void main(String[] args) {
        UpButton upButton = new UpButton();
        DownButton downButton = new DownButton();
        StopButton stopButton = new StopButton();

        ElevatorController elevatorController = new ElevatorController();
        elevatorController.pressButton(upButton);
        elevatorController.pressButton(downButton);
        elevatorController.pressButton(stopButton);

        elevatorController.pressButton(3);
    }
}
