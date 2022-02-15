package stream;

import java.util.Optional;

@FunctionalInterface // make sure it should contain only one abstract ()
interface pd
{
    void hi();
}

public class LambaExpression
{
    public static void main(String[] args) {
        pd le = ()-> System.out.println("hi everyone");
        le.hi();

        le.hi();
    }


}
