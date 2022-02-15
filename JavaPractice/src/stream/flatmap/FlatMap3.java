package stream.flatmap;

import java.util.List;
import java.util.stream.Collectors;

class Student
{
    int id;
    String name;
    char grade;

    public Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Student() {
    }
}
public class FlatMap3
{
    public static void main(String[] args)
    {
        List<Student> student1 = List.of(new Student(101,"prabhakar",'A')
                ,new Student(102,"uday",'B')
                ,new Student(103,"suhel",'C'));

        List<Student> student2 = List.of(new Student(104,"sikkha",'A')
                ,new Student(105,"ravi",'B')
                ,new Student(106,"ailesh",'C'));

        List<List<Student>> studentList = List.of(student1,student2);

        List<String> allStudentNames = studentList.stream().flatMap(n -> n.stream().map(m -> m.name))
                .collect(Collectors.toList());

        System.out.println("allStudents names : ");
        allStudentNames.forEach(System.out::println);

        System.out.println("allStudents Id");
        List<Integer> allStudentIds = studentList.stream().flatMap(sList -> sList.stream().map(s -> s.id))
                .collect(Collectors.toList());

        allStudentIds.forEach(System.out::println);

    }
}
