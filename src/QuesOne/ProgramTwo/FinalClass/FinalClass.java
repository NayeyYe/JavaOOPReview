package QuesOne.ProgramTwo.FinalClass;
// final方法：用于防止类被继承。
// 使用场景: 当某个类的实现已经完整，且不希望被其他类继承时使用。
final class FinalClass { // 声明一个final类
    void display(){
        System.out.println("This is a final class");
    }
}

// class ChildClass extends FinalClass { // 这行会报错，因为final类不能被继承
//     void display() {
//         System.out.println("Trying to extend final class.");
//     }
// }
