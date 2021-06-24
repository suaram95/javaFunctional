package streamsForEachAndFilter.stream.api.example;

import java.util.ArrayList;
import java.util.List;

//DAO Layer
public class DataBase {

    public static List<Employee> getEmployees(){
       List<Employee> employees=new ArrayList<>();
       employees.add(new Employee(1, "Aram", "IT", 60_000_000));
       employees.add(new Employee(2, "Ashot", "HR", 50_000));
       employees.add(new Employee(3, "Petrosik", "ACC", 20_000));
       employees.add(new Employee(4, "Poxos", "SOCIAL", 400_000));
       employees.add(new Employee(5, "Petros", "CORE", 300_000));
       employees.add(new Employee(6, "Martiros", "ADMIN", 6_000_000));

       return employees;
    }
}
