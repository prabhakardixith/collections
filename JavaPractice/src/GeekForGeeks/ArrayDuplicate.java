package GeekForGeeks;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayDuplicate
{
    public static void main(String[] args) {
        int array[] = {0,3,1,2,3};
        Set set = new HashSet();
        int count  = 0;
        for (int i = 0; i <= array.length-1; i++) {
            for (int j = 0; j <= array.length-1; j++) {
                if(array[i] == array[j])
                {
                   count++;
                }
            }
            if(count >= 2)
            {
                set.add(array[i]);
            }
            count  = 0;
        }
        if(set.size() > 0)
        {
            System.out.println(set);
        }
        else
        {
            System.out.println("No Duplicate Found");
        }

    }
}
