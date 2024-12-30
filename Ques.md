# Notes

#### 单选题

基础语法和类型系统控制符号，关键字

异常基本概念和相关论述

继承

this, super等关键字

参数传递

重载，重写

抽象类

作用域

接口

#### 修改程序

子类和父类的构造方法

非静态方法和静态方法

常见异常

重写

强制类型转换

#### 程序设计

方法的重载

多线程协同

异常处理

#### 综合题 (2 * 20)

抽象类

泛型类

泛型接口

集合框架，集合类

模式

方法重写，重载

测试程序

接口

多态

组合和聚合的关系

UML图

# 01

## **题目1**：访问控制符的区别

* 描述Java中的访问控制符public、protected、private和默认（无修饰符）之间的主要区别，并解释它们在类成员访问权限上的作用。

* 解答：

  主要区别：修饰的对象作用域不同

  * public：作用于整个类和外部类
  * protected：作用于自己所在的类和子类
  * private：作用于自己所在的类，无法用于同一个包，子类，不同包
  * default：作用与自己所在的类，同一个包

* 答案：访问权限总结

  | 访问控制符  | 同一个类 | 同一个包 | 不同包中的子类 | 不同包中的非子类 |
  | :---------- | :------- | :------- | :------------- | :--------------- |
  | `public`    | 是       | 是       | 是             | 是               |
  | `protected` | 是       | 是       | 是             | 否               |
  | 默认        | 是       | 是       | 否             | 否               |
  | `private`   | 是       | 否       | 否             | 否               |



## **题目2**：final关键字的用途

* 解释Java中final关键字的三种主要用途，并给出每种用途的简单代码示例。

* 解答：

  * final修饰类：防止类被继承

  ```java
  final class FinalClass {
      public void display() {
          System.out.println("This is a final class.");
      }
  }
  
  // 尝试继承 final 类会导致编译错误
  // class SubClass extends FinalClass {} // 编译错误：无法继承 final 类
  ```

  * final修饰方法：防止方法被重写

  `````java
  class ParentClass {
      final void finalMethod() {
          System.out.println("This method cannot be overridden.");
      }
  }
  
  class ChildClass extends ParentClass {
      // 尝试重写 final 方法会导致编译错误
      // @Override
      // void finalMethod() { // 编译错误：无法重写 final 方法
      //     System.out.println("Attempt to override final method.");
      // }
  }
  `````

  * final修饰变量：防止变量值被修改

  `````java
  public class FinalVariableExample {
      // 类级别的 final 变量
      final int FINAL_INT = 10;
  
      public void display() {
          // 方法级别的 final 变量
          final String FINAL_STRING = "Hello, World!";
  
          System.out.println("Final int: " + FINAL_INT);
          System.out.println("Final string: " + FINAL_STRING);
  
          // 尝试修改 final 变量会导致编译错误
          // FINAL_INT = 20; // 编译错误：无法修改 final 变量
          // FINAL_STRING = "Goodbye, World!"; // 编译错误：无法修改 final 变量
      }
  }
  `````

## **题目3**：static关键字的含义

* 阐述static关键字在Java中的含义，并讨论为什么一个静态方法不能访问类的实例变量或实例方法。

* 解答：

  * static表示静态，用static修饰的类，方法或者变量表示被整个类共享，不需要创造新的实例
  * 静态方法是属于类，而不是属于类的实例的方法，他和类实例同级别，所以不能访问实例变量和实例方法

* static关键字的含义

  ​	**static变量（静态变量）**

  - **含义**：静态变量是属于类的变量，而不是属于类的实例的变量。所有类的实例共享同一个静态变量。

  - **作用**：用于定义类级别的属性，通常用于存储类的全局状态或共享数据。

  - **示例**：

    ```java
    static` 方法（静态方法）public class MyClass {
        static int staticVariable = 10;
        int instanceVariable = 20;
    }
    
    public class Main {
        public static void main(String[] args) {
            MyClass obj1 = new MyClass();
            MyClass obj2 = new MyClass();
    
            System.out.println(MyClass.staticVariable); // 输出: 10
            System.out.println(obj1.instanceVariable); // 输出: 20
    
            MyClass.staticVariable = 30;
            System.out.println(MyClass.staticVariable); // 输出: 30
            System.out.println(obj2.staticVariable); // 输出: 30
        }
    }
    
    ```

    **static方法（静态方法）**

  - **含义**：静态方法是属于类的方法，而不是属于类的实例的方法。可以直接通过类名调用静态方法，而不需要创建类的实例。

  - **作用**：用于定义类级别的操作，通常用于工具方法或不需要访问实例状态的方法。

  - **示例**：

    ```java
    public class MyClass {
        static void staticMethod() {
            System.out.println("This is a static method.");
        }
    
        void instanceMethod() {
            System.out.println("This is an instance method.");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            MyClass.staticMethod(); // 输出: This is a static method.
    
            MyClass obj = new MyClass();
            obj.instanceMethod(); // 输出: This is an instance method.
        }
    }
    ```

    **static代码块（静态代码块）**

  - **含义**：静态代码块是在类加载时执行的代码块，用于初始化静态变量或执行一些静态操作。

  - **作用**：用于在类加载时执行一些初始化操作。

  - **示例**：

    ```java
    public class MyClass {
        static int staticVariable;
    
        static {
            staticVariable = 100;
            System.out.println("Static block executed.");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            System.out.println(MyClass.staticVariable); // 输出: Static block executed. 100
        }
    }
    ```

    **static嵌套类（静态嵌套类）**

  - **含义**：静态嵌套类是属于类的嵌套类，而不是属于类的实例的嵌套类。可以直接通过类名访问静态嵌套类，而不需要创建外部类的实例。

  - **作用**：用于组织代码结构，通常用于定义与外部类相关的辅助类。

  - **示例**：

    ```java
    public class OuterClass {
        static class StaticNestedClass {
            void display() {
                System.out.println("This is a static nested class.");
            }
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
            nestedObj.display(); // 输出: This is a static nested class.
        }
    }
    ```

  ### 为什么静态方法不能访问类的实例变量或实例方法？

  静态方法不能访问类的实例变量或实例方法的原因在于静态方法是属于类的，而不是属于类的实例的。静态方法在调用时不需要创建类的实例，因此它无法访问实例级别的成员（实例变量和实例方法）。

  #### 1. 静态方法的特性

  - **静态方法属于类**：静态方法是与类相关联的，而不是与类的实例相关联的。因此，静态方法在调用时不需要创建类的实例。
  - **静态方法不能引用 `this` 或 `super`**：由于静态方法不属于类的实例，因此它不能使用 `this` 或 `super` 关键字来引用当前对象或父类对象。

  #### 2. 实例变量和实例方法的特性

  - **实例变量属于实例**：实例变量是与类的实例相关联的，每个实例都有自己的一份实例变量。
  - **实例方法属于实例**：实例方法是与类的实例相关联的，每个实例都可以调用自己的实例方法。

  #### 3. 静态方法无法访问实例成员的原因

  - **静态方法没有实例上下文**：由于静态方法在调用时不需要创建类的实例，因此它没有实例上下文（即没有 `this` 引用）。因此，静态方法无法访问实例变量或调用实例方法。
  - **实例成员依赖于实例**：实例变量和实例方法依赖于具体的实例，而静态方法没有实例上下文，因此无法访问这些成员。

  #### 示例代码

  ```java
  public class MyClass {
      int instanceVariable = 10;
  
      void instanceMethod() {
          System.out.println("Instance method called.");
      }
  
      static void staticMethod() {
          // 尝试访问实例变量会导致编译错误
          // System.out.println(instanceVariable); // 编译错误：无法从静态上下文中引用非静态变量
  
          // 尝试调用实例方法会导致编译错误
          // instanceMethod(); // 编译错误：无法从静态上下文中引用非静态方法
      }
  }
  ```

  ### 总结

  - **`static` 关键字**：用于定义类级别的成员（静态变量、静态方法、静态代码块和静态嵌套类）。
  - **静态方法的限制**：静态方法不能访问类的实例变量或实例方法，因为静态方法属于类，而不是属于类的实例。静态方法在调用时没有实例上下文，因此无法访问实例级别的成员。

## 题目4：this和super关键字的区别

* 描述Java中this和super关键字的区别，并解释它们各自在什么场景下使用。

* 解答：

  * this：作为当前类中定义的实例代表，拥有本类中定义的实例属性

  * super：继承父类中的实例属性，用super关键字用于继承父类的实例属性

* 答案：

### 1. `this` 关键字

#### 含义

- **`this`** 关键字用于引用当前对象的实例。它可以在类的实例方法或构造方法中使用，表示调用该方法或构造方法的对象。

#### 使用场景

- **引用当前对象的实例变量**：当局部变量（方法参数或方法内部定义的变量）与实例变量同名时，可以使用 `this` 关键字来区分实例变量和局部变量。
- **调用当前对象的其他构造方法**：在构造方法中，可以使用 `this()` 来调用当前类的其他构造方法。
- **返回当前对象**：在方法中，可以使用 `this` 关键字返回当前对象的引用。

#### 示例代码

```java
public class MyClass {
    private int value;

    // 构造方法
    public MyClass(int value) {
        this.value = value; // 使用 this 引用实例变量
    }

    // 实例方法
    public void setValue(int value) {
        this.value = value; // 使用 this 引用实例变量
    }

    // 返回当前对象
    public MyClass getThis() {
        return this; // 返回当前对象的引用
    }

    // 调用其他构造方法
    public MyClass() {
        this(0); // 调用另一个构造方法
    }
}
```

### 2. `super` 关键字

#### 含义

- **`super`** 关键字用于引用父类对象的成员。它可以在子类的实例方法或构造方法中使用，表示调用父类的成员。

#### 使用场景

- **引用父类的实例变量**：当子类和父类有同名的实例变量时，可以使用 `super` 关键字来区分父类的实例变量和子类的实例变量。
- **调用父类的构造方法**：在子类的构造方法中，可以使用 `super()` 来调用父类的构造方法。
- **调用父类的实例方法**：当子类重写了父类的方法时，可以使用 `super` 关键字来调用父类的原始方法。

#### 示例代码

```java
class ParentClass {
    protected int value;

    public ParentClass(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("ParentClass value: " + value);
    }
}

class ChildClass extends ParentClass {
    private int childValue;

    public ChildClass(int value, int childValue) {
        super(value); // 调用父类的构造方法
        this.childValue = childValue;
    }

    @Override
    public void display() {
        super.display(); // 调用父类的 display 方法
        System.out.println("ChildClass childValue: " + childValue);
    }
}

