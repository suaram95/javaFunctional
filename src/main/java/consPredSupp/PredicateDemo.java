package consPredSupp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> t % 2 == 0;
        System.out.println(predicate.test(12));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        //Even and Odd
        integers.stream()
                .forEach(t -> {
                    if (t % 2 == 0) {
                        System.out.println("Even: " + t);
                    } else {
                        System.out.println("Odd: " + t);
                    }
                });

        //Evens
        integers.stream()
                .filter(t -> t % 2 == 0)
                .forEach(t -> System.out.println("Even: " + t));
    }
}
