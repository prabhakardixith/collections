package stream.flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class FlatM2
{
    public static void main(String[] args) {
        List<String> team1 = List.of("prabhakar","diwakar");
        List<String> team2= List.of("uday","kiran");
        List<String> team3 = List.of("ravi","satya");

        List<List<String>> all = List.of(team1,team2,team3);

        //without stream
        System.out.println("without using Stream : ");
        for (List<String> team:all) {
            for (String name:team) {
                System.out.println(name);
            }
        }

        //with stream
        System.out.println("using Stream : ");
        List<String> collect = all.stream().flatMap(v -> v.stream())
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
