package EX1.ElevatorControl;

public class ElevatorController {
    public void pressButton(ElevatorButton... buttons) {
        for (ElevatorButton button : buttons) {
            button.pressButton();
        }
    }

    public void pressButton(int buttonCount) {
        for (int i = 0; i < buttonCount; i++) {
            UpButton button = new UpButton();
            button.pressButton();
        }
    }
}
