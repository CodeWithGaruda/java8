package functional.lambda.predicate;

import java.util.function.Predicate;

public class R1 {
    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.length() > 6 && str.startsWith("s");
        Predicate<String> predicate2 = (str) -> str.endsWith("sh");
        String[] names = new String[] { "sanath", "subhash", "aparna", "srikanth" };
        for (String string : names) {
            if (predicate.and(predicate2).test(string))
                System.out.println(string);
        }
    }
}
