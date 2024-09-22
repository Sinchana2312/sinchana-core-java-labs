import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseAndSortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int len = scanner.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] sortedArray = getSorted(arr);
        System.out.println("Sorted array after reversing the numbers:");
        System.out.println(Arrays.toString(sortedArray));
        scanner.close();
    }

    static int[] getSorted(int[] arr) {
        String[] reversedStrings = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedStrings[i] = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
        }

        Integer[] reversedInts = Arrays.stream(reversedStrings)
                                       .map(Integer::parseInt)
                                       .toArray(Integer[]::new);

        Arrays.sort(reversedInts, Collections.reverseOrder());
        
        return Arrays.stream(reversedInts)
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}
