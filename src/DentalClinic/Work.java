package DentalClinic;

public class Work {

    int id;
    String name;
    float price;

    private static int idIncrementer;

    public Work(String name, float price)
    {
        idIncrementer++;
        this.id = idIncrementer;
        this.name = name;
        this.price = price;
    }

}
