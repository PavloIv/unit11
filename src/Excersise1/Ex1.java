package Excersise1;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {
    public String oddNumbers(ArrayList<String> persons ) {
        String oddNumbers = IntStream
                .range(0, persons.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + "." + persons.get(i))
                .collect(Collectors.joining(" "));

        return oddNumbers;
    }
}
