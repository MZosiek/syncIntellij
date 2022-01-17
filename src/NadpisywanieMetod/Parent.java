package NadpisywanieMetod;

public class Parent {

    public String firstString;
    public int  secondInt;

    public Parent( String firstString , int secondInt){
        this.firstString = firstString;
        this.secondInt = secondInt;
    }

    public void firstMethod(){
        System.out.println("wartości + " + firstString + " oraz " + secondInt);
    }
}
