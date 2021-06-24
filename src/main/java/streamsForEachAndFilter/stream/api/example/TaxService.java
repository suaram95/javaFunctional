package streamsForEachAndFilter.stream.api.example;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaxService {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static List<Employee> evaluateTaxEmployees() {
        return DataBase.getEmployees().stream()
                .filter(employee -> employee.getSalary() > 50000)
                .collect(Collectors.toList());
    }

    public static List<Employee> getAllEmployees() {
        return DataBase.getEmployees()
                .stream()
                .collect(Collectors.toList());
    }

    public static List<Employee> getEmployeesByCategory() {
        return (SCANNER.nextLine().equalsIgnoreCase("tax"))
                ?
                DataBase.getEmployees().stream()
                        .filter(employee -> employee.getSalary() > 50000)
                        .collect(Collectors.toList())
                :
                DataBase.getEmployees().stream()
                        .filter(employee -> employee.getSalary() < 50000)
                        .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println("Please input tax for tax users: ");
        System.out.println(getEmployeesByCategory());

//        System.out.println("All Employees: " + getAllEmployees());
//        System.out.println("Tax Employees: " + evaluateTaxEmployees());
    }
}