public class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass(10, 20);
        child.display();
    }
}
```

### 总结

| 关键字  | 含义               | 使用场景                                                     |
| :------ | :----------------- | :----------------------------------------------------------- |
| `this`  | 引用当前对象的实例 | - 引用当前对象的实例变量<br>- 调用当前对象的其他构造方法<br>- 返回当前对象 |
| `super` | 引用父类对象的成员 | - 引用父类的实例变量<br>- 调用父类的构造方法<br>- 调用父类的实例方法 |



## 题目5：Java中的abstract和interface关键字

* 解释Java中的abstract关键字和interface关键字之间的主要区别，并讨论它们在面向对象编程中的作用。
* 解答：
  * abstract用于修饰类，被修饰的类叫做抽象类，interface用于修饰接口
  * 抽象类一般是用于将许多方法进行总结，让子类进行重载和覆写
  * 接口是用于定义在整个类中的规范，包括一些静态变量等
* 答案：

在Java中，`abstract` 关键字和 `interface` 关键字都用于实现抽象类和接口，但它们有不同的用途和特性。以下是它们的主要区别以及在面向对象编程中的作用。

### 1. `abstract` 关键字

#### 含义

- **`abstract`** 关键字用于定义抽象类和抽象方法。抽象类是不能被实例化的类，而抽象方法是只有声明没有实现的方法。

#### 特性

- **抽象类**：
  - 可以包含抽象方法和非抽象方法。
  - 可以包含实例变量、静态变量和常量。
  - 可以包含构造方法（尽管不能直接实例化抽象类，但子类可以通过 `super()` 调用父类的构造方法）。
  - 可以实现接口。
- **抽象方法**：
  - 只有方法声明，没有方法体。
  - 必须在子类中被重写（除非子类也是抽象类）。

#### 示例代码

```java
abstract class AbstractClass {
    int instanceVariable = 10;

    // 抽象方法
    abstract void abstractMethod();

    // 非抽象方法
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method.");
    }
}

class ConcreteClass extends AbstractClass {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in ConcreteClass.");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.abstractMethod(); // 输出: Abstract method implemented in ConcreteClass.
        obj.nonAbstractMethod(); // 输出: This is a non-abstract method.
    }
}
```

### 2. `interface` 关键字

#### 含义

- **`interface`** 关键字用于定义接口。接口是一种完全抽象的类，它只包含抽象方法和常量（默认是 `public static final`）。

#### 特性

- **接口**：
  - 只能包含抽象方法（在Java 8之前）。
  - 可以包含默认方法（`default` 方法，Java 8引入）和静态方法（Java 8引入）。
  - 可以包含常量（默认是 `public static final`）。
  - 不能包含实例变量或构造方法。
  - 一个类可以实现多个接口。
- **抽象方法**：
  - 默认是 `public abstract`，不需要显式声明。

#### 示例代码

```java
interface MyInterface {
    int CONSTANT = 100; // 默认是 public static final

    void abstractMethod(); // 默认是 public abstract

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented in MyClass.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.abstractMethod(); // 输出: Abstract method implemented in MyClass.
        obj.defaultMethod(); // 输出: This is a default method.
        MyInterface.staticMethod(); // 输出: This is a static method.
    }
}
```

### 主要区别

| 特性           | `abstract` 类                    | `interface`                                                  |
| :------------- | :------------------------------- | :----------------------------------------------------------- |
| **实例化**     | 不能直接实例化                   | 不能直接实例化                                               |
| **方法实现**   | 可以包含非抽象方法               | 只能包含抽象方法（Java 8之前），可以包含默认方法和静态方法（Java 8引入） |
| **变量**       | 可以包含实例变量、静态变量和常量 | 只能包含常量（默认是 `public static final`）                 |
| **构造方法**   | 可以包含构造方法                 | 不能包含构造方法                                             |
| **继承**       | 只能继承一个抽象类               | 可以实现多个接口                                             |
| **访问修饰符** | 方法和变量可以使用任何访问修饰符 | 方法和变量默认是 `public`，不能使用其他访问修饰符            |

### 在面向对象编程中的作用

#### 1. `abstract` 类的作用

- **提供部分实现**：抽象类可以提供部分方法的实现，子类只需要实现剩余的抽象方法。
- **代码复用**：抽象类可以包含一些通用的方法和变量，子类可以直接继承和使用。
- **模板设计模式**：抽象类可以定义一个模板方法，子类只需要实现特定的步骤。

#### 2. `interface` 的作用

- **定义契约**：接口定义了一组方法的契约，实现接口的类必须实现这些方法。
- **多重继承**：一个类可以实现多个接口，从而实现类似多重继承的效果。
- **解耦**：接口可以用于解耦类的实现和使用，提高代码的灵活性和可扩展性。

### 总结

- **`abstract` 类**：用于定义部分实现的类，提供代码复用和模板设计模式。
- **`interface`**：用于定义契约，支持多重继承和解耦。

* 通过合理使用 `abstract` 类和 `interface`，可以更好地设计和组织Java代码，实现面向对象编程的封装、继承和多态特性。

## 编程题目1

编写一个Java类，包含一个private整数成员变量和一个public构造器，该构造器初始化变量，并提供一个protected方法来返回这个变量的值。

* 解答：

`````java
package QuesOne;

public class ProgramOne
{
    private int num;
    public ProgramOne(int num)
    {
        this.num = num;
    }
    protected int getNum()
    {
        return num;
    }

    public static void main(String[] args) {
        ProgramOne programOne = new ProgramOne(5);
        System.out.println(programOne.getNum());
    }
}

`````

* 答案：

下面是一个符合要求的Java类示例，包含一个 `private` 整数成员变量、一个 `public` 构造器用于初始化该变量，以及一个 `protected` 方法来返回该变量的值。

```java
public class MyClass {
    // 私有整数成员变量
    private int value;

    // 公共构造器，用于初始化变量
    public MyClass(int value) {
        this.value = value;
    }

    // 受保护的方法，返回变量的值
    protected int getValue() {
        return value;
    }

    // 主方法用于测试
    public static void main(String[] args) {
        // 创建 MyClass 的实例
        MyClass obj = new MyClass(42);

        // 调用受保护的方法获取变量的值
        System.out.println("Value: " + obj.getValue()); // 输出: Value: 42
    }
}
```

### 代码解释

1. **私有整数成员变量**：
   - `private int value;`：定义了一个私有的整数成员变量 `value`，只能在 `MyClass` 类内部访问。
2. **公共构造器**：
   - `public MyClass(int value)`：定义了一个公共构造器，接受一个整数参数 `value`，并将其赋值给类的私有成员变量 `value`。
3. **受保护的方法**：
   - `protected int getValue()`：定义了一个受保护的方法 `getValue()`，返回私有成员变量 `value` 的值。该方法只能在同一个包内或子类中访问。
4. **主方法**：
   - `public static void main(String[] args)`：用于测试 `MyClass` 类。创建 `MyClass` 的实例，并调用 `getValue()` 方法来获取和打印 `value` 的值。

### 总结

- **私有成员变量**：确保变量只能在类内部访问，增强了封装性。
- **公共构造器**：允许外部代码创建类的实例并初始化私有成员变量。
- **受保护的方法**：允许子类或同一个包内的类访问私有成员变量的值，提供了对私有数据的受控访问。

* 通过这种方式，可以有效地控制类的内部状态，并确保类的封装性和安全性。

## 编程题2

创建一个Java接口，声明一个abstract方法calculateArea，然后在一个实现该接口的类中用final关键字实现这个方法。

* 解答：

```java
package QuesOne.ProgramTwo;

public interface Shape {
    abstract double calculateArea();
}

```

`````java
package QuesOne.ProgramTwo;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public final double calculateArea() {
        return Math.PI * radius * radius;
    }
}

`````

```java
package QuesOne.ProgramTwo;
//创建一个Java接口，
// 声明一个abstract方法calculateArea，
// 然后在一个实现该接口的类中用final关键字实现这个方法。
public class ProgramTwo
{
    public static void main(String[] args) {
        // 创建 Circle 的实例
        Circle circle = new Circle(5.0);

        // 调用 calculateArea 方法计算面积
        System.out.println("Circle Area: " + circle.calculateArea());
        // 输出: Circle Area: 78.53981633974483
    }
}

```

* 答案：

下面是一个符合要求的Java接口和实现该接口的类的示例。接口中声明了一个抽象方法 `calculateArea`，然后在实现该接口的类中用 `final` 关键字实现这个方法。

### 1. 创建接口

```java
// 定义一个接口，声明一个抽象方法 calculateArea
public interface Shape {
    double calculateArea(); // 抽象方法，没有方法体
}
```

### 2. 实现接口

```java
// 实现 Shape 接口的类，用 final 关键字实现 calculateArea 方法
public class Circle implements Shape {
    private double radius;

    // 构造器，初始化半径
    public Circle(double radius) {
        this.radius = radius;
    }

    // 使用 final 关键字实现 calculateArea 方法
    @Override
    public final double calculateArea() {
        return Math.PI * radius * radius; // 计算圆的面积
    }

    // 主方法用于测试
    public static void main(String[] args) {
        // 创建 Circle 的实例
        Circle circle = new Circle(5.0);

        // 调用 calculateArea 方法计算面积
        System.out.println("Circle Area: " + circle.calculateArea()); // 输出: Circle Area: 78.53981633974483
    }
}
```

### 代码解释

1. **接口定义**：
   - `public interface Shape`：定义了一个接口 `Shape`，其中声明了一个抽象方法 `calculateArea()`。
2. **实现接口的类**：
   - `public class Circle implements Shape`：定义了一个类 `Circle`，实现了 `Shape` 接口。
   - `private double radius`：定义了一个私有成员变量 `radius`，用于存储圆的半径。
   - `public Circle(double radius)`：定义了一个构造器，用于初始化 `radius`。
   - `@Override public final double calculateArea()`：使用 `final` 关键字实现了接口中的 `calculateArea()` 方法，计算圆的面积并返回结果。
3. **主方法**：
   - `public static void main(String[] args)`：用于测试 `Circle` 类。创建 `Circle` 的实例，并调用 `calculateArea()` 方法来计算和打印圆的面积。

### 总结

- **接口**：定义了一个抽象方法 `calculateArea()`，要求实现类必须提供该方法的实现。
- **实现类**：使用 `final` 关键字实现了 `calculateArea()` 方法，确保该方法在子类中不能被重写。
- **`final` 关键字**：在实现类中使用 `final` 关键字，确保 `calculateArea()` 方法的实现是最终的，不能被重写。

* 通过这种方式，可以确保接口方法的实现是固定的，并且不能被后续的子类修改。

## 编程题3

一个Java程序，包含一个static方法，该方法不接受任何参数，并打印出当前类的名称。

* 解答：

`````java
package QuesOne.ProgramThree;

public class ClassNamePrinter {
    public static void printClassName()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String className = stackTraceElements[2].getClassName();
        System.out.println("调用该方法的类的名字为"+className);
    }
}

`````

```java
package QuesOne.ProgramThree;
//一个Java程序，包含一个static方法，
// 该方法不接受任何参数，并打印出当前类的名称。

public class ProgramThree {
    public static void main(String[] args) {
        ClassNamePrinter.printClassName();
    }
}

```

* 答案

```java
public class ClassNamePrinter {

    // 定义一个静态方法，不接受任何参数
    public static void printClassName() {
        // 获取调用该方法的类的名称
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String callerClassName = stackTrace[2].getClassName(); // 获取调用者的类名
        System.out.println("调用该方法的类的名称是: " + callerClassName);
    }

    public static void main(String[] args) {
        // 在另一个类中调用该方法
        AnotherClass.test();
    }
}

