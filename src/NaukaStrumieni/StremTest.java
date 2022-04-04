package NaukaStrumieni;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StremTest {
    public static void main(String[] args) {

        // tworzenie nowego streama
        List<String> names = Arrays.asList("Marcin","Adam","Krzysztof");
        Stream<String> streamNames = names.stream();

       // Stream<Integer> streamInt = Arrays.asList( Arrays.stream(new Integer[]{1,2})).stream();
        DoubleStream doubleStreamTest = DoubleStream.of(1,2,4,5,6);
        IntStream intStreamTest=  IntStream.of(1,2,3,4);
        IntStream intStreamTest2 = IntStream.range(1,50);


        //przetwarzanie danych

        doubleStreamTest.filter(el -> el<=4)
                        .map(el -> el*2)
                        .forEach(el-> System.out.println(el));
    }
}
