package QuesOne.ProgramFour;

public class DiffereceFromThisAndSuper {
    public static void main(String[] args) {
        // 有参构造
        ThisClass objWithValue = new ThisClass(10);
        objWithValue.display();
        // 无参构造
        ThisClass objWithoutValue = new ThisClass();
        objWithoutValue.display();

        // 对于SuperClass
        Parent parent = new Parent(10);
        parent.display();

        Child child = new Child(20);
        child.display();

    }
}