class AnotherClass {
    public static void test() {
        // 调用泛用的静态方法
        ClassNamePrinter.printClassName();
    }
}
```

### 代码解释：

1. **`ClassNamePrinter` 类**：
   - 包含一个静态方法 `printClassName()`，用于打印调用该方法的类的名称。
   - 使用 `Thread.currentThread().getStackTrace()` 获取调用栈信息。
   - `stackTrace[2]` 表示调用该方法的类（因为 `stackTrace[0]` 是 `getStackTrace`，`stackTrace[1]` 是 `printClassName`，`stackTrace[2]` 是调用者）。
2. **`AnotherClass` 类**：
   - 包含一个静态方法 `test()`，用于调用 `ClassNamePrinter.printClassName()`。
3. **`main` 方法**：
   - 在 `ClassNamePrinter` 的 `main` 方法中调用 `AnotherClass.test()`，模拟在另一个类中调用泛用方法。

### 输出结果：

当你运行这个程序时，输出将会是：

复制

```
调用该方法的类的名称是: AnotherClass
```

### 优点：

- 这个实现是泛用的，可以在任何类中调用 `ClassNamePrinter.printClassName()`，而不需要修改方法内部的逻辑。
- 它利用了 Java 的反射机制来动态获取调用者的类名。

### 注意事项：

- 这种方法依赖于 Java 的调用栈信息，因此在某些特殊情况下（如异步调用或优化）可能会出现不准确的情况。
- 如果需要更高的性能或更精确的调用者信息，可以考虑其他实现方式。

## 编程题4：不会做

实现一个Java类，使用synchronized关键字同步一个方法，该方法内部生成一个随机数并打印。

* 答案

以下是一个使用 `synchronized` 关键字同步方法的 Java 类示例。该方法内部生成一个随机数并打印。

### 代码实现

```java
import java.util.Random;

public class SynchronizedRandomNumberGenerator {

    // 定义一个同步方法
    public synchronized void generateAndPrintRandomNumber() {
        // 生成一个随机数
        Random random = new Random();
        int randomNumber = random.nextInt(100); // 生成 0 到 99 之间的随机数

        // 打印随机数
        System.out.println("线程 " + Thread.currentThread().getName() + " 生成的随机数是: " + randomNumber);
    }

    public static void main(String[] args) {
        // 创建 SynchronizedRandomNumberGenerator 的实例
        SynchronizedRandomNumberGenerator generator = new SynchronizedRandomNumberGenerator();

        // 创建多个线程来调用同步方法
        Runnable task = () -> {
            generator.generateAndPrintRandomNumber();
        };

        // 创建并启动多个线程
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
```

------

### 代码解释

1. **`SynchronizedRandomNumberGenerator` 类**：
   - 包含一个同步方法 `generateAndPrintRandomNumber()`，使用 `synchronized` 关键字修饰。
   - 该方法内部生成一个随机数（0 到 99 之间），并打印该随机数以及当前线程的名称。
2. **同步方法的作用**：
   - `synchronized` 关键字确保在同一时间只有一个线程可以执行该方法。
   - 这样可以避免多个线程同时生成和打印随机数时出现混乱或数据竞争。
3. **`main` 方法**：
   - 创建 `SynchronizedRandomNumberGenerator` 的实例。
   - 定义一个 `Runnable` 任务，任务中调用同步方法 `generateAndPrintRandomNumber()`。
   - 创建并启动多个线程（`Thread-1`、`Thread-2`、`Thread-3`），每个线程都会调用同步方法。
4. **随机数生成**：
   - 使用 `Random` 类生成随机数。
   - `random.nextInt(100)` 生成 0 到 99 之间的随机整数。

------

### 输出示例

运行程序时，输出可能如下：

复制

```
线程 Thread-1 生成的随机数是: 42
线程 Thread-2 生成的随机数是: 87
线程 Thread-3 生成的随机数是: 15
```

每个线程会依次执行同步方法，生成并打印随机数。由于方法是同步的，因此不会出现多个线程同时打印的情况。

------

### 注意事项

1. **性能影响**：
   - 使用 `synchronized` 关键字会引入一定的性能开销，因为同一时间只有一个线程可以执行同步方法。
   - 如果方法的执行时间较长，可能会导致其他线程等待。
2. **锁的范围**：
   - 在这个例子中，锁的范围是整个方法。如果方法中有部分代码不需要同步，可以考虑缩小锁的范围（例如使用同步块 `synchronized(this)`）。
3. **线程安全**：
   - 使用 `synchronized` 确保了线程安全，避免了多个线程同时访问共享资源（这里是方法内部的逻辑）时可能出现的问题。

------

这个示例展示了如何使用 `synchronized` 关键字来同步方法，并生成和打印随机数。

## 编程题5：不会做

编写一个Java程序，包含一个类变量和一个实例变量，**两者都使用volatile关键字修饰**，并创建一个线程安全的计数器方法。

* 答案

以下是一个 Java 程序示例，包含一个类变量（静态变量）和一个实例变量，两者都使用 `volatile` 关键字修饰，并实现一个线程安全的计数器方法。

### 代码实现

```java
public class VolatileCounter {

    // 使用 volatile 修饰的类变量（静态变量）
    private static volatile int classCounter = 0;

    // 使用 volatile 修饰的实例变量
    private volatile int instanceCounter = 0;

    // 线程安全的计数器方法（同步方法）
    public synchronized void incrementCounters() {
        // 增加类变量的值
        classCounter++;
        // 增加实例变量的值
        instanceCounter++;
    }

    // 打印计数器值的方法
    public void printCounters() {
        System.out.println("类变量 classCounter: " + classCounter);
        System.out.println("实例变量 instanceCounter: " + instanceCounter);
    }

    public static void main(String[] args) {
        // 创建 VolatileCounter 的实例
        VolatileCounter counter = new VolatileCounter();

        // 创建多个线程来调用计数器方法
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementCounters();
            }
        };

        // 创建并启动多个线程
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        // 等待所有线程完成
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 打印最终的计数器值
        counter.printCounters();
    }
}
```

------

### 代码解释

1. **类变量和实例变量**：
   - `classCounter` 是一个静态变量，使用 `volatile` 修饰。
   - `instanceCounter` 是一个实例变量，使用 `volatile` 修饰。
   - `volatile` 关键字确保变量的可见性，即当一个线程修改了变量的值时，其他线程能够立即看到最新的值。
2. **线程安全的计数器方法**：
   - `incrementCounters()` 是一个同步方法，使用 `synchronized` 关键字修饰。
   - 该方法中，`classCounter` 和 `instanceCounter` 的值都会增加。
   - 由于方法是同步的，因此多个线程同时调用该方法时不会出现数据竞争问题。
3. **打印计数器值的方法**：
   - `printCounters()` 方法用于打印 `classCounter` 和 `instanceCounter` 的当前值。
4. **`main` 方法**：
   - 创建 `VolatileCounter` 的实例。
   - 定义一个 `Runnable` 任务，任务中调用 `incrementCounters()` 方法 1000 次。
   - 创建并启动多个线程（`thread1`、`thread2`、`thread3`），每个线程都会调用任务。
   - 使用 `join()` 方法等待所有线程完成。
   - 最后调用 `printCounters()` 方法打印最终的计数器值。

------

### 输出示例

运行程序时，输出可能如下：

```java
类变量 classCounter: 3000
实例变量 instanceCounter: 3000
```

由于每个线程调用 `incrementCounters()` 方法 1000 次，且有 3 个线程，因此最终的计数器值应该是 3000。

------

### 关键点

1. **`volatile` 的作用**：
   - `volatile` 确保变量的可见性，但**不保证原子性**。
   - 在本例中，`volatile` 确保了 `classCounter` 和 `instanceCounter` 的值对所有线程可见。
2. **`synchronized` 的作用**：
   - `synchronized` 确保方法的原子性，避免多个线程同时修改计数器值。
   - 如果没有 `synchronized`，即使变量是 `volatile` 的，也可能出现数据竞争问题。
3. **线程安全**：
   - 通过 `volatile` 和 `synchronized` 的结合，确保了计数器方法的线程安全。

------

### 注意事项

1. **性能开销**：
   - `volatile` 和 `synchronized` 都会引入一定的性能开销。
   - 如果对性能要求较高，可以考虑使用更高效的同步机制（如 `AtomicInteger`）。
2. **适用场景**：
   - `volatile` 适用于多个线程共享但不需要原子操作的变量。
   - `synchronized` 适用于需要原子操作的场景。

------

这个示例展示了如何使用 `volatile` 和 `synchronized` 实现线程安全的计数器方法。

# 02

## 题目1：Java异常处理的理解

文字题：解释Java中的try、catch和finally块的作用及其在异常处理中的重要性。

* 解答：
  * try表示尝试运行以下的代码，如果可以成功就直接运行，不能成功就转移到catch中
  * catch是捕捉异常
  * finally表示无论try代码块运行还是catch代码块运行，都需要运行finally代码块
* 答案：

在 Java 中，`try`、`catch` 和 `finally` 是用于异常处理的关键字，它们共同构成了异常处理机制的核心部分。以下是对它们的作用及其在异常处理中的重要性的详细解释：

------

### 1. **`try` 块**

- **作用**：`try` 块用于包裹可能抛出异常的代码。如果 `try` 块中的代码执行时发生了异常，程序会立即停止执行 `try` 块中剩余的代码，并跳转到相应的 `catch` 块（如果有）。
- **重要性**：`try` 块是异常处理的基础，它将可能出错的代码与正常逻辑分离，确保程序在发生异常时不会崩溃。

**示例**：

```java
try {
    int result = 10 / 0; // 可能抛出 ArithmeticException
    System.out.println("结果：" + result); // 如果发生异常，这行代码不会执行
}
```

------

### 2. **`catch` 块**

- **作用**：`catch` 块用于捕获并处理 `try` 块中抛出的异常。每个 `catch` 块可以指定要捕获的异常类型，并提供相应的处理逻辑。
- **重要性**：`catch` 块允许程序在发生异常时执行特定的处理逻辑，而不是直接崩溃。它可以帮助程序优雅地处理错误，并提供有用的错误信息。

**示例**：

```java
try {
    int result = 10 / 0; // 可能抛出 ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("捕获到异常：" + e.getMessage());
}
```

- **多重 `catch` 块**：可以为不同的异常类型编写多个 `catch` 块，程序会根据抛出的异常类型选择匹配的 `catch` 块。

**示例**：

java

复制

```java
try {
    int[] array = new int[5];
    int value = array[10]; // 可能抛出 ArrayIndexOutOfBoundsException
} catch (ArithmeticException e) {
    System.out.println("捕获到算术异常：" + e.getMessage());
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("捕获到数组越界异常：" + e.getMessage());
}
```

------

### 3. **`finally` 块**

- **作用**：`finally` 块用于包裹无论是否发生异常都必须执行的代码。即使 `try` 块中抛出了异常，或者在 `catch` 块中执行了 `return` 语句，`finally` 块中的代码仍然会执行。
- **重要性**：`finally` 块通常用于释放资源（如关闭文件、数据库连接等），确保资源不会泄漏。它提供了一种可靠的方式来执行清理操作。

**示例**：

java

复制

```java
try {
    System.out.println("尝试打开文件...");
    // 可能抛出异常的代码
} catch (Exception e) {
    System.out.println("捕获到异常：" + e.getMessage());
} finally {
    System.out.println("关闭文件..."); // 无论是否发生异常，都会执行
}
```

------

### 4. **异常处理的重要性**

- **提高程序的健壮性**：通过使用 `try-catch`，程序可以在发生异常时继续运行，而不是直接崩溃。
- **提供有用的错误信息**：`catch` 块可以捕获异常并输出详细的错误信息，帮助开发人员调试问题。
- **资源管理**：`finally` 块确保资源（如文件、数据库连接等）在任何情况下都能被正确释放，避免资源泄漏。
- **分离正常逻辑和异常逻辑**：`try-catch-finally` 结构将可能出错的代码与正常逻辑分离，使代码更清晰、更易于维护。

------

### 5. **总结**

- `try` 块用于包裹可能抛出异常的代码。
- `catch` 块用于捕获并处理异常。
- `finally` 块用于执行无论是否发生异常都必须执行的代码。
- `try-catch-finally` 结构是 Java 异常处理的核心机制，它提高了程序的健壮性、可维护性和资源管理能力。

* 通过合理使用这些块，开发人员可以编写出更可靠、更易于调试的程序。

## 编程题2.1：编写一个Java程序

尝试打开并读取一个不存在的文件，并在catch块中处理FileNotFoundException，在finally块中释放资源。

* 解答：

`````java
package QuesTwo.ProgramOne;
//尝试打开并读取一个不存在的文件，
// 并在catch块中处理FileNotFoundException，
// 在finally块中释放资源。

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ProgramOne {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            File file = new File("nonexistent_file.txt");
            fileInputStream = new FileInputStream(file);

            // 如果文件存在，读取文件内容
            int data;
            while((data = fileInputStream.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found " + e.getMessage());
        }catch (IOException e) {
            System.err.println("I/O error" + e.getMessage());
        }finally {
            // 释放资源，关闭文件流
            if(fileInputStream != null) {
                try{
                    fileInputStream.close();
                    System.out.println("File closed");
                }catch (IOException e) {
                    System.err.println("I/O error" + e.getMessage());
                }
            }
        }
    }
}

