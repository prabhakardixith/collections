package methodReference;

class Stuff
{
    public static void doStuff()
    {
        System.out.println("im doing task");
    }
    public void doBro()
    {
        System.out.println("calling non static ()");
    }

    public Stuff() {
        System.out.println("inside Stuff Constructor");
    }
}

@FunctionalInterface
interface WorkInfer
{
    void doTask();
}
public class MethodRef
{
    public static void main(String[] args)
    {
        System.out.println("provide implementation of work enter ");
        WorkInfer wi1 = Stuff::doStuff;//static method reference
        WorkInfer wi2 = new Stuff()::doBro;//non static
        WorkInfer wi3 = Stuff::new;//constructor
        wi1.doTask();
        wi2.doTask();
//        wi3.doTask();
    }
}
