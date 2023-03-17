package DentalClinic;

public abstract class Person {

    int id;
    String name;
    String phone;
    String gender;

    private static int idIncrementer = 0;

    public Person(String name, String phone, String gender)
    {
        idIncrementer++;
        this.id = idIncrementer;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }

}
