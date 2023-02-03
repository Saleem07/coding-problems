// Last index of One
// Given a string S consisting only 0s and 1s, find the last index of the 1 present in it.

// Input Format
// The only line contains a string S.

// Output Format
// Print the last index of 1. If 1 is not present in the string, print -1

// Example 1
// Input

// 00001
// Output

// 4
// Explanation 1

// Last index of 1 is 4

// Example 2
// Input

// 00000
// Output

// -1



import java.util.Scanner;

public class IndexOfOne {

    public static int lastIndexOfOne(String S) {
        // Write your code here
        
		return S.lastIndexOf('1');
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(lastIndexOfOne(S));
    }
}
