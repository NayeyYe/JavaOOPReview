package QuesEight.ProgramTwo;

public class Dog extends Animal{
    private String breed;

    // Dog的构造器
    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
        System.out.println("Dog created");
    }

    // 获取breed
    public String getBreed() {
        return breed;
    }
}
