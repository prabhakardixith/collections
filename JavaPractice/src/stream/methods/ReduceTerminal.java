package stream.methods;

import java.util.Arrays;
import java.util.List;

class u{
    int uid;
    String name;

    public u() {
    }

    public u(int uid, String name) {
        this.uid = uid;
        this.name = name;
    }
}
public class ReduceTerminal
{
    //reduce() makes collection object to one object
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Integer res = list.stream().reduce((value, combinedValue) -> value += combinedValue)
                .get();
        System.out.println("res : "+res);




    }
}
