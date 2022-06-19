import Excersise1.Ex1;
import Excersise2.Ex2;
import Excersise3.Ex3;
import Excersise4.Ex4;
import Excersise5.Ex5;

import java.util.ArrayList;
import java.util.stream.Collectors;
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

        Ex3 test3 = new Ex3();
        String[] ex3 = {"1, 2, 0", "4, 5", "3, 8, 6, 7", "14, 21, 15, 73, 36"};
        System.out.println(test3.numbers(ex3));

        Ex4 test4 = new Ex4();
        Stream<Long> randomizer = test4.infiniteStream(3L, 25214903917L, 14L, (long) Math.pow(2, 48));
        randomizer.limit(10).forEach(x -> System.out.println(x + " "));

        Ex5 test5 = new Ex5();
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 12, 14);
        Stream<Integer> secondStream = Stream.of(4, 5, 6, 18, 16, 31, 30, 27);
        System.out.println("test5.zip(firstStream,secondStream) = " + test5.zip(firstStream, secondStream).collect(Collectors.toList()));

    }
}
