package methodReference;

import Collection.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class User
{
    int id;
    String name;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Demo1
{
    public static void main(String[] args)
    {
        List<User> students
                = List.of(
                new User(1,"java"),new User(2,"python")
                ,new User(3,"java")
                ,new User(4,"c")
                ,new User(5,"c++"));
        Map<String, List<User>> collect = students
//                .stream().collect(Collectors.groupingBy(User::getName)); using method reference
                .stream().collect(Collectors.groupingBy(u-> u.getName()));

        collect.entrySet().stream()
                .forEach(System.out::println);

        //java
        List<Map.Entry<String, List<User>>> java = collect.entrySet().stream()
                .filter(v -> v.getKey().equals("java"))
                .collect(toList());
        System.out.println(java);


    }
}
