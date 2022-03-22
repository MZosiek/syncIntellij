package PracaDomowaWyjątkiWiek;

public class AgeTest {

    public static void main(String[] args) throws InvalidAgeException {

        AgeConstruktor test = new AgeConstruktor();


        test.ageInfo = AgeScanner.wiek();

        System.out.println(test.ageInfo);

    }
}
