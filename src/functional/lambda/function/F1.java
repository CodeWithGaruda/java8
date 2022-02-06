package functional.lambda.function;

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

    }
}
