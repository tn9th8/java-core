package Generic;

import Generic.Class.Student;
import Generic.Method.Console;
import Generic.Wildcards.Wildcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        // test the generic class
        final Student<Long> student1 = new Student<>(1L, "Nhan", "20");
        final Student<String> student2 = new Student<>("1", "Nhan", "20");

        // test the generic method
        Console.print(123L);
        Console.print("123");

        // test the generic method
        List<Long> longs = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        longs.add(1L);
        longs.add(2L);
        longs.add(3L);

        strings.add("1");
        strings.add("2");
        strings.add("3");

        integers.add(1);
        integers.add(2);
        integers.add(3);

        objects.add(1L);
        objects.add("2");
        objects.add(3);

        Wildcards.printAll(longs);
        Wildcards.printAll(strings);
        Wildcards.printAll(integers);
        Wildcards.printAll(objects);

        Wildcards.printNumber(longs);
        Wildcards.printNumber(integers);
        // Wildcards.printNumber(strings); // error
        // Wildcards.printNumber(objects); // error

        Wildcards.printInteger(integers);
        Wildcards.printInteger(objects);
        // Wildcards.printInteger(longs);
        // Wildcards.printInteger(strings);

    }
}
