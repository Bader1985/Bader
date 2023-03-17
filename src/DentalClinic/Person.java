package DentalClinic;

public abstract class Person {

    // هنا قمنا بتعريف الخصائص الأساسية التي يجب أن يملكها أي شخص
    int id;
    String name;
    String phone;
    String gender;

    // لأننا بنفس الوقت نريده أن يكون موحداً لجميع private و static قمنا بتعريفه كـ idIncrementer المتغير
    // الكائنات التي ننشئها من الكلاسات التي ترث من هذا الكلاس و لا يمكن التعامل معه بشكل مباشر من أي كلاس آخر
    private static int idIncrementer = 0;
    // هنا قمنا بتعريف كونستركتور للكلاس حتى نستطيع إسناد قيم للخصائص بشكل مباشر من أي كلاس يرث هذا الكونستركتور
    // id تزيد 1 في كل مرة نستدعي فيها هذا الكونستركتور و من ثم يتم وضعها في الخاصية idIncrementer لاحظ أيضاً أننا قمنا بتحديد أن قيمة
    // الخاصة بالكائن الذي سيملكها. القيم الأخرى التي سيتم تمريرها للكائن سيتم تخزينها بشكل مباشر في خصائص الكائن
    // و لكننا نستطيع إستدعاؤه من الكلاسات التي ترثه Main إنتبه: هذا الكونستركتور لا نستطيع إستدعاؤه بشكل مباشر من الكلاس
    public Person(String name, String phone, String gender)
    {
        idIncrementer++;
        this.id = idIncrementer;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }

}
