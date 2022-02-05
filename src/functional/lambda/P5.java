package functional.lambda;

@FunctionalInterface
interface S5 {
    int work(String string, int i, String str);
}

public class P5 {
    public static void main(String[] args) {
        // multiple arguments and single return statement
        S5 s = (string, i, str) -> i * i * i;
        System.out.println(s.work("string", 7, "str"));
        // multiple arguments and multiple lines
        s = (string, i, str) -> {
            System.out.println(string);
            System.out.println(str);
            return i;
        };
        int res = s.work("string", 8, "str");
        System.out.println(res);

    }
}
