package Excersise5;

import java.util.Iterator;
import java.util.stream.Stream;

public class Ex5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterFirst = first.iterator();
        Iterator<T> iterSecond = second.iterator();
        Stream<T> result = Stream.empty();
        while (iterFirst.hasNext() && iterSecond.hasNext()) {
            result = Stream.concat(result, Stream.of(iterFirst.next(), iterSecond.next()));
        }
        return result;
    }
}
