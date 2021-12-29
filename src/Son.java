public class Son extends Parent{

    public String beard;
    public String game;

    public Son(String parentName, String name, int age, String sex, String beard, String game) {
        super(parentName, name, age, sex);
        this.beard = beard;
        this.game = game;
    }

    public void plays(){
        System.out.println( name + " likes to play " + game);
    }


}
