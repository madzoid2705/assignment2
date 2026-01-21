import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;231312
public class MyApplication {

    public static void main(String[] args) {

        Employee e1 = new Employee("Fred", "Durst", "Vocalist", 67045);
        Employee e2 = new Employee("Sam", "Rivers", "Bass player", 42000);

        Student s1 = new Student("Wes", "Borland", 2.44);
        Student s2 = new Student("John", "Otto", 3.5);

        ArrayList<Person> people = new ArrayList<>();
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.printf(
                    "%s earns %.2f tenge%n",
                    p.toString(),
                    p.getPaymentAmount()
            );
        }
    }
}

