package stream.sorted;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//anyMatch
//allMatch
//noneMatch
public class Matches
{
    public static void main(String[] args) {
        Set<String> fruites = new HashSet<>();
        fruites.add("one mango");
        fruites.add("banana");
        fruites.add("orange");
        fruites.add("two mango");
        fruites.add("two orange");

        String name="adas";
        //anyMatch()
        boolean anyMatch = fruites.stream()
                .anyMatch(v -> v.startsWith("one"));
        System.out.println(anyMatch);

        //allMatch()
        boolean allMatch = fruites.stream()
                .allMatch(v -> v.startsWith("one"));
        System.out.println(allMatch);

        //noneMatch()
        boolean noneMatch = fruites.stream()
                .noneMatch(v -> v.startsWith("one"));
        System.out.println(noneMatch);

    }
}
