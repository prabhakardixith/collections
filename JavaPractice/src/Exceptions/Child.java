package Exceptions;

public class Child extends Parent
{

    @Override
    public void hello() throws Exception{
        System.out.println("hell() Child ");
    }

    public static void main(String[] args) throws Exception {
        Parent parent =  new Child();
        parent.hello();
        parent.bye();
    }
}
