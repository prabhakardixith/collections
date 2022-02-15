package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Maps
{
    public static void main(String[] args) {
        List<Integer> e = List.of(12,2,1,21212,1332,21,13);

        List<Integer> collect = e.stream().map(v -> v * 2)
                .map(v -> v / 2)
                .filter(v-> v>10)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
