package Collection;

import VenkatSubramaniamCollectorsAndStream.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Students
{
    int id;
    String name;

    public Students() {
    }

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Maps
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
        List<User> collect = getAll().stream()
                .collect(Collectors.toMap(User::getAge, User::getName))
                .entrySet().stream()
                .map((k) -> new User(k.getKey(), k.getValue()))
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
