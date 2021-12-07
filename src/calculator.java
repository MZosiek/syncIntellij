import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 2 liczby");
        System.out.println("pierwsza:");
        Double firstNumber = scanner.nextDouble();
        System.out.println("druga:");
        Double secondNumber = scanner.nextDouble();

        System.out.println("liczby: " + "\n" + firstNumber + "\n" + secondNumber);
        System.out.println("dodawanie :" + (firstNumber+secondNumber));
        System.out.println("odejmowanie " + (firstNumber-secondNumber));
        System.out.println("mnożenie :" + (firstNumber*secondNumber));
        System.out.println("dzielenie :" + (firstNumber/secondNumber));
        System.out.println("modulo :" + (firstNumber%secondNumber));
        double thirdNumber = firstNumber++ ;
        System.out.println("PREinkrementacja "+ thirdNumber );
        thirdNumber = ++secondNumber;
        System.out.println("Postinkrementacja "+ thirdNumber);
        thirdNumber = firstNumber--;
        System.out.println("PREdekrementacja " + thirdNumber);
        thirdNumber = --secondNumber;
        System.out.println("POSTinkrementacja " + thirdNumber);

    }
}
