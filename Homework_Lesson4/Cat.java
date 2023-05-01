package Homework_Lesson4;

public class Cat {

    private String name;
    private int age;
    private String color;
    public int food;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("Cat " + getName() + ", age " + getAge() + ", color " + getColor());
    }

    public Cat(String color) {
        this.color = color;
        System.out.println("Cat " + "color " + getColor());
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("Cat " + getName() + ", color " + getColor());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public void voice() {
        System.out.println(name + " meows: Meow-meow!");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food >= 10) {
            System.out.println(name + " full.");
        } else {
            System.out.println(name + " still hungry.");
        }
        this.food = food;
    }


}
