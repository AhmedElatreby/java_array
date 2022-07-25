import java.lang.reflect.Array;
import java.util.Arrays;

public class PracticeArrays {

    public static void main(String[] args) {

        double[] arr = { 92, 12, 38, 74 };
        for (int i = 0; i < arr.length; i++) { // loop through the array
            System.out.println(arr[i]);
        }

        System.out.println();

        for (int i = arr.length -1; i >=0; i--) { // loop through the array backward
            System.out.println(arr[i]);
        }

        System.out.println();

        for (int i = arr.length -1; i >=0; i = i - 2) { // loop through the array backward by two numbers
            System.out.println(arr[i]);
        }

        System.out.println();

        for (double item : arr) {       //use foreach
            System.out.println(item);
        }

        System.out.println();

        Arrays.stream(arr).forEach(System.out::println); // use Arrays.stream

    }
}
