package VenkatSubramaniamCollectorsAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingCollect
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
      //  List<String> listOfString = Arrays.asList("prabhakar","diwakar","prabhakar","uday","uday");


        //counting()
        Map<String, Long> countByName = getAll()
                .stream()
                .collect(Collectors.groupingBy(User::getName, Collectors.counting()));
        System.out.println(countByName);
    }
}
