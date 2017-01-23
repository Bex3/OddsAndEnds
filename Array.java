import java.util.stream.IntStream;

/**
 * Created by bearden-tellez on 1/23/17.
 */
public class Array {
    public static void main(String[] args) {
        arraySum();
    }

    public static void arraySum() {
        int[] numArray = {1,2,3,4,5};
        int sum= IntStream.of(numArray).sum();

        System.out.println("Sum is " + sum);
    }
}
