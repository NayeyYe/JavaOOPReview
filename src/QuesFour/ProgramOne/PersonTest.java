package QuesFour.ProgramOne;
//编程题：创建一个名为Person的类，
// 包含name和age属性，以及一个构造器和两个方法：
// getInfo()和updateAge(int age)。
// 在getInfo()方法中使用this关键字来区分局部变量和成员变量。
public class PersonTest {
    public static void main(String[] args) {
        // 创建Person对象
        Person person = new Person("John", 30);

        // 调用getInfo方法
        person.getInfo();

        // 调用updateAge方法
        person.updateAge(35);
    }
}
