package stream.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonTerminalM
{

    //count(),forEach() terminal methds
    //distinct(),limit() processing methods
    public static void distinct(List list)
    {
        //distinct
        System.out.println("using distinct");
        list.stream().distinct()
                .forEach(v-> {
                    System.out.print(v+" ");
                });
        System.out.println();
        //count
        System.out.println("using Count");
        long count = list.stream().distinct()
                .count();
        System.out.println("Count : "+count);

        //limit
        System.out.println("using Limit");
       list.stream().limit(2)
               .distinct().forEach(System.out::println);


    }
    public static void main(String[] args)
    {
        List<Integer> list = //                List.of(2,4,4,5,5,6,8,10,2,2,2);
                new ArrayList<>();
        list.add(2); list.add(4);  list.add(2);  list.add(6);  list.add(8);
        System.out.println("list of objects : "+list);
        distinct(list);








//        List<Integer> collect = list.stream().distinct()
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(collect);
//
//
//        List<Integer> collect1 = list.stream()
//                .distinct()
//                .limit(2)
//                .map(m-> m*2)
//                .toList();
//
//        System.out.println(collect1);
    }
}
