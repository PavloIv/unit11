package Excersise1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Ex1 {
    public String oddNumbers(ArrayList<String> persons) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < persons.toArray().length; i++) {
            buffer.append(i + 1).append(".").append(persons.toArray()[i]).append(" ");
            i++;
        }
        return buffer.toString();
    }

}
