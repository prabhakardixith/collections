package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentComparable
{
    public static void main(String[] args) {
        List<Student> students
                = new ArrayList<>();
        students.add(new Student(3,"prabhakar"));
        students.add(new Student(1,"uday"));
        students.add(new Student(2,"girish"));

        Collections.sort(students);
        System.out.println(students);
    }
}
