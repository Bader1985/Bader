package DentalClinic;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        // أي كأننا قمنا بإنشاء شخصين Person هنا قمنا بإنشاء كائنين من كلاسات ترث من الكلاس
        // و بالتالي فإنه يمثل شخص يعتبر زبون Client عبارة عن كائن من الكلاس person1
        // و بالتالي فإنه يمثل شخص يعتبر موظف Employee عبارة عن كائن من الكلاس person2
        Client person1 = new Client("Иван", "+3806357644", "M", "ivan@example.com");
        Client person2 = new Client("Андрей","+491511456374","M","andrey@example.com");
        Employee person3 = new Employee("Dr.Bader", "+491711548675", "Male", 3000f, "9:00 AM to 12:00 PM _14:00 to 17:00");

        // و التي تمثل 6 منتجات Product هنا قمنا بتعريف 6 كائنات من الكلاس
        Work work1 = new Work("Scaler", 100f);
        Work work2 = new Work("Pulpit", 120f);
        Work work3 = new Work("Removal of a tooth", 70f);
        Work work4 = new Work("Crown", 1000f);
        Work work5 = new Work("Fillings", 50f);
        Work work6 = new Work("Implant", 2000f);

        // product3 و product2 و product1 وضعنا فيه الكائنات Arrayهنا قمنا بتعريف كائن من الكلاس
        // و الذي سننئه بعد قليل order1 لأننا ننوي وضعها في مصفوفة المنتجات التي تم شراءها في الفاتورة التي يمثلها الكائن
        ArrayList<Work> order1Works = new ArrayList();
        order1Works.add(work1);
        order1Works.add(work2);
        order1Works.add(work3);

        // product4 وضعنا فيه الكائن Arrayهنا قمنا بتعريف كائن من الكلاس
        // و الذي سننئه بعد قليل order2 لأننا ننوي وضعها في مصفوفة المنتجات التي تم شراءها في الفاتورة التي يمثلها الكائن
        ArrayList<Work> order2Works = new ArrayList();
        order2Works.add(work4);

        // product5 و product6 وضعنا فيه الكائنات Arrayهنا قمنا بتعريف كائن من الكلاس
        // و الذي سننئه بعد قليل order3 لأننا ننوي وضعها في مصفوفة المنتجات التي تم شراءها في الفاتورة التي يمثلها الكائن
        ArrayList<Work> order3Works = new ArrayList();
        order3Works.add(work5);
        order3Works.add(work6);

        // و التي تمثل فواتير Order هنا قمنا بتعريف 3 كائنات من الكلاس
        // person1 وضعناهما لنفس الشخص الذي يمثله الكائن order2 و order1 لاحظ أن الفاتورتين
        Order order1 = new Order("2023-1-1", true, person1, order1Works);
        Order order2 = new Order("2023-2-7", true, person1, order2Works);
        Order order3 = new Order("2023-5-4", false, person2, order3Works);

        // لأننا نريد تخزين الأشخاص و المنتجات و الفواتير بشكل مرتب بداخله Company هنا قمنا بإنشاء كائن من الكلاس
        Company company = new Company();

        // addPerson() بواسطة الدالة company التي يمكلها الكائن persons هنا قمنا بإضافة الشخصين في المصفوفة
        company.addPerson(person1);
        company.addPerson(person2);
        company.addPerson(person3);

        // addProduct() بواسطة الدالة company التي يمكلها الكائن products هنا قمنا بإضافة المنتجات في المصفوفة
        company.addWork(work1);
        company.addWork(work2);
        company.addWork(work3);
        company.addWork(work4);
        company.addWork(work5);
        company.addWork(work6);

        // addOrder() بواسطة الدالة company التي يمكلها الكائن orders هنا قمنا بإضافة الفواتير في المصفوفة
        company.addOrder(order1);
        company.addOrder(order2);
        company.addOrder(order3);

        // printPersonInfo() الخاص بهم و بواسطة الدالة id هنا قمنا بطباعة معلومات كلا الشخصين بالإعتماد على رقم التعرفة
        // تذكر: رقم التعرفة الخاص بكل شخص تم إنشاؤه بشكل تلقائي عند إنشاء كل شخص بداخل الكونستركتور
        company.printPersonInfo(1);
        company.printPersonInfo(2);
        company.printPersonInfo(3);

        // printProductDetails() الخاص بهم و بواسطة الدالة id هنا قمنا بطباعة معلومات كل المنتجات بالإعتماد على رقم التعرفة
        // تذكر: رقم التعرفة الخاص بكل منتج تم إنشاؤه بشكل تلقائي عند إنشاء كل منتج بداخل الكونستركتور
        company.printWorkDetails(1);
        company.printWorkDetails(2);
        company.printWorkDetails(3);
        company.printWorkDetails(4);
        company.printWorkDetails(5);
        company.printWorkDetails(6);

        // printPersonOrders() الخاص بهم و بواسطة الدالة id هنا قمنا بطباعة الفواتير التي يملكها كل شخص بالإعتماد على رقم التعرفة
        company.printPersonOrders(1);
        company.printPersonOrders(2);

        // removeOrder() هنا قمنا الفاتورة التي تملك رقم التعرفة 1 بواسطة الدالة
        // printOrderDetails() بعدها حاولنا طباعة معلومات الفاتورة التي قمنا بحذفها بواسطة الدالة
        // بعدها قمنا بطباعة جمبع الفواتير التي يمكلها الشخص الذي يملك رقم التعرفة 1 و الذي كان يملك الفاتورة التي تم حذفها
        // لاحظ أن الفاتورة المحذوفة أيضاَ لم تظر ضمن فواتيره
        company.removeOrder(1);
        company.printOrderDetails(1);
        company.printPersonOrders(1);

        company.removeOrder(2);
        company.printOrderDetails(2);
        company.printPersonOrders(2);

    }

}

