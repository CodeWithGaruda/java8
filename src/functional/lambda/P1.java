package functional.lambda;

@FunctionalInterface
interface S1 {
    void work();
}

public class P1 {
    public static void main(String[] args) {
        // taking no arguments and single line implementation and no return value
        // need to end the lambda with semi-colun
        S1 s = () -> System.out.println("hello");
        s.work();

        /** if u wanna write more than one line of code */
        s = () -> {
            System.out.println("line one");
            System.out.println("line two");
        };
        s.work();

    }
}
