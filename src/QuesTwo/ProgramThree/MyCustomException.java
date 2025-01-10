package QuesTwo.ProgramThree;

public class MyCustomException extends Exception {
    public MyCustomException(String message, Throwable cause) {

        super(message, cause);
    }

    public MyCustomException(Throwable cause) {
        super(cause);
    }
}
