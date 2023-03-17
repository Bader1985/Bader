package DentalClinic;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {


        Client person1 = new Client("Иван", "+3806357644", "M", "ivan@example.com");
        Client person2 = new Client("Андрей","+491511456374","M","andrey@example.com");
        Employee person3 = new Employee("Dr.Bader", "+491711548675", "Male", 3000f, "9:00 AM to 12:00 PM _14:00 to 17:00");


        Work work1 = new Work("Scaler", 100f);
        Work work2 = new Work("Pulpit", 120f);
        Work work3 = new Work("Removal of a tooth", 70f);
        Work work4 = new Work("Crown", 1000f);
        Work work5 = new Work("Fillings", 50f);
        Work work6 = new Work("Implant", 2000f);


        ArrayList<Work> order1Works = new ArrayList();
        order1Works.add(work1);
        order1Works.add(work2);
        order1Works.add(work3);


        ArrayList<Work> order2Works = new ArrayList();
        order2Works.add(work4);


        ArrayList<Work> order3Works = new ArrayList();
        order3Works.add(work5);
        order3Works.add(work6);


        Order order1 = new Order("2023-1-1", true, person1, order1Works);
        Order order2 = new Order("2023-2-7", true, person1, order2Works);
        Order order3 = new Order("2023-5-4", false, person2, order3Works);


        Company company = new Company();


        company.addPerson(person1);
        company.addPerson(person2);
        company.addPerson(person3);


        company.addWork(work1);
        company.addWork(work2);
        company.addWork(work3);
        company.addWork(work4);
        company.addWork(work5);
        company.addWork(work6);


        company.addOrder(order1);
        company.addOrder(order2);
        company.addOrder(order3);


        company.printPersonInfo(1);
        company.printPersonInfo(2);
        company.printPersonInfo(3);


        company.printWorkDetails(1);
        company.printWorkDetails(2);
        company.printWorkDetails(3);
        company.printWorkDetails(4);
        company.printWorkDetails(5);
        company.printWorkDetails(6);


        company.printPersonOrders(1);
        company.printPersonOrders(2);


        company.removeOrder(1);
        company.printOrderDetails(1);
        company.printPersonOrders(1);

        company.removeOrder(2);
        company.printOrderDetails(2);
        company.printPersonOrders(2);

    }

}

