package stream.flatmap;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMaps
{
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2);
        List<Integer> list2= List.of(3,4);
        List<Integer> list3 = List.of(5,6);

        List<List<Integer>> all = List.of(list1,list2,list3);

        //flatMap to process complex data makes each object to steam
        List<Integer> collect = all.stream().flatMap(v -> v.stream().map(m-> m+m)).collect(Collectors.toList());
        System.out.println(collect);




    }
}
