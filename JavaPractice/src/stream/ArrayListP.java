package stream;

import java.util.ArrayList;
import java.util.List;

public class ArrayListP
{
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("prabhakar");
        list.add("uday");
        list.add("prabhakar");
        list.add("sahu");
//        List.of("prabhakar","uday","prabhakar","suhel");
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals("prabhakar"))
            {
                list.remove(i);
            }
        }
        list.forEach((n)->System.out.println(n));
    }
}
