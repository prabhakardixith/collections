package stream.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//concat
public class Concat
{
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(3,4,5);

        Stream<Integer> stream1 = list1.stream();
        Stream<Integer> stream2 = list2.stream();
        List<Integer> collect = Stream.concat(stream1, stream2).collect(Collectors.toList());

        System.out.println(collect);
    }
}
