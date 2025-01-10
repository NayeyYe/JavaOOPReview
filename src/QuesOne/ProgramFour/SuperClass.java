package QuesOne.ProgramFour;

class Parent {
    int value; // 实例变量

    // 父类构造器
    Parent(int value) {
        this.value = value;
    }

    // 父类方法
    void display() {
        System.out.println("Parent Value: " + this.value);
    }
}

class Child extends Parent {
    // 子类构造器
    Child(int value) {
        super(value); // 使用 super 调用父类构造器
    }

    // 子类方法（重写父类方法）
    void display() {
        super.display(); // 使用 super 调用父类方法
        System.out.println("Child Value: " + this.value);
    }
}
