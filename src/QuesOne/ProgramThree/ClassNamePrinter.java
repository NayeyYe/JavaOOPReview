package QuesOne.ProgramThree;

public class ClassNamePrinter {
    public static void printClassName()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String className = stackTraceElements[2].getClassName();
        System.out.println("调用该方法的类的名字为"+className);
    }
}
