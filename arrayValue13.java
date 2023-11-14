import java.util.Scanner;

/**
 * arrayValue13
 */
public class arrayValue13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner (System.in);
        int [] finalscore = new int[10];
        
        for (int i = 0; i < finalscore.length; i++) {
            System.out.print("Enter the final score " + i + " : ");
            finalscore[i] = input13.nextInt();
        }
        //for (int i = 0; i < 10; i++) {
            //System.out.print("Enter the final score " + i + " : ");
            //finalscore[i] = input13.nextInt();
        //}
        //for (int i = 0; i < 10; i++) {
            //System.out.println("Final score " + i + " is " + finalscore[i]);
        //}
        for (int i = 0; i < finalscore.length; i++) {
            if (finalscore[i] > 70) {
                System.out.println("Student " + i + " Passed! ");
            } else if (finalscore[i] <70) {
                System.out.println("Student " + i + " Failed! "); 
            }
        }
    }
}