package stream.sorted;

import java.util.Arrays;
import java.util.List;


//findAny
public class Find
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one","two","three","four");

        //findAny
        String findAny = list.stream()
                .findAny()
                .get();
        System.out.println(findAny);

        //findFirst

        System.out.println( list.stream()
                .findFirst().get());

    }
}
