import java.util.Random;

public class studentDane {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    Random generator = new Random();

    public void przedstawSie() {
        System.out.println(" Nazywam się "+ imie + " " + nazwisko);
    }

    public void zalogujSię() {
        System.out.println("Loguję się za pomocą " + nick);
    }

    public void podajNrIndeksu(){
        System.out.println("Numer indeksu to " + numerIndeksu);
    }

    public String twórzNick(){
        nick= generator.nextInt()+email+numerIndeksu;
        return nick;
    }

    public void podajNick(){
        System.out.println("nick : " + nick);
    }
}


