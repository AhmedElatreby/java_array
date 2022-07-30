import java.util.Arrays;
import java.util.Objects;

public class PracticeArrays {

    public static Integer findSecondSmallestItem(Integer[] arr) {
        // check the array hold more than 2 numbers
        if (arr.length <= 1) {
            return null;
        }
        // sort the array with sort function
        Arrays.sort(arr);

        // check if the item is the second next in the array
        for (int i = 0; i < arr.length -1 ; i++) {
            if (!Objects.equals(arr[i], arr[i+1])) {
                return arr[i+1];
            }
        }

        return null;
    }

    public static void main(String args[]) {

        Integer[] arr = new Integer[]{ 5, 8, 3, 2, 6 };
        System.out.println(findSecondSmallestItem(arr));

        Integer[] arr2 = new Integer[]{ 3, 8, 5, 2, 6 };
        System.out.println(findSecondSmallestItem(arr2));

        Integer[] arr3 = new Integer[]{ 6, 8, 5, 2, 3 };
        System.out.println(findSecondSmallestItem(arr3));

        Integer[] arr4 = new Integer[]{ 3, 3, 3, 3, 3 };
        System.out.println(findSecondSmallestItem(arr4));

        Integer[] arr5 = new Integer[]{ 3, 3, 3, 2, 3 };
        System.out.println(findSecondSmallestItem(arr5));

        Integer[] arr6 = new Integer[]{ 3, 4, 3, 3, 3 };
        System.out.println(findSecondSmallestItem(arr6));

        Integer[] arr7 = new Integer[]{ 3, 3, 3, 3, 4 };
        System.out.println(findSecondSmallestItem(arr7));

        Integer[] arrEmpty = new Integer[] {};
        System.out.println(findSecondSmallestItem(arrEmpty));

        Integer[] arrOne = new Integer[] { 1 };
        System.out.println(findSecondSmallestItem(arrOne));
    }

}
