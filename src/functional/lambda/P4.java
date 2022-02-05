package functional.lambda;

@FunctionalInterface
interface S4 {
    int work(int i);
}

public class P4 {
    public static void main(String[] args) {
        // this takes int as input and return int
        S4 s = i -> i * i;// here u dont need to give return word if its a single statement
        int res = s.work(3);
        System.out.println(res);
        // returning with multiple statements
        s = i -> {
            System.out.println(i);
            return i * i;
        };
        res = s.work(5);
        System.out.println(res);
        // if u want to return a statement with a single return keyword
        s = i -> {
            return i * i;
        };
        res = s.work(4);
        System.out.println(res);
    }
}
