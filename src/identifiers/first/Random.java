package identifiers.first;

public class Random {

    public void randomTest(){

        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
      //  System.out.println(parent.fourth);  <-- dla jakiejkolwiek klasy(nie child) w pakiecie pole z identyfikatorem PRIVATE jest niedostępne

        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
      //  parent.fourthMethod(); <-- dla jakiejkolwiek klasy(nie child) w pakiecie metoda z identyfikatorem PRIVATE jest niedostępna
    }
}
