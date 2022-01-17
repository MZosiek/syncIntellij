package identifiers.second;

import identifiers.first.Parent;

public class SecondRandom {

    public void Test(){

        Parent parent = new Parent();

        System.out.println(parent.first);
        // System.out.println(parent.second); <-- dla klasy z innego pakietu która NIE jest CHILDEM pole bez identyfiaktora (DEFAULT) NIE będzie widoczne
        // System.out.println(parent.third);<-- dla klasy z innego pakietu która NIE jest CHILDEM  pole z identyfikatorem protected NIE będzie widoczne
       // System.out.println(parent.fourth); <-- dla klasy z innego pakietu która NIE jest CHILDEM pole z identyfikatorem private NIE będzie widoczne

        parent.firstMethod();
       //  parent.secondMethod(); <-- dla klasy z innego pakietu która NIE jest CHILDEM metoda bez identyfiaktora (DEFAULT) NIE będzie widoczna
       //  parent.thirdMethod();  <-- dla klasy z innego pakietu która NIE jest CHILDEM  metoda z identyfikatorem protected NIE będzie widoczna
       //  parent.fourthMethod(); <-- dla klasy z innego pakietu która NIE jest CHILDEM metoda z identyfikatorem private NIE będzie widoczna
    }
}
