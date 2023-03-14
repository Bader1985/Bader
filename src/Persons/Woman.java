package Persons;

public class Woman extends Person {
    public Woman(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Женщина по имени " + super.toString().substring(15);
    }

    @Override
    public void greeting() {
        System.out.println("Я родилась!");
    }
}
