package Generic.Wildcards;

import java.util.List;

public class Wildcards {
    public static void printAll(List<?> list) {
        System.out.println(list);
    }

    public static void printNumber(List<? extends Number> list) {
        System.out.println(list);
    }

    public static void printInteger(List<? super Integer> list) {
        System.out.println(list);
    }
}
