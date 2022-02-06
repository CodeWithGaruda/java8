package functional.lambda.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class F1 {
    public static void main(String[] args) {
        /**
         * functional interface takes two methods<type,returnType>
         * it has apply method
         * the apply method will apply some logic on type and return the return type
         */

        // here i wanna take integer and return integer
        Function<Integer, Integer> function1 = i -> i * i;
        System.out.println(function1.apply(5));
        System.out.println(function1.apply(15));
        System.out.println(function1.apply(-5));

        // i will take a string and return its length
        Function<String, Integer> function2 = (str) -> str.length();
        System.out.println(function2.apply("sanath"));
        System.out.println(function2.apply("aparna"));
        System.out.println(function2.apply("subhash"));
        System.out.println(function2.apply("srikanth"));

        // i will take string as input and give string as output
        Function<String, String> function3 = (str) -> str.toUpperCase();
        System.out.println(function3.apply("sanath"));
        System.out.println(function3.apply("aparna"));
        System.out.println(function3.apply("subhash"));
        System.out.println(function3.apply("srikanth"));

        // employee in and integer out
        Function<Employee, Integer> function4 = (employee) -> {
            if (employee.salary >= 10000 && employee.salary < 20000)
                return employee.salary * 10 / 100;
            else if (employee.salary >= 20000 && employee.salary < 30000)
                return employee.salary * 20 / 100;
            else if (employee.salary >= 30000 && employee.salary < 40000)
                return employee.salary * 30 / 100;
            else
                return employee.salary * 40 / 100;
        };

        List<Employee> employees = Arrays.asList(new Employee("sanath", 5000000),
                new Employee("omkar", 10000),
                new Employee("dindu", 25000),
                new Employee("aparna", 35000),
                new Employee("subhash", 400000),
                new Employee("bharadwaj", 500000),
                new Employee("rahul", 300000),
                new Employee("srikanth", 40000));
        System.out.println("------employee------");
        for (Employee employee : employees) {
            System.out.println(employee.employeeName + ":" + function4.apply(employee));
        }
    }
}

class Employee {
    String employeeName;
    int salary;

    Employee(String employeeName, int salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }
}