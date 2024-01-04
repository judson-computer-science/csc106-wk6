// this example illustrates the use of the sort() method in the Arrays class
import java.util.Arrays;

public class SortArray {
  public static void main(String[] args) {
    // Create an array of integers
    int[] numbers = {5, 3, 8, 1, 9, 6};

    // Create a copy of the array (optional)
    int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);

    // Sort the copy of the array in ascending order
    Arrays.sort(numbersCopy);

    // Print the sorted array
    for (int i = 0; i < numbersCopy.length; i++) {
      System.out.print(numbersCopy[i] + " ");
    }
  }
}
