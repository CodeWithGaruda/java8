package functional.lambda.ConsumerSupplier;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CS1 {
    public static void main(String[] args) {
        Consumer<Integer> consumer1 = n -> System.out.println(n * n);
        Consumer<Integer> consumer2 = n -> System.out.println(n + " cube: " + n * n * n);

        for (int i = 0; i < 10; i++) {
            consumer2.accept(i);
        }

        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println(dateSupplier.get());
        Supplier<LocalDateTime> localDateTimeSupplier = () -> LocalDateTime.now();
        System.out.println(localDateTimeSupplier.get());
    }
}
