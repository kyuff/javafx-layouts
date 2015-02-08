package dk.kyuff.layouts.apps.search;

public class Person {

    private int age;
    private String name;
    private String color;
    private String dolls;

    public Person(int age, String name, String color, String dolls) {
        setAge(age);
        setName(name);
        setColor(color);
        setDolls(dolls);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDolls() {
        return dolls;
    }

    public void setDolls(String dolls) {
        this.dolls = dolls;
    }
}
