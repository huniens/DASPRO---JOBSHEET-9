import java.util.Scanner;

/**
 * CinemaWithScanner13
 */
public class CinemaWithScanner13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner (System.in);
        //Declare 
        int row;
        int column;
        String name;
        String next;

        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1-3): ");
            int choice = input13.nextInt();
            input13.nextLine(); // Consume the newline character

        switch (choice) {
                case 1:
                    // Menu 1: Input audience data
                    System.out.print("Enter a name: ");
                    name = input13.nextLine();

                    // Validate and handle invalid row number
                    do {
                        System.out.print("Enter row number: ");
                        row = input13.nextInt();
                        input13.nextLine(); // Consume the newline character

                        if (row < 1 || row > audience.length) {
                            System.out.println("Invalid row number. Please enter a valid row number.");
                        }
                    } while (row < 1 || row > audience.length);

                    // Validate and handle invalid column number
                    do {
                        System.out.print("Enter column number: ");
                        column = input13.nextInt();
                        input13.nextLine(); // Consume the newline character

                        if (column < 1 || column > audience[0].length) {
                            System.out.println("Invalid column number. Please enter a valid column number.");
                        }
                    } while (column < 1 || column > audience[0].length);

                    // Check if the seat is already occupied
                    if (audience[row - 1][column - 1] != null) {
                        System.out.println("Warning: The selected seat is already occupied by another audience.");
                        System.out.println("Please choose another seat.");
                        continue; // Prompt the user to enter data again
                    }

                    // If the seat is available, update the audience array
                    audience[row - 1][column - 1] = name;
                    System.out.println("Audience data added successfully.");
                    
                    System.out.print("Are there any other audiences to be added? (y/n): ");
                    next = input13.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                    break;

                case 2:
                    // Menu 2: Show audience list
                    System.out.println("Audience List:");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(audience[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Menu 3: Exit
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}