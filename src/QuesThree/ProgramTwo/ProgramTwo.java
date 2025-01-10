package QuesThree.ProgramTwo;
// 扩展题目1，
// 创建一个Animal数组，
// 包含Dog和Cat对象，
// 并调用每个对象的makeSound方法。
public class ProgramTwo {
    public static void main(String[] args) {
        // 创建Animal数组
        Animal[] animals = new Animal[2];

        // 将Dog和Cat对象添加到数组中
        animals[0] = new Dog();
        animals[1] = new Cat();

        //遍历数组
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
