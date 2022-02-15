package VenkatSubramaniamCollectorsAndStream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Collect
{
    public static List<User> getAll()
    {
        return List.of(
                new User(24,"shiva"),new User(22,"uday")
                ,new User(18,"ravi")
                ,new User(25,"prabhakar")
                ,new User(19,"suhel"));
    }
    public static void main(String[] args)
    {

        //find duplicate
        List<String> list = List.of("a","a","b","c","b");

        Map<String, Long> collect = list.stream()
                .collect(groupingBy(String::toString, counting()));

        System.out.println(collect);
        //add comma using joining() in collectors
        String value = getAll()
                .stream()
                .filter(v -> v.getAge() > 20)
                .map(User::getName)
                .map(String::toUpperCase)
                .collect(joining(","));
        System.out.println(value);


        //Map name as key and age as value
        Map<Integer, String> modifiable = getAll()
                .stream()
                .collect(toMap(User::getAge
                        , User::getName));
        System.out.println(modifiable);


        List<String> unMuruable = getAll()
                .stream()
                .filter(v -> v.getAge() > 20)
                .map(User::getName)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(unMuruable);

    }
}
