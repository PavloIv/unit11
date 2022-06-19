package Excersise3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3 {
    public String numbers(String[] ex3) {
        Stream<String> streamNumbers = Arrays.stream(ex3);
        return streamNumbers.flatMap((p) -> Arrays.asList(p.split(", ")).stream()).map(Integer::valueOf)
                .sorted(Integer::compareTo).map(String::valueOf).collect(Collectors.joining(", "));
    }
}
