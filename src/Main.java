 import Excersise1.Ex1;
 import Excersise2.Ex2;

 import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<>();
        persons.add("Anastasia");
        persons.add("Andriy");
        persons.add("Bohdan");
        persons.add("Artem");
        persons.add("Viktor");
        persons.add("Hlib");
        persons.add("Dmytro");
        persons.add("Hryhoriy");
        persons.add("Zahar");
        persons.add("Pavlo");
        persons.add("Petro");
        persons.add("Zenyk");
        persons.add("Stepan");
        persons.add("Krystyna");

        Ex1 test = new Ex1();
        System.out.println(test.oddNumbers(persons));

        Ex2 test2 = new Ex2();
        System.out.println(test2.upperCaseSorted(persons));

    }
}
