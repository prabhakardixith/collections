package VenkatSubramaniamCollectorsAndStream;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Sample
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

        System.out.println("display all : ");
        getAll()
                .stream()
                .map(User::toString)
                .forEach(System.out::println);

        System.out.println("sum of allAge : ");
        System.out.println( getAll()
               .stream()
               .map(m->m.getAge())
               .reduce((sum,age)-> sum+=age).get());

//        System.out.println("toUpperCase : ");
//        getAll().
//               stream()
//               .filter(v-> v.getAge()>20)
//               .map(m->m.getName().toUpperCase())
//               .forEach(System.out::println);

        System.out.println("using collector to UpperCase: ");
        List<String> collector = getAll()
                .stream()
                .filter(v -> v.getAge() > 20)
                .map(User::getName)
                .map(String::toUpperCase)
                .collect(toList());
        System.out.println(collector);


    }
}
