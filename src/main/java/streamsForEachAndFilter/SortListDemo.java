package streamsForEachAndFilter;

import streamsForEachAndFilter.stream.api.example.DataBase;
import streamsForEachAndFilter.stream.api.example.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(65);
        list.add(47);
        list.add(14);
        list.add(37);

        /*Collections.sort(list); //Ascending
        Collections.reverse(list); // Descending
        System.out.println(list);

        list.stream().sorted().forEach(System.out::println); //Ascending
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //Descending*/

        List<Employee> employees = DataBase.getEmployees();

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary() - o2.getSalary());
//            }
//        });


        //Traditional way
//        Collections.sort(employees, ((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())));


//        System.out.println(employees);


        //With streams

        //1
        employees.stream()
                .sorted(((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())))
                .forEach(System.out::println);
        System.out.println();

        //2
        employees.stream()
                .sorted(Comparator.comparing(emp -> emp.getSalary()))
                .forEach(System.out::println);
        System.out.println();

        //3
        employees.stream()
                .sorted(Comparator.comparing(Employee::getDept))
                .forEach(System.out::println);
    }
}

//class MyComparator implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return (int) (o1.getSalary()-o2.getSalary());
//    }
//}
