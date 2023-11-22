import java.util.Scanner;
/**
 * LinearSearchEdit
 */
public class LinearSearchEdit {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        // Get the number of array elements
        System.out.print("Enter the number of array elements: ");
        int size = input13.nextInt();

        // Initialize the array with the specified size
        int[] arrayInt = new int[size];

        // Get the array elements from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = input13.nextInt();
        }

        // Get the key to search for
        System.out.print("Enter the key you want to search for: ");
        int key = input13.nextInt();

        // Perform the search
        int result = -1; // Initialize result to -1 to indicate key not found
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }

        // Print the result
        if (result != -1) {
            System.out.println("The key in the array is located at index position " + result);
        }

        // Close the scanner
        input13.close();
    }
}
