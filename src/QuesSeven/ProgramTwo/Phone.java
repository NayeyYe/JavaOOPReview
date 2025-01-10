package QuesSeven.ProgramTwo;

public class Phone implements Chargeable{
    // 覆盖默认方法charge
    @Override
    public void charge() {
        System.out.println("Phone charge");
    }
}
