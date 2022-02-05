package functional.lambda;

@FunctionalInterface
interface S2 {
    void work(String s);
}

public class P2 {
    public static void main(String[] args) {
        S2 s = str -> System.out.println(str.toUpperCase());
        s.work("sample string");
        // multiple lines
        s = str -> {
            System.out.println(str);
            System.out.println(str.toUpperCase());
        };
        s.work("multiline lambda expression");
    }
}
