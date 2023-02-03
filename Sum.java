// Sum of Digits
// You are given a number. Your task is to find the sum of all the digits in the number.

// Input Format
// The only line of input contains a number.

// Output Format
// Print the sum of digits of the given number.

// Example 1
// Input

// 1873
// Output

// 19
// Explanation

// 1+8+7+3 = 19. Hence the output should be 19.


import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int rev = 0;
        int sum = 0;
        while(n!=0){
            rev = n%10;
            sum+=rev;
            n/=10;
        }
        System.out.println(sum);
    }
}
