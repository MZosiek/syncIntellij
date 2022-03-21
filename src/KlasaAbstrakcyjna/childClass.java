package KlasaAbstrakcyjna;

public class childClass extends Abstract {
    @Override
    public void metodaAbstrakcyjna() {    //implementacja metody abstrakcyjnej - dostarczenie ciałą
        System.out.println("implementacja metody Abstrakcyjnej" + stała);
    }

    @Override
    public void zwykłaMetoda() {
        super.zwykłaMetoda();
        System.out.println("nadpisanie zwykłej metody");
    }
}
