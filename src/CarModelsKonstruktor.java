public class CarModelsKonstruktor {
    public static void main(String[] args) {


        AutoKonstruktor audi = new AutoKonstruktor("Audi", "S4", 1000, 2020, 10000.00);


        AutoKonstruktor bmw = new AutoKonstruktor("BMW" , "model 5", 0,2020,20000.00);

        audi.cena = audi.nowy();

        bmw.cena = bmw.nowy();

        AutoKonstruktor ford = new AutoKonstruktor();

        ford.marka = "Ford";
        




        System.out.println("audi cena " + audi.cena);


    }
}