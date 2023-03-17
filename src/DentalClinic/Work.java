package DentalClinic;

public class Work {

    // هنا قمنا بتعريف الخاصية الإضافية التي سيملكها المنتج
    int id;
    String name;
    float price;

    // لأننا بنفس الوقت نريده أن يكون موحداً private و static قمنا بتعريفه كـ idIncrementer المتغير
    // لجميع الكائنات التي ننشئها من هذا الكلاس و لا يمكن التعامل معه بشكل مباشر من أي كلاس آخر
    private static int idIncrementer;
    // هنا قمنا بتعريف كونستركتور للكلاس حتى نستطيع إسناد قيم للكائن الذي ننشئه من هذا الكلاس بشكل مباشر
    // id تزيد 1 في كل مرة و من ثم يتم وضعها في الخاصية idIncrementer لاحظ أننا قمنا بتحديد أن قيمة
    // الخاصة بالكائن. القيم الأخرى التي سيتم تمريرها للكائن سيتم تخزينها بشكل مباشر في خصائص الكائن
    public Work(String name, float price)
    {
        idIncrementer++;
        this.id = idIncrementer;
        this.name = name;
        this.price = price;
    }

}