`````

### 代码说明

1. **`try` 块**：
   - 尝试打开一个不存在的文件 `nonexistent_file.txt`。
   - 如果文件不存在，会抛出 `FileNotFoundException`。
   - 如果文件存在，则读取文件内容并打印到控制台。
2. **`catch` 块**：
   - 捕获 `FileNotFoundException`，并输出错误信息。
   - 捕获 `IOException`，处理其他可能的 I/O 异常。
3. **`finally` 块**：
   - 无论是否发生异常，都会执行 `finally` 块中的代码。
   - 关闭文件流 `fileInputStream`，确保资源被正确释放。

------

### 运行结果

1. **文件不存在的情况**：

   - 输出：

     ```java
     文件未找到: nonexistent_file.txt (系统找不到指定的文件。)
     文件流已关闭。
     ```

2. **文件存在的情况**：

   - 输出文件内容，并显示文件流已关闭。

3. **关闭文件流时发生错误**：

   - 如果关闭文件流时发生异常，会捕获并输出错误信息。

------

### 重要性

- **异常处理**：通过 `catch` 块捕获 `FileNotFoundException`，程序可以优雅地处理文件不存在的情况，而不是直接崩溃。
- **资源管理**：使用 `finally` 块确保文件流被正确关闭，避免资源泄漏。
- **代码健壮性**：通过 `try-catch-finally` 结构，程序能够处理各种异常情况，并确保资源被正确释放。

* 通过这种方式，可以编写出更可靠、更安全的文件读取程序。

## 题目2：Java Checked和Unchecked异常的区别

文字题：描述Java中Checked异常和Unchecked异常（运行时异常）之间的区别，并给出每种异常的一个例子。

在 Java 中，异常分为两大类：**Checked 异常**（受检异常）和 **Unchecked 异常**（非受检异常，也称为运行时异常）。它们的主要区别在于编译器是否强制要求程序员处理这些异常。以下是它们的详细区别以及每种异常的示例。

------

### 1. **Checked 异常（受检异常）**

#### 特点：

- **编译时检查**：编译器强制要求程序员处理这些异常，或者显式地声明抛出它们。
- **必须捕获或声明抛出**：如果方法中可能抛出 Checked 异常，必须在方法签名中使用 `throws` 关键字声明，或者在代码中使用 `try-catch` 块捕获。
- **通常表示外部问题**：Checked 异常通常是由外部因素引起的，例如文件不存在、网络连接失败等。

#### 示例：

- **`FileNotFoundException`**：当尝试打开一个不存在的文件时抛出。

**代码示例**：

java

复制

```
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent_file.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("捕获到 FileNotFoundException: " + e.getMessage());
        }
    }
}
```

- 如果不使用 `try-catch` 捕获 `FileNotFoundException`，编译器会报错，提示必须处理该异常。

------

### 2. **Unchecked 异常（非受检异常，运行时异常）**

#### 特点：

- **编译时不检查**：编译器不会强制要求程序员处理这些异常，程序员可以选择捕获或忽略它们。
- **通常表示程序错误**：Unchecked 异常通常是由程序逻辑错误引起的，例如数组越界、空指针引用等。
- **继承自 `RuntimeException`**：所有 Unchecked 异常都是 `RuntimeException` 的子类。

#### 示例：

- **`ArithmeticException`**：当发生算术错误（如除以零）时抛出。

**代码示例**：

```java
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b; // 可能抛出 ArithmeticException
            System.out.println("结果：" + result);
        } catch (ArithmeticException e) {
            System.out.println("捕获到 ArithmeticException: " + e.getMessage());
        }
    }
}
```

- 如果不使用 `try-catch` 捕获 `ArithmeticException`，程序会在运行时抛出异常并终止，但编译器不会报错。

------

### 3. **主要区别**

| **特性**       | **Checked 异常**                                  | **Unchecked 异常**                            |
| :------------- | :------------------------------------------------ | :-------------------------------------------- |
| **编译时检查** | 强制要求处理（捕获或声明抛出）                    | 不强制要求处理                                |
| **继承关系**   | 继承自 `Exception`，但不继承自 `RuntimeException` | 继承自 `RuntimeException`                     |
| **常见场景**   | 外部问题（如文件不存在、网络连接失败）            | 程序逻辑错误（如数组越界、空指针引用）        |
| **示例**       | `FileNotFoundException`, `IOException`            | `ArithmeticException`, `NullPointerException` |

------

### 4. **总结**

- **Checked 异常**：需要显式处理，通常用于表示外部问题。
- **Unchecked 异常**：不需要显式处理，通常用于表示程序逻辑错误。

* 通过区分 Checked 异常和 Unchecked 异常，Java 提供了灵活的异常处理机制，程序员可以根据具体需求选择合适的异常类型。

## 编程题2.2

创建一个方法，该方法接受一个整数数组并检查其中是否包含负数。

如果包含，则抛出一个IllegalArgumentException（Checked异常），并在方法调用处进行处理。

* 解答：

`````java
package QuesTwo.ProgramTwo;
// 创建一个方法，
// 该方法接受一个整数数组并检查其中是否包含负数。
//如果包含，则抛出一个IllegalArgumentException（Checked异常），并在方法调用处进行处理。
public class ProgramTwo {
    public static void checkForNegativeNumbers(int[] array)throws IllegalArgumentException {
        for(int num : array)
        {
            if (num < 0){
                throw new IllegalArgumentException("数组中有负数：" + num);
            }
        }
        System.out.println("数组中没有负数");
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, -2, 3, -4, 5};
        // 调用方法捕获异常
        try{
            System.out.println("检查数组1：");
            checkForNegativeNumbers(array1);

            System.out.println("\n检查数组2");
            checkForNegativeNumbers(array2);
        }catch(IllegalArgumentException e){
            // 捕获到异常处理
            System.out.println("捕获到异常：" + e.getMessage());
        }
    }
}

`````



## 题目3：Java异常链的理解

文字题：解释什么是Java异常链，并讨论在自定义异常时保留原始异常的原因。

* 答案：

### 什么是 Java 异常链？

**Java 异常链**（Exception Chaining）是一种机制，允许在一个异常中包含另一个异常。换句话说，当抛出一个异常时，可以将原始异常（即“原因”）包装在新异常中。这种机制使得异常的上下文信息更加丰富，便于调试和问题定位。

在 Java 中，异常链通过以下方式实现：

- 使用 `Throwable` 类的构造函数，将原始异常作为参数传递给新异常。
- 通过 `Throwable.getCause()` 方法获取原始异常。

------

### 异常链的实现

Java 提供了以下几种方式来创建异常链：

1. **构造函数方式**：
   - `Throwable(Throwable cause)`：创建一个包含原始异常的新异常。
   - `Throwable(String message, Throwable cause)`：创建一个包含原始异常和自定义消息的新异常。
2. **`initCause` 方法**：
   - `Throwable.initCause(Throwable cause)`：在已创建的异常对象上设置原始异常。

**示例代码**：

```java
public class ExceptionChainingExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (CustomException e) {
            System.out.println("捕获到自定义异常: " + e.getMessage());
            System.out.println("原始异常: " + e.getCause());
        }
    }

    public static void method1() throws CustomException {
        try {
            method2();
        } catch (ArithmeticException e) {
            // 将 ArithmeticException 包装在 CustomException 中
            throw new CustomException("方法1中发生错误", e);
        }
    }

    public static void method2() {
        // 抛出一个 ArithmeticException
        int result = 10 / 0;
    }
}

// 自定义异常类
class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
```

**运行结果**：

```java
捕获到自定义异常: 方法1中发生错误
原始异常: java.lang.ArithmeticException: / by zero
```

------

### 在自定义异常时保留原始异常的原因

在自定义异常时保留原始异常（即使用异常链）有以下几个重要原因：

#### 1. **保留异常的上下文信息**

- 原始异常通常包含导致问题的具体原因（如堆栈跟踪、错误信息等）。
- 通过保留原始异常，可以提供更详细的调试信息，帮助开发人员快速定位问题。

#### 2. **避免信息丢失**

- 如果不保留原始异常，可能会丢失导致问题的根本原因，导致调试困难。
- 异常链可以确保所有相关的异常信息都被保留，从而提高代码的可维护性。

#### 3. **支持多层异常处理**

- 在复杂的系统中，异常可能经过多层方法调用。
- 通过异常链，可以在每一层捕获并包装异常，同时保留原始异常的信息。

#### 4. **符合 Java 的最佳实践**

- Java 鼓励使用异常链来处理异常，尤其是在自定义异常时。
- 通过使用异常链，可以使代码更符合 Java 的设计规范，并提高代码的可读性和可维护性。

------

### 总结

- **Java 异常链**是一种机制，允许在一个异常中包含另一个异常，从而保留原始异常的上下文信息。
- **保留原始异常的原因**：
  - 提供详细的调试信息。
  - 避免信息丢失。
  - 支持多层异常处理。
  - 符合 Java 的最佳实践。

* 通过使用异常链，可以编写出更健壮、更易于调试的代码。

## 编程题2.3

编写一个自定义异常类MyCustomException，并在其构造器中接受另一个异常作为原因，并在抛出MyCustomException时，通过异常链传递原始异常。

* 解答：

当然可以！将不同的类分成不同的文件是 Java 编程中的最佳实践之一，这样可以提高代码的可读性、可维护性和模块化。以下是将上述代码拆分为多个文件的实现方式。

------

### 文件结构

复制

```
CustomExceptionExample/
├── MyCustomException.java
├── CustomExceptionExample.java
```

------

### 1. `MyCustomException.java`

定义自定义异常类 `MyCustomException`。

java

复制

```
// MyCustomException.java
public class MyCustomException extends Exception {
    // 构造器：接受自定义消息和原始异常
    public MyCustomException(String message, Throwable cause) {
        super(message, cause); // 调用父类构造器，设置消息和原因
    }

