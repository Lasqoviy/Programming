import static java.lang.Math.*;
import java.util.Random;
public class lab_01 {
    public static void main(String[] args) {
        short[] a = new short[10];
        short k = 22;
        for (int i = 0; i < a.length; i++) {
            a[i] = k;
            k -= 2;
            //System.out.println(a[i]);
        }
        double[] x = new double[12];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            x[1] = rand.nextDouble(7) - 14;
        }
        double[][] s = new double[10][12];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                if (a[i] == 18) {
                    s[i][j] = pow((atan(cos(x[j]))) / 0.5, 3);
                } else if (a[i] == 4 | a[i] == 6 | a[i] == 8 | a[i] == 10 | a[i] == 14) {
                    s[i][j] = pow((PI + asin((x[j] - 3.5) / 21)) / 4, 3);
                } else s[i][j] = cos(log((5 + pow(cos(x[j]), 2)) / 3));
            }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.printf("%.5f\t", s[i][j]);
            }
            System.out.println(" ");
        }
    }
}