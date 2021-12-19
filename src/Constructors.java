public class Constructors {

    String username;
    String password;

    public Constructors(){
        System.out.println("inicjalizuje");
    }



    public Constructors( String username, String password){


        this.username = username; // <- przypisanie wartości zmiennych w nowo tworzonym obiekcie z konstruktora. czyli nazwa.username danego obiektu
                                        // będzie równa username
        this.password = password;

        System.out.println("User : " + username + " , " + password);
    }
}