    // 构造器：仅接受原始异常
    public MyCustomException(Throwable cause) {
        super(cause); // 调用父类构造器，仅设置原因
    }
}
```

------

### 2. `CustomExceptionExample.java`

定义主类 `CustomExceptionExample`，包含 `main` 方法和相关方法。

```java
// CustomExceptionExample.java
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // 调用可能抛出异常的方法
            method1();
        } catch (MyCustomException e) {
            // 捕获并处理自定义异常
            System.out.println("捕获到自定义异常: " + e.getMessage());
            System.out.println("原始异常: " + e.getCause());
        }
    }

    public static void method1() throws MyCustomException {
        try {
            // 调用可能抛出异常的方法
            method2();
        } catch (ArithmeticException e) {
            // 将 ArithmeticException 包装在 MyCustomException 中
            throw new MyCustomException("方法1中发生错误", e);
        }
    }

    public static void method2() {
        // 抛出一个 ArithmeticException
        int result = 10 / 0;
    }
}
```

------

### 运行结果

```java
捕获到自定义异常: 方法1中发生错误
原始异常: java.lang.ArithmeticException: / by zero
```

------

### 总结

- **模块化设计**：将不同的类拆分为独立的文件，符合 Java 的模块化设计原则。
- **可读性和可维护性**：每个文件只包含一个类，代码结构更清晰，便于阅读和维护。
- **编译和运行**：通过 `javac` 编译所有相关文件，然后运行主类。

* 通过这种方式，可以实现代码的模块化管理，并提高代码的可读性和可维护性。

## 题目4：Java中的throw和throws关键字

文字题：解释Java中throw和throws关键字的区别和用途。

* 解答：

在 Java 中，`throw` 和 `throws` 是两个用于异常处理的关键字，它们的作用和用途有所不同。以下是对它们的详细解释：

------

### 1. **`throw` 关键字**

#### 作用：

- `throw` 用于**手动抛出异常**。
- 程序员可以在代码中显式地抛出一个异常对象，以表示某种错误或异常情况。

#### 语法：

```java
throw new ExceptionType("异常消息");
```

#### 用途：

- **抛出自定义异常**：可以在代码中抛出自定义异常，例如 `IllegalArgumentException` 或 `MyCustomException`。
- **处理特定逻辑**：当某些条件不满足时，可以通过 `throw` 抛出异常，终止当前方法的执行。

#### 示例：

```java
public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // 抛出异常
        } catch (IllegalArgumentException e) {
            System.out.println("捕获到异常: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            // 手动抛出 IllegalArgumentException
            throw new IllegalArgumentException("年龄必须大于等于18");
        }
        System.out.println("年龄合法");
    }
}
```

**运行结果**：

复制

```java
捕获到异常: 年龄必须大于等于18
```

------

### 2. **`throws` 关键字**

#### 作用：

- `throws` 用于**声明方法可能抛出的异常**。
- 它告诉调用者，当前方法可能会抛出某些异常，调用者需要处理这些异常。

#### 语法：

```java
public void methodName() throws ExceptionType1, ExceptionType2 {
    // 方法体
}
```

#### 用途：

- **声明异常**：如果方法中可能抛出 Checked 异常（如 `IOException` 或 `FileNotFoundException`），必须在方法签名中使用 `throws` 声明这些异常。
- **传递异常**：如果方法不想处理异常，可以通过 `throws` 将异常传递给调用者处理。

#### 示例：

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("nonexistent_file.txt"); // 可能抛出 FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("捕获到异常: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        // 尝试读取文件
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        // 如果文件不存在，会抛出 FileNotFoundException
    }
}
```

**运行结果**：

```
捕获到异常: nonexistent_file.txt (系统找不到指定的文件。)
```

------

### 3. **主要区别**

| **特性**     | **`throw`**                              | **`throws`**                              |
| :----------- | :--------------------------------------- | :---------------------------------------- |
| **作用**     | 手动抛出异常                             | 声明方法可能抛出的异常                    |
| **语法位置** | 方法体内                                 | 方法签名中                                |
| **异常类型** | 可以抛出任何异常（Checked 或 Unchecked） | 通常用于声明 Checked 异常                 |
| **使用场景** | 在代码中显式抛出异常                     | 在方法签名中声明可能抛出的异常            |
| **示例**     | `throw new IllegalArgumentException();`  | `public void method() throws IOException` |

------

### 4. **总结**

- **`throw`**：用于在代码中手动抛出异常，通常用于处理特定逻辑或抛出自定义异常。
- **`throws`**：用于在方法签名中声明可能抛出的异常，通常用于 Checked 异常，以便调用者处理。

通过合理使用 `throw` 和 `throws`，可以实现灵活的异常处理机制，提高代码的健壮性和可维护性。

## 编程题2.4

编写一个方法，该方法接受一个字符串参数并检查是否为空。如果为空，则使用throw关键字抛出一个NullPointerException。

````java
package QuesTwo.ProgramFour;
//编写一个方法，
// 该方法接受一个字符串参数并检查是否为空。
// 如果为空，则使用throw关键字抛出一个NullPointerException。
public class ProgramFour {
    // 检查字符串是否为null或者空字符串
    public static void checkString(String str){
        // 检查字符串是否为空字符串
        if (str == null || str.isEmpty()){
            // 抛出异常NullPointerException
            throw new NullPointerException("字符串不能为空");
        }
        System.out.println("字符串有效"+str);
    }

    public static void main(String[] args) {
        // 测试字符串
        String str1 = "Hello";
        String str2 = "";
        String str3 = null;

        // 调用方法
        try{
            System.out.println("检查字符串1：");
            checkString(str1);

            System.out.println("\n检查字符串2：");
            checkString(str2);

            System.out.println("\n检查字符串3");
            checkString(str3);
        }catch (NullPointerException e){
            System.err.println("捕获到异常：" + e.getMessage());
        }
    }
}
````

### 代码说明

1. **`checkString` 方法**：
   - 接受一个字符串参数 `str`。
   - 检查字符串是否为 `null` 或空字符串（使用 `str.isEmpty()`）。
   - 如果字符串为空，抛出 `NullPointerException`，并附带错误信息“字符串不能为空”。
   - 如果字符串有效，输出“字符串有效”。
2. **`main` 方法**：
   - 定义三个测试字符串：`str1`（非空字符串）、`str2`（`null` 字符串）和 `str3`（空字符串）。
   - 使用 `try-catch` 结构调用 `checkString` 方法。
   - 如果方法抛出 `NullPointerException`，捕获异常并输出错误信息。

## 题目5：Java异常处理的最佳实践

文字题：讨论在Java异常处理中应遵循的最佳实践，包括何时捕获异常以及何时传播异常。

* 解答：

在 Java 异常处理中，遵循最佳实践可以提高代码的健壮性、可读性和可维护性。以下是一些关键的最佳实践，包括何时捕获异常以及何时传播异常。

------

### 1. **捕获异常的最佳实践**

#### 1.1 **捕获具体的异常类型**

- 捕获异常时，尽量捕获具体的异常类型，而不是捕获通用的 `Exception` 或 `Throwable`。
- 捕获具体的异常类型可以提供更精确的错误处理逻辑。

**示例**：

```java
try {
    // 可能抛出 FileNotFoundException
    FileInputStream file = new FileInputStream("nonexistent_file.txt");
} catch (FileNotFoundException e) {
    System.err.println("文件未找到: " + e.getMessage());
}
```

------

#### 1.2 **不要忽略异常**

- 捕获异常后，不要忽略它（即不要捕获异常后不做任何处理）。
- 至少应该记录异常信息，或者提供有意义的错误提示。

**示例**：

```java
try {
    // 可能抛出异常的代码
} catch (Exception e) {
    // 不要忽略异常
    System.err.println("捕获到异常: " + e.getMessage());
}
```

------

#### 1.3 **使用 finally 释放资源**

- 在 `finally` 块中释放资源（如关闭文件、数据库连接等），确保资源不会泄漏。

**示例**：

```java
FileInputStream file = null;
try {
    file = new FileInputStream("file.txt");
    // 读取文件内容
} catch (IOException e) {
    System.err.println("读取文件时发生错误: " + e.getMessage());
} finally {
    if (file != null) {
        try {
            file.close();
        } catch (IOException e) {
            System.err.println("关闭文件时发生错误: " + e.getMessage());
        }
    }
}
```

------

#### 1.4 **捕获异常后提供有意义的错误信息**

- 捕获异常后，提供清晰的错误信息，帮助开发人员或用户理解问题。

**示例**：

```
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.err.println("发生算术错误: 除以零是不允许的");
}
```

------

### 2. **传播异常的最佳实践**

#### 2.1 **使用 throws 声明 Checked 异常**

- 如果方法中可能抛出 Checked 异常（如 `IOException` 或 `SQLException`），必须在方法签名中使用 `throws` 声明这些异常。
- 这告诉调用者需要处理这些异常。

**示例**：

```java
public void readFile(String fileName) throws FileNotFoundException {
    FileInputStream file = new FileInputStream(fileName);
}
```

------

#### 2.2 **不要捕获不必要的异常**

- 如果方法无法处理某个异常，不要捕获它，而是将其传播给调用者。
- 这样可以避免隐藏问题，并让调用者决定如何处理异常。

**示例**：

```java
public void method1() throws IOException {
    // 可能抛出 IOException
    method2();
}

public void method2() throws IOException {
    // 可能抛出 IOException
    FileInputStream file = new FileInputStream("file.txt");
}
```

------

#### 2.3 **使用异常链传递原始异常**

- 在自定义异常中，使用异常链（`initCause` 或构造器）传递原始异常，保留异常的上下文信息。

**示例**：

```java
public void method1() throws MyCustomException {
    try {
        method2();
    } catch (IOException e) {
        throw new MyCustomException("方法1中发生错误", e);
    }
}
```

------

### 3. **何时捕获异常**

- **捕获异常的时机**：

  - 当方法能够处理异常并从中恢复时，应该捕获异常。
  - 例如，捕获 `FileNotFoundException` 并提示用户文件不存在。

- **示例**：

  ```java
  try {
      FileInputStream file = new FileInputStream("file.txt");
  } catch (FileNotFoundException e) {
      System.err.println("文件未找到: " + e.getMessage());
  }
  ```

------

### 4. **何时传播异常**

- **传播异常的时机**：

  - 当方法无法处理异常时，应该将异常传播给调用者。
  - 例如，方法中可能抛出 `IOException`，但方法本身无法处理，因此使用 `throws` 声明异常。

- **示例**：

  ```java
  public void readFile(String fileName) throws IOException {
      FileInputStream file = new FileInputStream(fileName);
  }
  ```

------

### 5. **其他最佳实践**

#### 5.1 **避免捕获 RuntimeException**

- 不要捕获 `RuntimeException` 或 `Error`，除非你确实知道如何处理它们。
- 捕获这些异常可能会隐藏严重的程序错误。

#### 5.2 **使用自定义异常**

- 如果标准异常无法满足需求，可以创建自定义异常，提供更具体的错误信息。

#### 5.3 **记录异常日志**

- 使用日志框架（如 `java.util.logging` 或 `log4j`）记录异常信息，便于调试和问题定位。

------

### 总结

- **捕获异常**：
  - 捕获具体的异常类型。
  - 不要忽略异常，提供有意义的错误信息。
  - 使用 `finally` 释放资源。
- **传播异常**：
  - 使用 `throws` 声明 Checked 异常。
  - 不要捕获不必要的异常。
  - 使用异常链传递原始异常。
- **何时捕获异常**：当方法能够处理异常时。
- **何时传播异常**：当方法无法处理异常时。

