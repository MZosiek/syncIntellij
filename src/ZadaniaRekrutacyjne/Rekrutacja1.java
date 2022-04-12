package ZadaniaRekrutacyjne;

import java.util.HashMap;
import java.util.Map;

public class Rekrutacja1 {

    //  int[]numbers = new int [] {1,2,3,2,5,3};

    public static void main(String[] args) {

        wyliczenia(new int [] {1,2,3,2,5,3});




           }

    public static void wyliczenia(int[] numbers) {

        Map<Integer,Integer> occurencies = new HashMap<>();

        for (int i=0; i<numbers.length;i++){
            if(occurencies.containsKey(numbers[i])){
                Integer value = occurencies.get(numbers[i]);
                occurencies.put(numbers[i],value+1);
            } else {
                occurencies.put(numbers[i],1);
            }

        }

        System.out.println("Wyliczenia występień : ");

        for(Integer key : occurencies.keySet()){
            System.out.println("Liczba " + key + " występuje " + occurencies.get((key)) + " razy.");
        }
    }
}
