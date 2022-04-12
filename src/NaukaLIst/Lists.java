package NaukaLIst;

import Polimorfizm.PdfDocument;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.add("Marcin");
        names.add("Marta");
        names.add("Tomek");
        names.add("Marta");

        System.out.println(names.get(1));
        System.out.println(names.indexOf("Tomek"));
        System.out.println(names.lastIndexOf("Marta"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());


        List<Integer> numbers = new ArrayList<>();

        List<PdfDocument> pdfs = new ArrayList<>();
        pdfs.add(new PdfDocument());


        for(int i=0; i<names.size();i++){
            System.out.println(names.get(i));
        }

        for(String name : names){
            System.out.println(name);
        }

    }
}
