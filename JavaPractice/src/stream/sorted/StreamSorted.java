package stream.sorted;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamSorted
{
    public static void main(String[] args) {
        List list = Arrays.asList(2,1,3,5,4,6);
        //
        System.out.println("asc");
        list.stream()
                .sorted().forEach(System.out::println);

        System.out.println("rever order()");

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
