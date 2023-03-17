package DentalClinic;

import java.util.ArrayList;
// يمثل كل ما تحتويه الشركة من أشخاص, فواتير, منتجات, و الدوال التي يمكن استخدامها للتعامل معهم Library الكلاس
public class Company {

    // سنضع فيه كل معلومات الفواتير orders سنضع فيه كل معلومات المنتجات. الكائن products سنضع فيه كل معلومات الأشخاص. الكائن persons الكائن
    ArrayList<Person> persons;
    ArrayList<Work> works;
    ArrayList<Order> orders;
    // orders و products و persons هنا قمنا بتعريف كونستركتور الكلاس و الذي قمنا فيه بإنشاء الكائنات
    public Company()
    {
        persons = new ArrayList();
        works = new ArrayList();
        orders = new ArrayList();
    }

    // products بداخل المصفوفة Product يمكن استخدامها لإضافة كائن من الكلاس addProduct() الدالة
    public void addWork(Work work)
    {
        works.add(work);
    }

    // persons بداخل المصفوفة Person يمكن استخدامها لإضافة كائن من الكلاس addPerson() الدالة
    public void addPerson(Person person)
    {
        persons.add(person);
    }

    // orders بداخل المصفوفة Order يمكن استخدامها لإضافة كائن من الكلاس addOrder() الدالة
    public void addOrder(Order order)
    {
        orders.add(order);
    }

