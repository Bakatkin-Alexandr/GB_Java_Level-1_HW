package lesson_7.homework;

public class Cat extends Animal{
    public static int countCat = 0;
    public static String typeThisClass = "Кот";

    Cat(String name, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_NONE;
    }

    @Override
    protected void info() {
        System.out.println("Cat");
    }
}
