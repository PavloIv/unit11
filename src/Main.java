import Excersise1.Ex1;
import Excersise2.Ex2;
import Excersise3.Ex3;

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

//        Ex1 test = new Ex1();
//        System.out.println(test.oddNumbers(persons));
//
//        Ex2 test2 = new Ex2();
//        System.out.println(test2.upperCaseSorted(persons));

        Ex3 test3 = new Ex3();
//        String[] ex3 = {"1, 2, 0", "4, 5", "3, 8, 6, 7"};
        String[] ex3 = {"1, 2, 0", "4, 5"};
        System.out.println(test3.numbers(ex3));

    }
}
