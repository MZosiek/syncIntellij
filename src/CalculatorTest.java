import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 2 liczby :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Podaj funkcje :");
        String w = scanner.next();
        System.out.println("wykonuje :");

        double c;
        double d;

        switch (w){
            case  "+" :
                c = CalculatorMethods.dodawanie(a,b);
                System.out.println("dodawanie liczb " +a + " i " + b+ " = " +c);
                break;
            case "-" :
                c = CalculatorMethods.odejmowanie(a,b);
                System.out.println("odejmowanie liczb " +a + " i " + b+ " = " +c);
                break;
            case "*":
                c = CalculatorMethods.mnożenie(a,b);
                System.out.println("mnożenie liczb " +a + " i " + b+ " = " +c);
                break;
            case "/":
                d = CalculatorMethods.dzielenie(a,b);
                System.out.println("dzielenie liczb " +a + " i " + b+ " = " +d);
                break;

        }



    }
}
