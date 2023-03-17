package DentalClinic;

public class Employee extends Person {


    float salary;
    String workingTime;

    public Employee(String name, String phone, String gender, float salary, String workingTime)
    {
        super(name, phone, gender);
        this.salary = salary;
        this.workingTime = workingTime;
    }

}
