import java.util.Scanner;

public class pytanieOWiek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();
        System.out.println("wiek: "+ age);

        while(age>0) {

            if (age < 18) {
                System.out.println("nie możesz kupić alko");
            } else {
                System.out.println("dziękuję za zakupy");
            }
            System.out.println("jeszcze raz :");
            age = scanner.nextInt();
        }
    }
}
