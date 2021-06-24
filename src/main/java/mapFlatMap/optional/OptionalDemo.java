package mapFlatMap.optional;

import mapFlatMap.Customer;
import mapFlatMap.EKartDataBase;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmail(String email) throws Exception {
        return EKartDataBase.getAll().stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny()
                .orElseThrow(()-> new Exception("no customer present with this email"));
    }

    public static void main(String[] args) {

        Customer customer = new Customer(101, "john", "test@mail.com", Arrays.asList("555454", "5455454"));

        //empty
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //of
//        Optional<String> emailOptional = Optional.of(customer.getEmail());
//        System.out.println(emailOptional);

        //ofNullable
        Optional<String> emailOptional2 = customer.getEmail();
        emailOptional2.ifPresent(System.out::println);

        System.out.println(emailOptional2.orElse("default@mail.com"));

//        System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("" +
//                "email is not present")));

        System.out.println(emailOptional2.map(s -> s.toUpperCase()).orElseGet(() -> "default email..."));

        try {
            getCustomerByEmail("asdasdasd");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
