package functional.lambda;

@FunctionalInterface
interface S3 {
    void work(int i);
}

public class P3 {
    public static void main(String[] args) {
        // taking int as input
        S3 s = a -> System.out.println(a * a);
        s.work(5);
        // i cant give string as input here
        // s.work("6"); here it will throw compile error cuz it take int as input
        s = a -> {
            System.out.println(a * a);
            System.out.println(a * a * a);
        };
        s.work(6);
    }
}
