package identifiers.first;

public class Child extends Parent{

    public void ChildTest(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
      //  System.out.println(fourth); <-- pole z identyfikatorem PRIVATE nie widoczne dla childa

        firstMethod();
        secondMethod();
        thirdMethod();
       // fourthMethod(); <-- metoda z identyfikatorem PRIVATE nie widoczne dla childa
    }
}
