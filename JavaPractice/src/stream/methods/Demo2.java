package stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println("list of records  : "+list);

        //count() terminal
        long count = list.stream().filter(v -> v%2 == 0).count();
        System.out.println("count : "+count);

        //min() terminal
        Integer min = list.stream().min((v1, v2) -> v1.compareTo(v2)).get();
        System.out.println("min : "+min);

        //max() terminal
        Integer max = list.stream().max((v1, v2) -> v1.compareTo(v2)).get();
        System.out.println("max : "+max);


    }
}
