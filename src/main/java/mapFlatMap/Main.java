package mapFlatMap;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Customer> customers = EKartDataBase.getAll();

        //List<Customer> convert List<String> --> Data transformation
        //mapping: customer-> customer.getEmail()
        // customer-> customer.getEmail() - One to One mapping
        List<Optional<String>> emails = customers.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println("Email list: " + emails);
        System.out.println();
        // customer -> customer.getPhoneNumbers() -  One to Many mapping
        List<List<String>> phoneNumbers = customers.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println("Phone Numbers: " + phoneNumbers);
        System.out.println();
        //List<Customer> convert List<String> --> Data transformation
        //mapping: customer-> phoneNumbers
        // customer-> customer.getPhoneNumbers - One to many mapping
        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("Phones: "+phones);


    }
}
