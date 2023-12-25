import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtils {

    private static final SecureRandom RANDOM = new SecureRandom();

    public static ArrayList<Integer> correctList(int begin, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = begin; i < end; i++)
            temp.add(i);

        return shuffle(temp);
    }

    public static ArrayList<Integer> randomList(int begin, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = begin; i < end; i++)
            temp.add(RANDOM.nextInt(begin, end));

        return temp;
    }

    public static ArrayList<Integer> randomList2(int begin, int end) {
        return shuffle(correctList(begin, end));
    }


    public static ArrayList<Integer> shuffle(ArrayList<Integer> array) {
        ArrayList<Integer> temp = new ArrayList<>(array.size());
        final int size = array.size();
        for (int i = 0; i < size; i++) {
            int rand = RANDOM.nextInt(0, array.size());
            temp.add(i, array.get(rand));
            array.remove(rand);
        }
        return temp;
    }

    public static ArrayList<Integer> danielsort(ArrayList<Integer> list) {
        int max = 0;

        for (Integer integer : list) {
            max = Math.max(max, integer);
        }

        int[] array = new int[max + 1];
        Arrays.fill(array, 0);

        for (Integer integer : list) {
            array[integer] += 1;
        }

        final ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                output.add(i);
            }
        }
        return output;
    }

}
