import java.util.Calendar;

public class AutoKonstruktor {

    public String marka;
    public String model;
    public int przebieg;
    public int rok;
    public double cena;

    int year = Calendar.getInstance().get(Calendar.YEAR);

    public AutoKonstruktor() {

    }


    public  AutoKonstruktor( String marka, String model, int przebieg, int rok, double cena){

        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.rok=rok;
        this.cena = cena;

        System.out.println("Marka " + marka);
        System.out.println("Model " + model);
        System.out.println("Przebieg "+ przebieg);
        System.out.println("Rok "+ rok);
        System.out.println("cena " + cena);

    }

    public double nowy(){

        if(przebieg !=0 && year-rok<=15 ){
            cena= cena*0.9;
        }
        return cena;
    }



}
