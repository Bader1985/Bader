package Persons;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Человек по имени " + name;
    }

    public void greeting() {
        System.out.println("Я родился!");
    }
}
