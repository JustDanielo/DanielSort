import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integers = ArrayUtils.randomList(0, 10);
        System.out.println(integers);

        long start = System.currentTimeMillis();

        final ArrayList<Integer> output = ArrayUtils.danielsort(integers);

        System.out.println(output);
        System.out.println("It took " + (System.currentTimeMillis() - start) + "ms!");
    }

}