package identifiers.second;

import identifiers.first.Parent;

public class SecondChild extends Parent {

    public void Test(){
        System.out.println(first);
      //  System.out.println(second);  <-- dla klasy CHILD z innego pakietu pole bez identyfikatora (DEFAULT) nie jest widoczne
        System.out.println(third);
      //  System.out.println(fourth); <-- dla klasy CHILD z innego pakiety pole z identyfikatorem PRIVATE nie jest widoczne

        firstMethod();
      //  secondMethod(); <-- dla klasy CHILD z innego pakiety metoda bez identyfikatora (DEFAULT) nie jest widoczne
        thirdMethod();
      //  fourthMethod(); <-- dla klasy CHILD z innego pakiety metoda z identyfikatorem PRIVATE nie jest widoczne
    }
}