    // الخاص به id بالإعتماد على رقم الـ products موضوع بداخل المصفوفة Product يمكن استخدامها لإلغاء كائن من الكلاس removeProduct() الدالة
    public void removeWork(int id)
    {
        // product و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن products بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Work work: works)
        {
            // الذي مررناه للدالة سيتم حذفه و من ثم الخروج من الدالة id يملك نفس رقم الـ product في حال كان الكائن
            if (work.id == id)
            {
                works.remove(work);
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ products في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Product with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    // الخاص به id بالإعتماد على رقم الـ persons موضوع بداخل المصفوفة Person يمكن استخدامها لإلغاء كائن من الكلاس removePerson() الدالة
    public void removePerson(int id)
    {
        // person و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن persons بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Person person: persons)
        {
            // الذي مررناه للدالة سيتم حذفه و من ثم الخروج من الدالة id يملك نفس رقم الـ person في حال كان الكائن
            if (person.id == id)
            {
                persons.remove(person);
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ persons في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    // الخاص به id بالإعتماد على رقم الـ orders موضوع بداخل المصفوفة Order يمكن استخدامها لإلغاء كائن من الكلاس removeOrder() الدالة
    public void removeOrder(int id)
    {
        // order و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن orders بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Order order: orders)
        {
            // الذي مررناه للدالة سيتم حذفه و من ثم الخروج من الدالة id يملك نفس رقم الـ order في حال كان الكائن
            if (order.id == id)
            {
                orders.remove(order);
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ orders في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Order with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    // الخاص به id بالإعتماد على رقم الـ persons يمكن استخدامها لطباعة كل المعلومات المتوفرة حول شخص موضوع بداخل المصفوفة printPersonInfo() الدالة
    public void printPersonInfo(int id)
    {
        // person و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن persons بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Person person: persons)
        {
            // الذي مررناه للدالة سيتم طباعة كل معلوماته و من ثم الخروج من الدالة id يملك نفس رقم الـ person في حال كان الكائن
            if (person.id == id)
            {
                System.out.println("Person with id " + id + " info.");
                System.out.println("Name: " + person.name);
                System.out.println("Phone: " + person.phone);
                System.out.println("Gender: " + person.gender);

                // ( type-casting سيتم تحديد أن الكائن أصله منه ( أي سنفعل ,Client تم إنشاؤه من الكلاس person إذا كان الكائن
                // Client التي يملكها الشخص فقط في حال كان عبارة عن كائن من الكلاس email حتى نستطيع طباعة الخاصية
                if (person instanceof Client)
                {
                    System.out.println("Email: " + ((Client)person).email);
                }
                // ( type-casting سيتم تحديد أن الكائن أصله منه ( أي سنفعل ,Employee تم إنشاؤه من الكلاس person إذا كان الكائن
                // Employee التي يملكها الشخص فقط في حال كان عبارة عن كائن من الكلاس workingTime و salary حتى نستطيع طباعة الخاصيتين
                else if (person instanceof Employee)
                {
                    System.out.println("Salary: " + ((Employee)person).salary + "$");
                    System.out.println("Working time: " + ((Employee)person).workingTime);
                }

                // بعدها سيتم رسم هذا الخط و من ثم الخروج من الدالة
                System.out.println("----------------------");
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ persons في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    // الخاص به id بالإعتماد على رقم الـ products يمكن استخدامها لطباعة كل المعلومات المتوفرة حول منتج موضوع بداخل المصفوفة printProductDetails() الدالة
    public void printWorkDetails(int id)
    {
        // product و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن products بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Work work: works)
        {
            // الذي مررناه للدالة سيتم طباعة كل معلوماته و من ثم الخروج من الدالة id يملك نفس رقم الـ product في حال كان الكائن
            if (work.id == id)
            {
                System.out.println("Work with id " + id + " details.");
                System.out.println("Name: " + work.name);
                System.out.println("Price: " + work.price + "$");
                System.out.println("----------------------");
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ products في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Work with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    // الخاص بها id بالإعتماد على رقم الـ orders يمكن استخدامها لطباعة كل معلومات فاتورة موضوعة بداخل المصفوفة printProductDetails() الدالة
    public void printOrderDetails(int id)
    {
        // سنستخدمه لحساب ناتج جمع جميع أسعار المنتجات التي نجدها في الفاتورة totalSum المتغير
        float totalSum = 0;

        // order و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن orders بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Order order: orders)
        {
            // الذي مررناه للدالة سيتم طباعة كل معلوماته و من ثم الخروج من الدالة id يملك نفس رقم الـ order في حال كان الكائن
            if (order.id == id)
            {
                System.out.println("Order with id " + id + " details.");
                System.out.println("Date: " + order.date);
                System.out.println("Is paid: " + ((order.isPaid)? "yes": "no"));
                System.out.println("Ordered by: " + order.person.name );
                System.out.println("Works:");

                // order الموضوعة في الكائن products هنا سنمر على جميع الكائنات المخزنة بداخل المصفوفة
                // product كل كائن نمر عليه ( و الذي يمثل منتج ) سنضعه بشكل مؤقته بداخل الكائن
                // totalSum سعر كل منتج يتم إيجاده في هذه المصفوفة سيتم إضافته على قيمة المتغير
                for (Work work: order.works)
                {
                    totalSum += work.price;
                    System.out.println("- " + work.name + ": " + work.price + "$");
                }

                // و الذي يمثل ثمن كل المشتريات الموضوعة في الفاتورة و من ثم الخروج من الدالة totalSum هنا سيتم عرض ناتج الجمع الذي تم تخزينه في المتغير
                System.out.println("Total: " + totalSum + "$");
                System.out.println("----------------------");
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ orders في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Order with id " + id + " is not found!");
        System.out.println("----------------------");
    }

    // الخاص به id بالإعتماد على رقم الـ persons يمكن استخدامها لطباعة كل معلومات الفواتير التابعة لشخص موضوع بداخل المصفوفة printProductDetails() الدالة
    public void printPersonOrders(int id)
    {
        // person و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن persons بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
        for (Person person: persons)
        {
            // الذي مررناه للدالة سيتم طباعة كل فواتيره و من ثم الخروج من الدالة id يملك نفس رقم الـ person في حال كان الكائن
            if (person.id == id)
            {
                System.out.println("All orders made by person with id " + id + ":");

                // order و كل كائن نمر عليه سنضعه بشكل مؤقته بداخل الكائن orders بواسطة هذه الحلقة سنمر على جميع الكائنات المخزنة بداخل المصفوفة
                for (Order order: orders)
                {
                    // ( الذي مررناه للدالة سيتم طباعة معلوماته ( أي معلومات الفاتورة id يملك نفس رقم الـ order الموضوع في الكائن person في حال كان الكائن
                    if (order.person.id == id)
                    {
                        System.out.println("> Order: #" + order.id);
                        System.out.println("  Date: " + order.date);
                        System.out.println("  Is paid: " + ((order.isPaid)? "yes": "no"));
                        System.out.println("  Ordered by: " + order.person.name );
                        System.out.println("  Works:");

                        // سنستخدمه لحساب ناتج جمع جميع أسعار المنتجات التي نجدها في كل فاتورة totalSum المتغير
                        float totalSum = 0;

                        // order الموضوعة في الكائن products هنا سنمر على جميع الكائنات المخزنة بداخل المصفوفة
                        // product كل كائن نمر عليه ( و الذي يمثل منتج ) سنضعه بشكل مؤقته بداخل الكائن
                        // totalSum سعر كل منتج يتم إيجاده في هذه المصفوفة سيتم إضافته على قيمة المتغير
                        for (Work work: order.works)
                        {
                            totalSum += work.price;
                            System.out.println("  - " + work.name + ": " + work.price + "$");
                        }

                        // و الذي يمثل ثمن كل المشتريات الموضوعة في الفاتورة totalSum هنا سيتم عرض ناتج الجمع الذي تم تخزينه في المتغير
                        System.out.println("  Total Price: " + totalSum + "$");
                    }
                }

                // بعدها سيتم رسم هذا الخط و من ثم الخروج من الدالة
                System.out.println("----------------------");
                return;
            }
        }

        // الذي تم تمريره للدالة سيتم طباعة الجملة التالية id يملك نفس رقم الـ persons في حال لم يتم إيجاد أي كائن في المصفوفة
        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }

}

