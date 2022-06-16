package Excersise3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3 {
    public String numbers(String[] ex3) {
        Stream<String> streamNumbers = Arrays.stream(ex3);
        return streamNumbers.flatMap((p) -> Arrays.asList(p.split(", ")).stream())
                .sorted().collect(Collectors.toList()).toString();
    }
}
