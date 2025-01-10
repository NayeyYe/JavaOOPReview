package QuesSeven.ProgramTwo;

public interface Chargeable {
    // 默认方法 charge
    default void charge() {
        System.out.println("Charging in progress...");
    }
}
