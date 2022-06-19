package Excersise1;
import java.util.ArrayList;
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
