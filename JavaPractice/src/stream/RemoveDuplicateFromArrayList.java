package stream;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayList
{
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("p");
        names.add("r");
        names.add("a");
        names.add("p");

//        Object p = names.stream().filter(n -> n.equals("p"))
//                .map(nm -> names.remove(names.indexOf(nm)))
//                .collect(Collectors.toList());
//
//        System.out.println(p);

        names.removeIf(v-> v.equals("p"));

        System.out.println(names);

        Object[] objects = names.toArray();
        System.out.println(Arrays.toString(objects));

    }
}
