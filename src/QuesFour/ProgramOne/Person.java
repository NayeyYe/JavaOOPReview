package QuesFour.ProgramOne;

public class Person {
    // 成员变量
    private String name;
    private int age;

    // 构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getInfo方法
    public void getInfo()
    {
        String name = "Mike";
        int age = 12;

        // 使用this引用成员变量
        System.out.println("Member Name" + this.name);
        System.out.println("Member Age" + this.age);

        // 输出局部变量
        System.out.println("Local Name" + name);
        System.out.println("Local Age" + age);
    }

    // updateAge方法
    public void updateAge(int age){
        this.age = age;
        System.out.println("Age updated to：" + this.age);
    }
}
