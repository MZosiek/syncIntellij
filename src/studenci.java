public class studenci {
    public static void main(String[] args) {

        studentDane A1 = new studentDane();

        A1.imie = "Marcin";
        A1.nazwisko = "Zofiński";
        A1.email = "zosiek@meil.com";
        A1.numerIndeksu = 1234;
        A1.twórzNick();

        studentDane A2 = new studentDane();

        A2.imie = "Marta";
        A2.nazwisko = "Grzeszkiewicz";
        A2.email = "antamya@meil.com";
        A2.numerIndeksu = 4658;
        A2.twórzNick();

        studentDane A3 = new studentDane();

        A3.imie = "Damian";
        A3.nazwisko = "Cep";
        A3.email = "cep@meil.com";
        A3.numerIndeksu = 4587;
        A3.twórzNick();

        studentDane[] students = new studentDane[3];
        students[0]= A1;
        students[1]= A2;
        students[2]=A3;

        for(int i=0; i<students.length;i++){
            students[i].przedstawSie();
            students[i].zalogujSię();
            students[i].podajNick();
            students[i].podajNrIndeksu();
            System.out.println(" ");
        }



    }
}
