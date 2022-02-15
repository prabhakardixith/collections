package VenkatSubramaniamCollectorsAndStream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupBy
{
    public static List<User> getAll()
    {
        return List.of(
                new User(24,"shiva"),new User(22,"uday")
                ,new User(18,"ravi")
                ,new User(25,"prabhakar")
                ,new User(19,"suhel"));
    }
    public static void main(String[] args) {
        //group by name
        Map<String, List<User>> collect = getAll()
                .stream()
                .collect(groupingBy(User::getName));

        System.out.println(collect);

        //list of ageByName
        Map<String, List<Integer>> ageByName = getAll()
                .stream()
                .collect(groupingBy(User::getName, mapping(User::getAge, toList())));
        System.out.println(ageByName);

    }
}