通过遵循这些最佳实践，可以编写出更健壮、更易于维护的 Java 代码。

## 编程题2.5

设计一个简单的银行账户类，包含存款和取款方法。在取款方法中，如果账户余额不足，则抛出一个InsufficientFundsException，并在主方法中处理这个异常。

以下是一个简单的银行账户类的实现，包含存款和取款方法。在取款方法中，如果账户余额不足，则抛出一个自定义异常 `InsufficientFundsException`，并在主方法中处理这个异常。

------

### 代码实现

#### 1. 自定义异常类 `InsufficientFundsException`

```java
// InsufficientFundsException.java
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
```

------

#### 2. 银行账户类 `BankAccount`

```java
// BankAccount.java
public class BankAccount {
    private double balance; // 账户余额

    // 构造方法
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // 存款方法
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功，当前余额: " + balance);
        } else {
            System.out.println("存款金额必须大于0");
        }
    }

    // 取款方法
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // 如果余额不足，抛出 InsufficientFundsException
            throw new InsufficientFundsException("余额不足，当前余额: " + balance);
        } else {
            balance -= amount;
            System.out.println("取款成功，当前余额: " + balance);
        }
    }

    // 获取余额
    public double getBalance() {
        return balance;
    }
}
```

------

#### 3. 主类 `BankAccountDemo`

```java
// BankAccountDemo.java
public class BankAccountDemo {
    public static void main(String[] args) {
        // 创建一个银行账户，初始余额为 1000
        BankAccount account = new BankAccount(1000);

        // 存款
        account.deposit(500);

        // 取款
        try {
            account.withdraw(1600); // 尝试取款 1600
        } catch (InsufficientFundsException e) {
            // 捕获并处理 InsufficientFundsException
            System.err.println("捕获到异常: " + e.getMessage());
        }

        // 再次取款
        try {
            account.withdraw(800); // 尝试取款 800
        } catch (InsufficientFundsException e) {
            System.err.println("捕获到异常: " + e.getMessage());
        }

        // 输出最终余额
        System.out.println("最终余额: " + account.getBalance());
    }
}
```

------

### 代码说明

1. **自定义异常类 `InsufficientFundsException`**：
   - 继承自 `Exception`。
   - 提供一个构造方法，接受自定义消息。
2. **银行账户类 `BankAccount`**：
   - 包含一个 `balance` 字段，表示账户余额。
   - 提供 `deposit` 方法，用于存款。
   - 提供 `withdraw` 方法，用于取款。如果余额不足，抛出 `InsufficientFundsException`。
   - 提供 `getBalance` 方法，用于获取当前余额。
3. **主类 `BankAccountDemo`**：
   - 创建一个 `BankAccount` 对象，初始余额为 1000。
   - 调用 `deposit` 方法存款 500。
   - 调用 `withdraw` 方法尝试取款 1600，由于余额不足，抛出 `InsufficientFundsException`，并在 `catch` 块中处理异常。
   - 再次调用 `withdraw` 方法尝试取款 800，取款成功。
   - 输出最终余额。

------

### 运行结果

```java
存款成功，当前余额: 1500.0
捕获到异常: 余额不足，当前余额: 1500.0
取款成功，当前余额: 700.0
最终余额: 700.0
```

------

### 总结

- **自定义异常**：通过自定义异常 `InsufficientFundsException`，可以提供更具体的错误信息。
- **异常处理**：在 `withdraw` 方法中抛出异常，并在主方法中使用 `try-catch` 捕获并处理异常。
- **代码结构**：通过合理的异常处理机制，确保程序在发生异常时不会崩溃，并提供清晰的错误提示。

* 通过这种方式，可以实现一个简单的银行账户类，并在取款时处理余额不足的情况。

# 03

## 题目1：Java继承的概念

文字题：解释Java中的继承是什么，并讨论它如何允许代码重用。

* 解答：

**继承**（Inheritance）是面向对象编程（OOP）中的一个核心概念，它允许一个类（称为**子类**或**派生类**）继承另一个类（称为**父类**或**基类**）的属性和方法。通过继承，子类可以复用父类的代码，并且可以在子类中添加新的属性和方法，或者重写父类的方法。

在 Java 中，继承通过 `extends` 关键字实现。子类继承父类的所有**非私有**（`private`）成员（包括字段和方法），但无法直接访问父类的私有成员

***

### 继承的语法

```java
class ParentClass {
    // 父类的字段和方法
}

class ChildClass extends ParentClass {
    // 子类的字段和方法
}
```

- `ParentClass` 是父类。
- `ChildClass` 是子类，通过 `extends` 关键字继承 `ParentClass`。

***

### 继承的特性

1. **代码重用**：
   - 子类可以直接使用父类的非私有字段和方法，而无需重新编写代码。
   - 这大大减少了代码的重复，提高了代码的可维护性和可读性。
2. **方法重写（Override）**：
   - 子类可以重写父类的方法，以实现不同的行为。
   - 重写方法时，子类的方法签名必须与父类的方法签名相同。
3. **多态性**：
   - 继承是实现多态性的基础。通过继承，子类对象可以被视为父类对象，从而实现动态绑定和方法调用。
4. **单一继承**：
   - Java 只支持单一继承，即一个类只能继承一个父类。
   - 但 Java 提供了接口（`interface`）来实现多重继承的效果。

------

### 继承如何允许代码重用

#### 1. **复用父类的字段和方法**

子类可以直接使用父类的字段和方法，而无需重新定义它们。

#### 2. **重写父类的方法**

子类可以重写父类的方法，以实现不同的行为。

#### 3. **多态性**

通过继承，子类对象可以被视为父类对象，从而实现多态性。

### 继承的优点

1. **代码重用**：
   - 子类可以直接使用父类的字段和方法，减少代码重复。
2. **可扩展性**：
   - 通过继承，可以轻松扩展类的功能，而无需修改现有代码。
3. **多态性**：
   - 继承是实现多态性的基础，允许子类对象被视为父类对象。
4. **代码组织**：
   - 继承可以将相关类组织在一起，形成层次结构，提高代码的可读性和可维护性。

------

### 继承的注意事项

1. **单一继承**：
   - Java 只支持单一继承，即一个类只能继承一个父类。
   - 如果需要实现多重继承的效果，可以使用接口（`interface`）。
2. **避免滥用继承**：
   - 继承应该用于表示“is-a”关系（如“狗是一种动物”）。
   - 如果两个类之间没有明显的“is-a”关系，应该避免使用继承。
3. **父类的私有成员**：
   - 子类无法直接访问父类的私有成员（如 `private` 字段和方法）。
   - 如果需要访问父类的私有成员，可以通过父类的公共方法（如 `getter` 和 `setter`）来实现。

------

### 总结

- **继承**是 Java 中实现代码重用的核心机制，允许子类复用父类的字段和方法。
- 通过继承，子类可以重写父类的方法，实现多态性。
- 继承提高了代码的可维护性、可扩展性和可读性。
- 在设计类时，应该合理使用继承，避免滥用，并确保类之间存在“is-a”关系。

* 通过继承，Java 提供了一种强大的机制来组织和管理代码，使程序更加模块化和易于扩展。

## 编程题3.1

创建一个基类Animal和两个继承自Animal的子类Dog和Cat。每个类都有makeSound方法。

以下是一个完整的 Java 示例，展示如何创建一个基类 `Animal`，以及两个继承自 `Animal` 的子类 `Dog` 和 `Cat`。每个类都有 `makeSound` 方法，分别实现不同的行为。

------

### 代码实现

#### 1. 基类 `Animal`

```java
// Animal.java
class Animal {
    // 字段：动物的名字
    String name;

    // 构造方法
    public Animal(String name) {
        this.name = name;
    }

    // 方法：发出声音
    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }
}
```

------

#### 2. 子类 `Dog`

```java
// Dog.java
class Dog extends Animal {
    // 构造方法
    public Dog(String name) {
        super(name); // 调用父类的构造方法
    }

    // 重写 makeSound 方法
    @Override
    public void makeSound() {
        System.out.println(name + " is barking.");
    }
}
```

------

#### 3. 子类 `Cat`

```java
// Cat.java
class Cat extends Animal {
    // 构造方法
    public Cat(String name) {
        super(name); // 调用父类的构造方法
    }

    // 重写 makeSound 方法
    @Override
    public void makeSound() {
        System.out.println(name + " is meowing.");
    }
}
```

------

#### 4. 主类 `Main`

```java
// Main.java
public class Main {
    public static void main(String[] args) {
        // 创建 Animal 对象
        Animal animal = new Animal("Generic Animal");
        animal.makeSound(); // 调用父类的 makeSound 方法

        // 创建 Dog 对象
        Dog dog = new Dog("Buddy");
        dog.makeSound(); // 调用子类的 makeSound 方法

        // 创建 Cat 对象
        Cat cat = new Cat("Whiskers");
        cat.makeSound(); // 调用子类的 makeSound 方法
    }
}
```

------

### 代码说明

1. **基类 `Animal`**：
   - 包含一个 `name` 字段，表示动物的名字。
   - 提供一个构造方法，用于初始化 `name`。
   - 提供一个 `makeSound` 方法，输出动物发出声音的通用信息。
2. **子类 `Dog`**：
   - 继承自 `Animal`。
   - 重写 `makeSound` 方法，输出狗的特定声音（“barking”）。
3. **子类 `Cat`**：
   - 继承自 `Animal`。
   - 重写 `makeSound` 方法，输出猫的特定声音（“meowing”）。
4. **主类 `Main`**：
   - 创建 `Animal`、`Dog` 和 `Cat` 对象。
   - 调用每个对象的 `makeSound` 方法，输出不同的声音。

------

### 运行结果

```java
Generic Animal is making a sound.
Buddy is barking.
Whiskers is meowing.
```

------

### 总结

- **继承**：`Dog` 和 `Cat` 类继承了 `Animal` 类的 `name` 字段和 `makeSound` 方法。
- **方法重写**：`Dog` 和 `Cat` 类重写了 `makeSound` 方法，实现了不同的行为。
- **代码重用**：通过继承，`Dog` 和 `Cat` 类复用了 `Animal` 类的代码，减少了重复代码。
- **多态性**：`Dog` 和 `Cat` 对象可以被视为 `Animal` 对象，调用 `makeSound` 方法时会根据实际对象类型执行相应的方法。

* 通过这种方式，可以实现一个简单的继承结构，展示 Java 中继承和方法重写的用法。

## 题目2：Java多态性的理解

文字题：描述Java中的多态性是什么，以及它如何影响方法调用。

### 什么是 Java 中的多态性？

**多态性**（Polymorphism）是面向对象编程（OOP）中的一个核心概念，它允许对象以多种形式存在。在 Java 中，多态性主要通过以下两种方式实现：

1. **编译时多态性（静态多态性）**：
   - 通过**方法重载**（Overloading）实现。
   - 在编译时确定调用哪个方法。
2. **运行时多态性（动态多态性）**：
   - 通过**方法重写**（Overriding）和**继承**实现。
   - 在运行时根据对象的实际类型确定调用哪个方法。

------

### 运行时多态性

运行时多态性是 Java 中最常用的多态性形式，它通过继承和方法重写实现。以下是运行时多态性的关键点：

#### 1. **方法重写**

- 子类可以重写父类的方法，以实现不同的行为。
- 重写方法时，子类的方法签名必须与父类的方法签名相同。

#### 2. **动态绑定**

