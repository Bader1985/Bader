package DentalClinic;

import java.util.ArrayList;
// الذي وضعنا فيه المعلومات الأساسية التي يجب أن تمكلها أي فاتورة Order هنا قمنا بتعريف الكلاس
public class Order {

    // هنا قمنا بتعريف الخصائص الأساسية التي يجب أن تملكها أي فاتورة
    int id;
    String date;
    boolean isPaid;
    Person person;
    ArrayList<Work> works;

    // لأننا بنفس الوقت نريده أن يكون موحداً private و static قمنا بتعريفه كـ idIncrementer المتغير
    // لجميع الكائنات التي ننشئها من هذا الكلاس و لا يمكن التعامل معه بشكل مباشر من أي كلاس آخر
    private static int idIncrementer;
    // هنا قمنا بتعريف كونستركتور للكلاس حتى نستطيع إسناد قيم للكائن الذي ننشئه من هذا الكلاس بشكل مباشر
    // id تزيد 1 في كل مرة و من ثم يتم وضعها في الخاصية idIncrementer لاحظ أننا قمنا بتحديد أن قيمة
    // الخاصة بالكائن. القيم الأخرى التي سيتم تمريرها للكائن سيتم تخزينها بشكل مباشر في خصائص الكائن
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
