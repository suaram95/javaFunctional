package streamsForEachAndFilter;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ForEachDemo {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("wersdfsd");
        list.add("wgfdbvxcv");
        list.add("asdasd");
        list.add("ngnfg");
        list.add("wdfgdfg");

        List<String> listWithW = list.stream()
                .filter(t -> t.startsWith("w"))
                .collect(Collectors.toList());

        listWithW.stream()
                .forEach(System.out::println);

        //for iterating in list
//        for (String s : list) {
//            System.out.println(s);
//        }

        //for iterating in list with stream
        list.stream()
                .forEach(System.out::println);

        Map<Integer, String> map=new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        map.forEach((key, value)-> System.out.println(key+": "+value));

        map.keySet().forEach(System.out::println);
        Collection<String> values = map.values();
        values.stream().forEach(System.out::println);

        Consumer consumer= (t)-> System.out.println(t);

        for (String s : list) {
            consumer.accept(s);
        }


    }
}
