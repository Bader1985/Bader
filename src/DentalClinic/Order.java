package DentalClinic;

import java.util.ArrayList;

public class Order {


    int id;
    String date;
    boolean isPaid;
    Person person;
    ArrayList<Work> works;
    private static int idIncrementer;

    public Order(String date, boolean isPaid, Person person, ArrayList<Work> works)
    {
        idIncrementer++;
        this.id = idIncrementer;
        this.date = date;
        this.isPaid = isPaid;
        this.person = person;
        this.works = works;
    }

}