- 在运行时，Java 根据对象的实际类型来确定调用哪个方法。
- 即使使用父类类型的引用指向子类对象，调用的仍然是子类重写的方法。

------

### 多态性如何影响方法调用

#### 1. **父类引用指向子类对象**

- 通过父类类型的引用，可以指向子类对象。
- 调用方法时，实际调用的是子类重写的方法。

**示例**：

java

复制

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // 父类引用指向子类对象
        myAnimal.makeSound();        // 调用子类的 makeSound 方法
    }
}
```

**输出**：

复制

```java
Dog is barking.
```

- `myAnimal` 是一个 `Animal` 类型的引用，但它指向的是 `Dog` 对象。
- 调用 `makeSound` 方法时，实际调用的是 `Dog` 类的 `makeSound` 方法。

------

#### 2. **方法调用的动态绑定**

- 在运行时，Java 根据对象的实际类型来确定调用哪个方法。
- 这种机制称为**动态绑定**（Dynamic Binding）。

**示例**：

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog(); // 父类引用指向 Dog 对象
        animals[1] = new Cat(); // 父类引用指向 Cat 对象

        for (Animal animal : animals) {
            animal.makeSound(); // 动态绑定，调用实际对象的方法
        }
    }
}
```

**输出**：

```java
Dog is barking.
Cat is meowing.
```

- `animals` 数组中的每个元素都是 `Animal` 类型的引用，但它们分别指向 `Dog` 和 `Cat` 对象。
- 调用 `makeSound` 方法时，Java 根据对象的实际类型（`Dog` 或 `Cat`）来确定调用哪个方法。

------

### 多态性的优点

1. **代码复用**：
   - 通过多态性，可以复用父类的代码，并在子类中实现不同的行为。
2. **灵活性**：
   - 多态性使得程序更加灵活，可以根据对象的实际类型动态调用方法。
3. **可扩展性**：
   - 通过多态性，可以轻松扩展类的功能，而无需修改现有代码。
4. **简化代码**：
   - 多态性可以简化代码结构，减少重复代码，提高代码的可读性和可维护性。

------

### 多态性的注意事项

1. **父类引用无法访问子类的特有方法**：
   - 如果子类定义了父类中没有的方法，父类引用无法直接调用这些方法。

