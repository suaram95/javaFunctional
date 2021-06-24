package streamsForEachAndFilter;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("eight", 8);
        map.put("four", 4);
        map.put("nine", 9);
        map.put("eleven", 11);

        //TRADITIONAL WAY
        List<Map.Entry<String, Integer>> entries=new ArrayList<>(map.entrySet());

        /*Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>(){

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }*/

        //WITH LAMBDA
        /*Collections.sort(entries, ((o1, o2) -> o1.getKey().compareTo(o2.getKey())));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }*/

        //WITH STREAM

        //byKey
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("-------------");
        //byValue

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}
