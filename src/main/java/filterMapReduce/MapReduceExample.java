package filterMapReduce;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 8, 9, 1, 4);

        //Traditional way
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        //Streams
        int sum1 = numbers.stream()
                .mapToInt(i -> (i)).sum();
        System.out.println(sum1);

        //reduce
        Integer reduceSum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        //reduce with method reference
        Integer methodReference = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(methodReference);

        //multiply
        Integer multiply = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(multiply);

        //maxValue
        Integer maxValue = numbers.stream()
                .reduce(Integer::max).get();
        System.out.println(maxValue);

        Integer maxValue2 = numbers.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValue2);

        List<String> words = Arrays.asList("javaCore", "spring", "hibernate", "mysql");

        String maxLength = words.stream()
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                .get();
        System.out.println(maxLength);

        /*Work with employee*/

        List<Employee> employeesDB = EmployeeDataBase.getEmployees();

        //get employee whose grade A
        //get salary
        double avgSalary = employeesDB.stream()
                .filter(employee -> employee.getGrade().equals("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();

        System.out.println("Avg salary: " + avgSalary);

        //salary sum whose grade A
        double salarySum = employeesDB.stream()
                .filter(employee -> employee.getGrade().equals("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println("Sum of salary: " + salarySum);


        //max salary whose grade A
        double gradeAMaxSalary = employeesDB.stream()
                .filter(employee -> employee.getGrade().equals("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .max()
                .getAsDouble();
        System.out.println("max salary of grade A: "+gradeAMaxSalary);

        //max salary of all employees
        double maxSalaryInAllEmployees = employeesDB.stream()
                .map(employee -> employee.getSalary())
                .reduce(Double::max)
                .get();
        System.out.println("Max salary: "+maxSalaryInAllEmployees);


    }
}
