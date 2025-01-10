package QuesOne.ProgramTwo.FinalMethod;
// final方法：用于防止子类重写（覆盖）该方法。
// 当某个方法的行为在父类中已经确定，且不希望子类修改时使用。
public class FinalMethodExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();// 这里调用的是父类Parent类的final方法
    }
}
