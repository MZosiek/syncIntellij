package NaukaMap;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();

        students.put(1,"Basia");
        students.put(2,"Adam");
        students.put(3,"Tomasz");
        students.put(1,"Marta");  // w przypadku podania później w kodzie tego samego klucza nie pojawia sie błąd - ale wartość z numerem zostaje nadpisana!

        System.out.println(students.get(1));

        System.out.println(students.containsKey(1));  //pytam czy zawiera klucz 1 - boolean
        System.out.println(students.containsValue("Adam"));  // pytam czy zawiera wartość "Adam"
        System.out.println(students.isEmpty());  // pytam czy jest puste
        // students.remove(2);  usuwa numer 2

        //wypisanie wszystkich wartości

        for(Integer key : students.keySet()){
            System.out.println(key);
            System.out.println(students.get(key));
        }

        for (String student : students.values()){
            System.out.println(student);
        }
    }
}

