package InnerClass;

public class Outer
{
    private int outerX;
    class Inner{
        private int innerX;
        public void display()
        {
            System.out.println(innerX+" "+outerX);
        }
    }
    public void demo()
    {
        Inner inner = new Inner();
        inner.innerX = 10;
        inner.display();
    }
    public static void main(String[] args) {
         Outer outer=new Outer();
         outer.outerX = 10;
         outer.demo();
        Outer.Inner in = outer.new Inner();
        String str1 = new String("hi");
        String str2 = "hi";

        System.out.println(str1.equals(str2));
        System.out.println(str1== str2);
        System.out.println(str1.intern());
    }
}
