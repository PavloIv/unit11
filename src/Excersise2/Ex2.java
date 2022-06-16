package Excersise2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {
    public List<String> upperCaseSorted(ArrayList<String> persons) {
        Stream<String> upCaseSorted = persons.stream();
        return upCaseSorted.sorted(((o1, o2) -> o2.compareTo(o1))).
                map(String::toUpperCase).
                collect(Collectors.toList());
    }
}
