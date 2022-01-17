package NadpisywanieMetod;

public class Extender extends Parent{

    public String extenderString;
    public int extenderInt;

    public Extender( String firstString, int secondInt, String extenderString , int extenderInt){
        super( firstString , secondInt );
        this.extenderString = extenderString;
        this.extenderInt = extenderInt;
    }

    public void extenderMethod(){
        System.out.println(" extended method - wartości " + extenderString + " , " + extenderInt + " , " + firstString + " , " + secondInt );
    }

    public void firstMethod(){
        super.firstMethod(); // <- można odwołać się do metody którą się nadpisuje
        super.firstString = "zmiana wartości firstString "+ super.firstString; // <- super odwołuje się do metody nadpisywanej oraz wartości parenta
        System.out.println("nadpisywanie metody firstMethod , wartości : "  + extenderString + " , " + extenderInt + " , " + firstString + " , " + secondInt );
    }
}
