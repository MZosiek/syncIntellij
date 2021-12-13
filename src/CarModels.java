public class CarModels {
    public static void main(String[] args) {


        Auto audi = new Auto();

        audi.marka = "Audi";
        audi.model = "S4";
        audi.przebieg = 1000;
        audi.rok = 2020;
        audi.cena = 10000;


        Auto bmw = new Auto();

        bmw.marka = "BMW";
        bmw.model = "model 5";
        bmw.przebieg = 0;
        bmw.rok = 2020;
        bmw.cena = 20000;


        Auto ford = new Auto();

        audi.info();
        audi.nowy();
        audi.info();

        System.out.println("audi cena " + audi.cena);


    }
}