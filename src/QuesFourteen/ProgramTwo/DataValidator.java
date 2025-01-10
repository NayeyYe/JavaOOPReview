package QuesFourteen.ProgramTwo;

public class DataValidator {
    public void validateData(String data) throws InvalidDataException {
        if (data == null || data.isEmpty()) {
            throw new InvalidDataException("数据不能为空", "ERR001");
        }

        if (data.length() < 5) {
            throw new InvalidDataException("数据长度不能小于5", "ERR002");
        }

        System.out.println("数据验证通过: " + data);
    }
}