**示例**：

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }

    public void fetch() {
        System.out.println("Dog is fetching.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound(); // 合法，调用子类的 makeSound 方法
        // myAnimal.fetch(); // 非法，父类引用无法访问子类的特有方法
    }
}
```

- `myAnimal` 是一个 `Animal` 类型的引用，无法调用 `Dog` 类的 `fetch` 方法。

1. **避免滥用多态性**：
   - 多态性应该用于表示“is-a”关系（如“狗是一种动物”）。
   - 如果两个类之间没有明显的“is-a”关系，应该避免使用继承和多态性。

------

### 总结

- **多态性**是 Java 中实现灵活性和可扩展性的核心机制。
- **运行时多态性**通过继承和方法重写实现，允许父类引用指向子类对象，并根据对象的实际类型动态调用方法。
- 多态性提高了代码的复用性、灵活性和可扩展性，简化了代码结构。
- 在设计类时，应该合理使用多态性，确保类之间存在“is-a”关系，并避免滥用。

通过多态性，Java 提供了一种强大的机制来组织和管理代码，使程序更加模块化和易于扩展。

## 编程题3.2

扩展题目1，创建一个Animal数组，包含Dog和Cat对象，并调用每个对象的makeSound方法。

## 题目3：Java方法重写与重载

文字题：区分Java中的方法重写（Override）和重载（Overload）。

## 编程题3.3

在Animal类中定义一个display方法，并在Dog和Cat类中重写这个方法。同时，在Animal类中重载display方法。

## 题目4：Java抽象类和接口

文字题：讨论Java中抽象类和接口的区别及其用途。

## 编程题3.4

创建一个抽象类Shape，其中包含一个抽象方法draw。然后创建一个接口Colorable，包含一个方法setColor。实现这两个抽象概念的Circle类。

## 题目5：Java super关键字的使用

文字题：解释Java中super关键字的用途和它在继承中的作用。

## 编程题3.5

创建一个基类Vehicle，包含一个startEngine方法。创建一个子类Car，它重写startEngine方法，并在其中使用super.startEngine()。

# 04

题目1：Java this 关键字的作用
文字题：解释Java中this关键字的用途和它在方法中如何引用当前对象。

编程题：创建一个名为Person的类，包含name和age属性，以及一个构造器和两个方法：getInfo()和updateAge(int age)。在getInfo()方法中使用this关键字来区分局部变量和成员变量。

题目2：Java参数传递机制
文字题：描述Java中参数传递是值传递还是引用传递，并举例说明。

编程题：编写一个方法swap，接受两个整数参数并交换它们的值，然后在主方法中测试这个方法。

题目3：Java方法重载
文字题：解释Java中方法重载是什么，以及它如何根据方法签名区分不同的方法。

编程题：在一个类Calculator中实现三个重载的add方法，分别接受两个整数、两个浮点数和三个整数作为参数。

题目4：Java方法重写
文字题：描述Java中方法重写的概念，并说明它与方法重载的区别。

编程题：创建一个基类Animal和一个子类Bird，重写Animal类中的makeSound方法。

题目5：Java this 关键字与构造器
文字题：讨论在Java构造器中使用this关键字调用另一个构造器的目的和语法。

编程题：设计一个Car类，包含model、year和color属性，以及使用this关键字链式调用的多个构造器。

# 05

题目1：抽象类和接口的区别
文字题：解释Java中抽象类和接口的主要区别，并讨论它们各自适用的场景。

编程题：创建一个抽象类Shape，包含一个抽象方法draw()，然后创建两个子类Circle和Rectangle实现这个抽象方法。

题目2：抽象类中成员变量的访问
文字题：讨论在抽象类中是否可以有非抽象方法和实例变量，并解释它们如何在子类中被访问。

编程题：设计一个抽象类Vehicle，其中包含一个实例变量wheels和一个非抽象方法startEngine()。创建一个子类Car继承Vehicle并重写startEngine()方法。

题目3：抽象类与构造器
文字题：解释为什么抽象类不能被实例化，以及是否可以为抽象类提供构造器。

编程题：编写一个抽象类Animal，包含一个构造器和一个抽象方法makeSound()。创建一个子类Dog继承Animal并实现makeSound()方法。

题目4：抽象类与多态
文字题：描述如何通过抽象类实现多态，并讨论它在设计模式中的应用。

编程题：创建一个抽象类Painter，包含一个抽象方法paint()。创建两个子类HousePainter和CarPainter实现paint()方法。编写一个方法paintObject(Painter painter)，接受Painter对象并调用paint()方法。

题目5：抽象类与方法重写
文字题：讨论在抽象类中重写方法与在普通类中重写方法的区别和注意事项。

编程题：设计一个抽象类MusicPlayer，包含一个抽象方法play()。创建一个子类MP3Player重写play()方法，并在主方法中创建MP3Player对象并调用play()方法。

# 06

题目1：Java局部变量的作用域
文字题：描述Java中局部变量的作用域是什么，并说明它们何时被初始化。

编程题：编写一个方法，该方法接受两个整数参数并返回它们的和。讨论局部变量a和b的作用域。

题目2：Java实例变量和类变量的作用域
文字题：区分Java中的实例变量和类变量，并解释它们各自的作用域。

编程题：创建一个类Counter，包含一个实例变量count和一个类变量total。编写方法来增加count和total的值，并在主方法中演示它们的作用域。

题目3：Java代码块作用域
文字题：解释Java中代码块作用域是什么，并给出一个代码块作用域的例子。

编程题：在一个类中创建一个静态代码块和一个实例代码块，并在其中初始化类变量和实例变量。讨论这些变量的作用域。

题目4：Java方法参数的作用域
文字题：描述Java中方法参数的作用域，并讨论它们与局部变量的关系。

编程题：编写一个方法，该方法接受一个字符串参数，并在方法内部创建一个同名的局部变量。讨论参数和局部变量的作用域和关系。

题目5：Java中this和super关键字与作用域
文字题：解释Java中this和super关键字如何影响成员变量和方法的作用域。

编程题：创建一个基类Person和一个子类Employee。在Person类中定义一个getName()方法，在Employee类中重写这个方法，并使用super.getName()来调用基类方法。讨论this和super如何影响方法调用。

# 07

题目1：Java接口的多实现
文字题：解释为什么一个Java接口可以被多个类实现，并讨论这种设计的好处。

编程题：定义一个接口Flyable，包含一个方法fly()。创建两个类Bird和Airplane实现这个接口，并在主方法中创建它们的实例，调用fly()方法。

题目2：Java默认方法
文字题：描述Java 8中引入的默认方法是什么，以及它们如何影响接口的实现。

编程题：在一个接口Chargeable中定义一个默认方法charge()。实现这个接口，并在实现类中覆盖这个方法。

题目3：Java接口与抽象类的区别
文字题：讨论Java接口和抽象类的主要区别，并给出使用场景的例子。

编程题：创建一个接口Printable，包含一个方法print()。创建一个抽象类Document也包含一个方法print()。实现Printable接口和继承Document的两个不同类。

题目4：Java接口中的静态方法
文字题：解释Java接口中可以包含静态方法，并讨论它们如何被调用。

编程题：在一个接口Calculator中定义一个静态方法add(int a, int b)。在主方法中调用这个静态方法。

题目5：Java接口作为参数传递
文字题：讨论将接口作为参数传递的好处，并给出一个实际的应用场景。

编程题：定义一个接口RunnableTask，包含一个方法run()。实现这个接口，并创建一个方法executeTask(RunnableTask task)，它接受RunnableTask接口作为参数并执行run()方法。

# 08

题目1：Java中子类的构造方法如何调用父类的构造方法
文字题：解释Java中子类的构造方法如何调用父类的构造方法，以及super关键字的作用。

编程题：创建一个基类Vehicle和一个子类Car。Vehicle有一个构造器，接受一个品牌参数。Car也有一个构造器，接受一个品牌和一个型号参数。在Car的构造器中调用Vehicle的构造器。

题目2：Java中子类构造方法和父类成员变量的初始化顺序
文字题：描述Java中子类构造方法执行时，父类成员变量和子类成员变量的初始化顺序。

编程题：创建一个基类Animal和一个子类Dog。Animal有一个成员变量name和一个构造器。Dog也有一个成员变量breed和一个构造器。展示在创建Dog对象时成员变量的初始化顺序。

题目3：Java中无参构造方法的调用
文字题：讨论Java中子类构造方法如果不显式调用父类构造方法，将会发生什么。

编程题：创建一个基类Shape和一个子类Circle。Shape有一个无参构造方法，打印一条消息。Circle有一个构造器，不显式调用Shape的构造器。创建Circle对象并观察输出。

题目4：Java中构造方法和this关键字的使用
文字题：解释Java中this关键字在构造方法中的作用，以及如何使用它调用当前类的其他构造方法。

编程题：创建一个类Book，包含两个构造器。一个接受书名和作者，另一个接受书名、作者和出版年份。使用this关键字在这两个构造器之间进行调用。

题目5：Java中父类构造方法的调用时机
文字题：讨论在Java中父类的构造方法在子类构造过程中何时被调用。

编程题：创建一个基类Person和一个子类Employee。Person有一个构造器，接受一个名字参数。Employee有一个构造器，接受一个名字和一个员工ID参数。在Employee的构造器中调用Person的构造器，并讨论调用时机。

# 09

题目1：Java静态方法和非静态方法的区别
文字题：解释Java中静态方法和非静态方法的主要区别，包括它们在调用和使用上的差异。

编程题：创建一个类MathUtils，包含一个静态方法add(int a, int b)和一个非静态方法subtract(int a, int b)。在主方法中调用这两个方法，并解释调用方式的不同。

题目2：静态方法访问类成员
文字题：讨论为什么静态方法不能直接访问类的非静态成员变量和非静态方法。

编程题：创建一个类Person，包含一个非静态成员变量name和一个静态方法printName(String name)。展示如何在静态方法中访问非静态成员变量。

题目3：静态方法与构造器
文字题：解释Java中静态方法是否可以调用构造器，以及构造器是否可以调用静态方法。

编程题：创建一个类Product，包含一个静态方法loadConfig()和一个构造器。在构造器中调用loadConfig()方法，并在静态方法中创建Product对象。

题目4：静态方法与类变量
文字题：描述静态方法如何访问和操作类变量，并讨论它们在单例模式中的应用。

编程题：设计一个单例类DatabaseConnection，包含一个类变量instance和一个静态方法getInstance()。确保getInstance()方法返回类的唯一实例。

题目5：静态方法的继承和重写
文字题：讨论Java中静态方法是否可以被继承和重写，并解释为什么。

编程题：创建一个基类Shape和一个子类Circle。Shape类包含一个静态方法calculateArea()。在Circle类中重写这个方法，并在主方法中调用这两个方法。

# 10

题目1：Java异常层次结构
文字题：描述Java异常层次结构的根类是什么，并解释检查型异常和非检查型异常的区别。

编程题：编写一个Java程序，尝试打开一个不存在的文件，并捕获并处理FileNotFoundException（检查型异常）。

题目2：Java RuntimeException
文字题：解释Java中RuntimeException是什么，并给出几个继承自它的常见异常的例子。

编程题：编写一个方法，当传入的整数数组包含负数时，抛出IllegalArgumentException，并在主方法中测试这个行为。

题目3：Java finally块的作用
文字题：讨论Java中finally块的重要性以及它在异常处理中的作用。

编程题：编写一个Java程序，演示在try-catch块中打开一个资源，并在finally块中确保资源被关闭。

题目4：Java自定义异常
文字题：解释何时应该创建自定义异常，并讨论自定义异常的命名约定。

编程题：创建一个自定义异常InvalidAgeException，并在处理用户年龄输入时抛出这个异常。

题目5：Java异常链
文字题：解释Java异常链的概念，并讨论它在调试异常时的好处。

编程题：编写一个方法，该方法接受一个文件路径作为参数，并在尝试打开文件时捕获IOException，同时将原始异常作为新异常的cause抛出。

# 11

题目1：方法重写与方法签名
文字题：阐述在Java中方法重写需要满足哪些条件，并解释方法签名的含义。

编程题：定义一个基类Animal和一个子类Dog。在Animal类中定义一个方法makeSound()，然后在Dog类中重写这个方法。

题目2：重写与访问控制
文字题：讨论在子类中重写父类方法时，如何通过访问控制符影响方法的可见性。

编程题：创建一个基类Vehicle，其中包含一个startEngine()方法。然后创建一个子类Car，重写startEngine()方法，并尝试降低访问级别。

题目3：重写与协变返回类型
文字题：解释Java中的协变返回类型是什么，并讨论它与方法重写的关系。

编程题：定义一个基类Shape和一个子类Circle。Shape类包含一个返回Shape类型的方法clone()。在Circle类中重写这个方法，使其返回Circle类型。

题目4：重写与静态方法
文字题：讨论为什么静态方法不能被重写，并解释它们在继承中的行为。

编程题：创建一个基类MathUtils，其中包含一个静态方法add(int a, int b)。尝试在子类AdvancedMath中重写这个方法。

题目5：重写与构造方法
文字题：解释为什么构造方法不能被重写，并讨论子类构造方法与父类构造方法的关系。

编程题：创建一个基类Person和一个子类Student。Person类有一个接受名字的构造方法。在Student类中提供一个构造方法，它除了接受名字外还接受一个学号，并在Student的构造方法中调用Person的构造方法。

# 12

题目1：基本类型与包装类的转换
文字题：解释Java中基本数据类型和它们的包装类之间如何进行自动装箱和拆箱。

编程题：编写一个Java程序，将Integer对象转换为int基本类型，并演示自动拆箱的过程。

题目2：对象的向上转型和向下转型
文字题：讨论Java中对象的向上转型和向下转型的区别，并解释何时需要强制类型转换。

编程题：创建一个基类Animal和两个子类Dog和Cat。编写代码演示如何将Animal类型的对象向下转型为Dog类型。

题目3：多态与类型转换
文字题：解释在多态的情况下，为什么可能需要进行强制类型转换，并讨论其安全性。

编程题：创建一个方法，接受Animal类型的参数并调用一个makeSound方法。在子类中重写这个方法，并在主方法中演示如何调用子类的特定实现。

题目4：数组与泛型的类型转换
文字题：讨论Java中数组的协变返回类型，并解释为什么数组不能进行泛型的协变。

编程题：编写一个泛型方法，返回一个泛型类型的数组，并尝试将返回值转换为特定类型的数组。

题目5：强制类型转换与异常
文字题：解释在Java中进行强制类型转换时可能抛出的异常，并讨论如何安全地进行类型转换。

编程题：编写一个程序，尝试将一个Object类型的变量强制类型转换为String，并处理可能出现的ClassCastException。

# 13

题目1：线程间通信
文字题：解释Java中线程间如何进行通信，并讨论wait()、notify()和notifyAll()方法的作用。

编程题：创建两个线程，一个生产者线程和一个消费者线程，使用一个共享资源（如一个整数）。生产者线程增加共享资源的值，消费者线程减少它的值。确保线程间正确通信，避免数据不一致。

题目2：死锁
文字题：讨论Java中死锁的概念，并解释如何避免死锁。

编程题：编写一个程序，创建两个线程，每个线程尝试锁定两个资源（如两个不同的对象）。设计程序使得这两个线程能够产生死锁，并展示如何避免这种情况。

题目3：线程池的使用
文字题：解释Java中线程池的作用，并讨论它如何提高性能。

编程题：实现一个简单的线程池，允许提交一定数量的任务，并使用固定数量的工作线程来执行这些任务。

题目4：Callable和Future
文字题：讨论Java中Callable接口与Runnable接口的区别，并解释Future对象的作用。

编程题：使用ExecutorService创建一个线程池，并提交一个Callable任务。获取与Callable任务关联的Future对象，并在主线程中获取任务结果。

题目5：原子变量和可见性
文字题：解释Java中原子变量的作用，并讨论它们如何保证线程间操作的原子性和可见性。

编程题：创建一个多线程程序，其中一个线程更新一个共享计数器，而另一个线程读取这个计数器。使用AtomicInteger来确保更新对所有线程都是可见的，并且是原子操作。

# 14

题目1：Java异常处理基础
文字题：描述Java中异常处理的必要性，并解释try、catch、finally块的作用。

编程题：编写一个Java程序，尝试解析用户输入的整数，并处理可能发生的NumberFormatException。

题目2：Java自定义异常
文字题：解释何时需要创建自定义异常，并讨论自定义异常与标准异常的区别。

编程题：创建一个自定义异常InvalidDataException，并在处理特定业务逻辑时抛出此异常。

题目3：Java异常链
文字题：讨论Java异常链的概念，并解释它如何帮助调试。

编程题：编写一个方法，该方法打开一个文件并读取内容。在捕获IOException的同时，将原始异常包装在新的异常中抛出。

题目4：Java Checked和Unchecked异常
文字题：解释Java中Checked异常和Unchecked异常的区别，并讨论它们在程序设计中的使用场景。

编程题：编写一个程序，该程序包含一个可能抛出Checked异常的方法，并在调用处适当处理这个异常。

题目5：Java finally块与资源释放
文字题：讨论Java中finally块的重要性，特别是在资源管理（如关闭文件流）中的应用。

编程题：编写一个Java程序，使用try-catch-finally块打开和关闭文件。确保即使在发生异常的情况下，文件也能被正确关闭。

# 15

题目1：抽象类的应用
文字题：解释抽象类在Java中的作用以及它们如何帮助实现代码的抽象化和模块化。

编程题：设计一个抽象类Shape，包含一个抽象方法calculateArea()，然后创建两个子类Circle和Rectangle实现这个抽象方法。

题目2：泛型类和泛型接口的使用
文字题：讨论Java中泛型类和泛型接口的优势，特别是在编写集合类时。

编程题：创建一个泛型类Box<T>，它包含一个泛型类型T的私有成员变量，并提供相应的getter和setter方法。然后创建一个泛型接口ComparableBox<T>，其中包含一个比较两个泛型类型对象的方法。

题目3：集合框架的应用
文字题：描述Java集合框架中List、Set和Map接口的主要区别和用途。

编程题：编写一个程序，使用Java集合框架实现一个简单的电话簿，允许添加、删除和查找联系人信息。

题目4：设计模式的实现
文字题：解释单例模式和工厂模式在软件开发中的应用场景和优缺点。

编程题：实现单例模式，创建一个DatabaseConnection类，确保只能创建一个数据库连接实例。然后实现工厂模式，创建一个ShapeFactory类，用于生成不同类型的Shape对象。

题目5：方法重写和方法重载
文字题：区分Java中方法重写（Override）和方法重载（Overload），并讨论它们在面向对象编程中的作用。

编程题：创建一个类Calculator，包含方法add(int a, int b)和add(double a, double b)，展示方法重载。然后在子类ScientificCalculator中重写add方法，添加额外的功能。

# 16

题目1：接口的多实现
文字题：解释为什么一个Java接口可以被多个类实现，并讨论这种设计的好处。

编程题：定义一个接口Flyable，包含一个方法fly()。创建两个类Bird和Airplane实现这个接口，并在主方法中创建它们的实例，调用fly()方法。

题目2：多态性的应用
文字题：描述Java中多态性的概念，并给出多态在方法调用中如何工作的示例。

编程题：创建一个基类Animal和一个子类Dog。Animal类有一个方法makeSound()，在Dog类中重写这个方法。创建一个Animal数组，包含Dog对象，并调用makeSound()方法。

题目3：组合/聚合关系
文字题：区分Java中的组合（Composition）和聚合（Aggregation）关系，并讨论它们在对象设计中的使用场景。

编程题：设计一个Car类，其中包含Engine类的实例作为属性（组合关系）。同时设计一个TrafficLight类，其中包含Car类的集合作为属性（聚合关系）。展示这两种关系在代码中的实现。

题目4：UML图与类图
文字题：解释UML类图是什么，以及它如何帮助软件开发者理解和设计系统。

编程题：根据以下描述绘制一个UML类图：一个Library类包含Book类的集合，Book类有一个String类型的title属性和一个printInfo()方法。Library类有一个checkOutBook(Book book)方法。

题目5：接口与抽象类的区别
文字题：讨论Java接口和抽象类的主要区别，并给出使用场景的例子。

编程题：创建一个抽象类Shape，包含一个抽象方法draw()。然后创建一个接口Colorable，包含一个方法setColor(String color)。实现这两个抽象概念的Circle类，它既是一个Shape也是一个Colorable。