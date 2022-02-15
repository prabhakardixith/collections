package VenkatSubramaniamCollectorsAndStream;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Filtering
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
        //nameGreaterThanAge
        List<String> nameGreaterThan4 = getAll()
                .stream().filter(user -> user.getName().length() > 4)
                .map(u-> u.getName())
                .collect(toList());

        System.out.println(nameGreaterThan4 );
        System.out.println(getAll().stream()
                .collect(groupingBy(User::getAge,
                        mapping(User::getName,
                                filtering(name-> name.length()>4, toList())))));

    }
}
