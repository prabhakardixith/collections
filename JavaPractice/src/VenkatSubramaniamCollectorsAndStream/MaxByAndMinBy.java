package VenkatSubramaniamCollectorsAndStream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator.*;

//import static java.util.Comparator.comparing;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class MaxByAndMinBy
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
        
        //while dealing with Integer
        //sum
        System.out.println(getAll()
                .stream()
                .mapToInt(User::getAge)
                        .sum());
//                .reduce(0, Integer::sum);
        //max
        System.out.println(getAll()
                .stream()
                .mapToInt(User::getAge)
                .max());
        //min
        System.out.println(getAll()
                 .stream()
                .mapToInt(User::getAge)
                .min().getAsInt());
        
        //while dealing objects && maxBy
        Optional<User> maxBy = getAll()
                .stream()
                 .collect(maxBy(comparing(User::getAge)));
        System.out.println(maxBy);

        //while dealing objects && minBy
        Optional<User> minBy = getAll()
                .stream()
                .collect(minBy(comparing(User::getAge)));
        System.out.println(minBy);
    }
}
