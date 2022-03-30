package Lambda;

public class StudentTest {
    public static void main(String[] args) {

        Student itGuy = new StudentIT();

        Student Med = new Student() {
            @Override
            public void sayHello(String name) {
                System.out.println("Klasa abstrakcyjna");
                System.out.println(" my name is " + name);
            }
        };

        sayHello("Marian" , itGuy);

        sayHello("Wojtek", Med);

       // itGuy.sayHello("Marcin");
        sayHello("Krzysztof",itGuy);

    }

    public static void sayHello(String name, Student student){
        student.sayHello(name);
    }
}
