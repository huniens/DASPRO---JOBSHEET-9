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
            System.out.print("Enter a name: ");
            name = input13.nextLine();
            System.out.print("Enter row number: ");
            row = input13.nextInt();
            System.out.print("Enter column number: ");
            column = input13.nextInt();
            input13.nextLine();

            audience[row - 1][column - 1] = name;
            System.out.print("Are there any other audiences to be added? (y/n): ");
            next = input13.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
            
        }

    }
}