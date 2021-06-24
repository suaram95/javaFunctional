package streamsForEachAndFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Aram");
        names.add("Babken");
        names.add("Yura");
        names.add("Gevorg");
        names.add("Karen");
        names.add("Manuk");

//        for (String name : names) {
//            if (name.startsWith("")){
//                System.out.println(name);
//            }
//        }

        names.stream()
                .filter(t -> t.startsWith("A"))
                .forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");

        map.entrySet().stream().forEach(System.out::println);

//        map.keySet().stream().forEach(System.out::println);
//        map.values().stream().forEach(System.out::println);


        //if keys are even then print
        map.entrySet().stream()
                .filter(k->k.getKey()%2==0)
                .forEach(System.out::println);

    }
}
