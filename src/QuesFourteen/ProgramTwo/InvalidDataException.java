package QuesFourteen.ProgramTwo;

public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message) {

      super(message);
    }

    private String errorCode;

    public InvalidDataException(String errorCode, String message) {
      super(message);
      this.errorCode = errorCode;
    }

    public String getErrorCode() {
      return errorCode;
    }

}
