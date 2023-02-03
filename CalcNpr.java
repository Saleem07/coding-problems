import java.util.*;

public class CalcNpr {

    static int getValueInBase(int n, int r) {
        // calculate npr = n!/(n-r)!
        int result2 = 1;
        int result1 = 1;

        for (int i = n; i > 0; i--) {
            result2 = result2 * i;
        }

        for (int j = n - r; j > 0; j--) {
            result1 = result1 * j;
        }

        return result2 / result1;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
    }
}
