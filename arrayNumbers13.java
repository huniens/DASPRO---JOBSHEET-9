/**
 * arrayNumbers13
 */
public class arrayNumbers13 {

    public static void main(String[] args) {
    
        double[] num = new double[4];
        num[0] = 5.0;
        num[1] = 12867;
        num[2] = 7.5;
        num[3] = 2000000;

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.err.println(num[3]);

        for (int i = 0; i <= 4; i++){
            System.out.println(num[i]);
        }
    }
}