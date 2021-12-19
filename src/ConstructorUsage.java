public class ConstructorUsage {

    public static void main(String[] args) {

        Constructors firstUser = new Constructors(); // konstruktor bez podawania zmiennych <- powstały z pierwszego konstruktora

        Constructors nextUser = new Constructors("zosiek", "haslo123"); // konstruktor z podawaniem ziennych - z drugiego konstruktora
    }
}
