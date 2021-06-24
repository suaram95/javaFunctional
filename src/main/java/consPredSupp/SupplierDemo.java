package consPredSupp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hi Java Techie";
        System.out.println(supplier.get());

        List<String> stringList = Arrays.asList("a", "b");

        System.out.println(
                stringList.stream()
                        .findFirst()
                        .orElseGet(supplier));
    }
}
