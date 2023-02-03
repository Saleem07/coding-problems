import java.util.*;

public class SecondLast {

    public static boolean determineSecondLastDigit(int n) {
        // write code here
        // 100 // 102 - isme 0 second last place pr hai - true
        // 110, 11
        // i can get the remainder and count for second last value
        // if the count = 2 and remainder = 0 return true, else false

        int count = 0;
        int rem = 0;
        boolean flag = false;
        while (n != 0) {
            rem = n % 10;
            count++;
            if (count == 2 && rem == 0) {
                flag = true;
                break;
            } else {
                flag = false;
            }
            n = n / 10;

        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean res = determineSecondLastDigit(n);
        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
