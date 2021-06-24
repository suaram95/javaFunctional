package parallelStream;

import filterMapReduce.Employee;
import filterMapReduce.EmployeeDataBase;

import java.awt.*;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        long start = 0;
        long end = 0;
//
//        start=System.currentTimeMillis();
//        IntStream.range(1,100).forEach(System.out::println);
//        end=System.currentTimeMillis();
//
//        System.out.println("Plain stream took time: "+(end-start));
//
//        start=System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end=System.currentTimeMillis();
//
//        System.out.println("Parallel stream took time: "+(end-start));

//        IntStream.range(1, 10).forEach(x -> {
//            System.out.println("Thread: " + Thread.currentThread().getName() + " : " + x);
//        });
//
//        IntStream.range(1, 10).parallel().forEach(x->{
//            System.out.println("Thread: "+Thread.currentThread().getName()+" : "+x);
//        });

        List<Employee> employees = EmployeeDataBase.getEmployees();
            
        //normal
        start = System.currentTimeMillis();
        double salaryWithStream = employees.stream()
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();

        System.out.println("Normal stream execution time: " + (end - start) + "\nAvg salary: " + salaryWithStream);

        //parallel
        start = System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();

        System.out.println("Parallel stream execution time: " + (end - start) + "\nAvg salary: " + salaryWithParallelStream);

    }
}
