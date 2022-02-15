package VenkatSubramaniamCollectorsAndStream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partioning
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
        //without using partioning
        //even
        List<User> even = getAll()
                .stream()
                .filter(v -> v.getAge() % 2 == 0)
                .collect(Collectors.toList());

        //odd
        List<User> odd = getAll()
                .stream()
                .filter(v -> v.getAge() % 2 != 0)
                .collect(Collectors.toList());

        //using partioning
        System.out.println("using partition by : ");
        Map<Boolean, List<User>> partinion = getAll()
                .stream()
                .collect(Collectors.partitioningBy(user -> user.getAge() % 2 == 0));
        System.out.println(partinion);


    }
}
