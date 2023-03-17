package DentalClinic;

public class Employee extends Person {

    // هنا قمنا بتعريف الخاصية الإضافية التي سيملكها الموظف
    // id, name, phone, gender, salary, workingTime :أصبح يملك الخصائص التالية Employee إذاً الكلاس
    float salary;
    String workingTime;
    // هنا قمنا بتعريف كونستركتور للكلاس حتى نستطيع إسناد قيم للخصائص بشكل مباشر بواسطته
    // super() عن طريق الدالة Person سيتم إسناد قيم لها من خلال كونستركتور الكلاس name, phone, gender الخصائص
    // id سيتولى أمر توليد قيمة للمتغير Person أيضاَ, لا تنسى أن كونستركتور الكلاس
    public Employee(String name, String phone, String gender, float salary, String workingTime)
    {
        super(name, phone, gender);
        this.salary = salary;
        this.workingTime = workingTime;
    }

}
