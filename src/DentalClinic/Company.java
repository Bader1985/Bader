package DentalClinic;

import java.util.ArrayList;

public class Company {

    ArrayList<Person> persons;
    ArrayList<Work> works;
    ArrayList<Order> orders;

    public Company()
    {
        persons = new ArrayList();
        works = new ArrayList();
        orders = new ArrayList();
    }
    public void addWork(Work work)
    {
        works.add(work);
    }
    public void addPerson(Person person)
    {
        persons.add(person);
    }
    public void addOrder(Order order)
    {
        orders.add(order);
    }
    public void removeWork(int id)
    {

        for (Work work: works)
        {

            if (work.id == id)
            {
                works.remove(work);
                return;
            }
        }
        System.out.println("Product with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    public void removePerson(int id)
    {

        for (Person person: persons)
        {

            if (person.id == id)
            {
                persons.remove(person);
                return;
            }
        }

        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    public void removeOrder(int id)
    {

        for (Order order: orders)
        {

            if (order.id == id)
            {
                orders.remove(order);
                return;
            }
        }

        System.out.println("Order with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    public void printPersonInfo(int id)
    {

        for (Person person: persons)
        {

            if (person.id == id)
            {
                System.out.println("Person with id " + id + " info.");
                System.out.println("Name: " + person.name);
                System.out.println("Phone: " + person.phone);
                System.out.println("Gender: " + person.gender);


                if (person instanceof Client)
                {
                    System.out.println("Email: " + ((Client)person).email);
                }

                else if (person instanceof Employee)
                {
                    System.out.println("Salary: " + ((Employee)person).salary + "$");
                    System.out.println("Working time: " + ((Employee)person).workingTime);
                }

                System.out.println("----------------------");
                return;
            }
        }


        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    public void printWorkDetails(int id)
    {

        for (Work work: works)
        {

            if (work.id == id)
            {
                System.out.println("Work with id " + id + " details.");
                System.out.println("Name: " + work.name);
                System.out.println("Price: " + work.price + "$");
                System.out.println("----------------------");
                return;
            }
        }

        System.out.println("Work with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    public void printOrderDetails(int id)
    {

        float totalSum = 0;


        for (Order order: orders)
        {

            if (order.id == id)
            {
                System.out.println("Order with id " + id + " details.");
                System.out.println("Date: " + order.date);
                System.out.println("Is paid: " + ((order.isPaid)? "yes": "no"));
                System.out.println("Ordered by: " + order.person.name );
                System.out.println("Works:");


                for (Work work: order.works)
                {
                    totalSum += work.price;
                    System.out.println("- " + work.name + ": " + work.price + "$");
                }


                System.out.println("Total: " + totalSum + "$");
                System.out.println("----------------------");
                return;
            }
        }


        System.out.println("Order with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    public void printPersonOrders(int id)
    {

        for (Person person: persons)
        {

            if (person.id == id)
            {
                System.out.println("All orders made by person with id " + id + ":");


                for (Order order: orders)
                {

                    if (order.person.id == id)
                    {
                        System.out.println("> Order: #" + order.id);
                        System.out.println("  Date: " + order.date);
                        System.out.println("  Is paid: " + ((order.isPaid)? "yes": "no"));
                        System.out.println("  Ordered by: " + order.person.name );
                        System.out.println("  Works:");


                        float totalSum = 0;


                        for (Work work: order.works)
                        {
                            totalSum += work.price;
                            System.out.println("  - " + work.name + ": " + work.price + "$");
                        }


                        System.out.println("  Total Price: " + totalSum + "$");
                    }
                }


                System.out.println("----------------------");
                return;
            }
        }

        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }

}

