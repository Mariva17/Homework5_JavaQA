package Homework_Lesson4;

public class NewCat extends Cat {

    public NewCat(String name, int age, String color) {
        super(name, age, color);
    }

    public NewCat(String color) {
        super(color);
    }

    public NewCat(String name, String color) {
        super(name, color);
    }

    public static void main(String[] args) {

        NewCat boss = new NewCat("Boss", 6, "white");

        NewCat boss2 = new NewCat("red");

        NewCat boss3 = new NewCat("Jenny", "black");

        boss.voice();
        boss2.setFood(12);
        boss3.voice();
        boss3.setFood(7);
    }
}
