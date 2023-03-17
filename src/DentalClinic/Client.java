package DentalClinic;

public class Client extends Person {
    String email;
    public Client(String name, String phone, String gender, String email)
    {
        super(name, phone, gender);
        this.email = email;
    }

}
