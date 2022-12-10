package lesson_7.homework;

public class Dog extends Animal{
    public static int countDog = 0;
    public static String typeThisClass = "Пес";

    Dog(String name, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countDog;
    }

    @Override
    protected void info() {
        System.out.println("Dog");
    }
}
