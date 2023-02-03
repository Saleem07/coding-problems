// Buildings
// You have given a number n, representing the size of array arr. You are given n numbers, representing elements of array arr.

// You are required to print a bar chart representing value of arr.

// Input Format
// First line consists of an integer n

// Second line consists of n spaced integers, representing elements of arr

// Output Format
// Output the Bar Graph of the array arr

// Example 1
// Input

// 7
// 9 3 7 6 2 0 4
// Output

// *
// *
// *               *
// *               *       *
// *               *       *
// *               *       *                       *
// *       *       *       *                       *
// *       *       *       *       *               *
// *       *       *       *       *               *

public class BarGraph {
    public static void main(String[] args) {
        int arr[] = { 9, 3, 7, 6, 2, 0, 4 };

        int n = arr.length;
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            // get the max value
            if (mx < arr[i]) {
                mx = arr[i];
            }

        }

        // since we got the max number from the array
        // that will be the outer loop condition
        for (int k = mx; k > 0; k--) {
            for (int j = 0; j < n; j++) {
                if (arr[j] >= k) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
//get max value of the array 
// run an outer loop from max value as outer loop
//inside the inner loop check if the current array element >= outer value k
//the outer loop will decrement 
