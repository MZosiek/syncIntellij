package Lambda;

public class StudentIT implements Student{
    @Override
    public void sayHello(String name) {
        System.out.println("I am and IT guy");
        System.out.println("My name is " + name);

    }
}
