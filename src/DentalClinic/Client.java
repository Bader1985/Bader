package DentalClinic;

public class Client extends Person {

    // هنا قمنا بتعريف الخاصية الإضافية التي سيملكها الزبون
    // id, name, phone, gender, email :أصبح يملك الخصائص التالية Client إذاً الكلاس
    String email;

    // هنا قمنا بتعريف كونستركتور للكلاس حتى نستطيع إسناد قيم للخصائص بشكل مباشر بواسطته
    // super() عن طريق الدالة Person سيتم إسناد قيم لها من خلال كونستركتور الكلاس name, phone, gender الخصائص
    // id سيتولى أمر توليد قيمة للمتغير Person أيضاَ, لا تنسى أن كونستركتور الكلاس
    public Client(String name, String phone, String gender, String email)
    {
        super(name, phone, gender);
        this.email = email;
    }

}
