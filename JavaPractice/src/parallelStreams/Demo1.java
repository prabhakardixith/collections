package parallelStreams;


import java.util.List;
import java.util.stream.Collectors;

class Student
{
    int score;
    String name;

    public Student() {
    }

    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Demo1
{
    public static void main(String[] args)
    {
        List<Student> list = List.of(new Student(90,"p")
                ,new Student(70,"d")
                ,new Student(85,"d")
                ,new Student(80,"d")
        ,new Student(95,"a"));
        //normal Stream sequencial process
        List<Student> collect = list.stream()
                .filter(v -> v.score >= 80)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collect);

        //parallel stream
        List<Student> collect1 = list.parallelStream()
                .filter(v -> v.score >= 80)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collect1);



    }
}
