import java.util.Arrays;

public class PracticeArrays {

    public static void main(String[] args) {

        double[] arr = { 92, 12, 38, 74 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        for (int i = arr.length - 1; i >= 0; i = i - 2) {
            System.out.println(arr[i]);
        }

        for (double item : arr) {
            System.out.println(item);
        }

        // Java Streams
        Arrays.stream(arr).forEach(System.out::println);

        //Arrays.stream(arr).
    }
}
