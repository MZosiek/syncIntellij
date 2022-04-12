package ZadaniaRekrutacyjne;

public class Rekrutacja2 {


    public static void main(String[] args) {


        palindrom("modom");
    }

    private static void palindrom(String text) {


        String reverse = "";

        for(int i=text.length()-1; i>=0; i--){
            char a = text.charAt(i);
            reverse= reverse+a;

        }

        if(text.equals(reverse)){
            System.out.println("słowo " + text + " to palindrom");
        } else {
            System.out.println("słowo " + text + " jest inne od " + reverse);
        }

    }
}
