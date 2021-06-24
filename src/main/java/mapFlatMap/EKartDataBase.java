package mapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDataBase {

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@mail.com", Arrays.asList("555454", "5455454")),
                new Customer(102, "smith", "smith@mail.com", Arrays.asList("879889", "31321321")),
                new Customer(103, "peter", "peter@mail.com", Arrays.asList("564564564897", "89798797")),
                new Customer(104, "kelly", "kelly@mail.com", Arrays.asList("11648", "6548978"))
        ).collect(Collectors.toList());
    }
}
