package KlasaAbstrakcyjna;

public abstract class Abstract {

    public final static int stała = 4; // statyczna zmienna

    public abstract void metodaAbstrakcyjna(); // deklaracja metody - ciało należy dostarczyć w klasie dziedizczącej

    public void zwykłaMetoda(){                         // zwykła metoda
        System.out.println("ciało zwykłej metody" + stała);
    }


}
