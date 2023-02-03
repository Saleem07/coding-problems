import java.util.Scanner;

// Largest Number At Least Twice of Others
// You are given an integer array nums where the largest integer is unique.

// Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, print the index of the largest element, or print -1 otherwise.

// Input Format
// The first line of the input contains the number n(length of the array),

// The next n space separated integers denote the elements of the array.

// Output Format
// Print the index of the element if it satisfies the condition else print -1

// Example 1
// Input

// 4
// 3 6 1 0
// Output

// 1
// Explanation

// Largest element is 6, which is twice of next largest element 3, hence we print it's index which is 1.

// Example 2
// Input

// 4
// 1 2 3 4
// Output

// -1
// Explanation

// 4 is the largest element and 3 is the next largest element. Clearly 4 is not at least twice of 3, hence we print -1.

public class Largest {

    public static int LargestElement(int arr[], int n) {
        int count = 0;
        int largestNum = arr[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largestNum) {
                largestNum = arr[i];
                index = i;
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == largestNum) {
                continue;
            }
            if (arr[i] * 2 <= largestNum) {
                count++;
            }
        }
        if (count == arr.length - 1) {
            return index;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(LargestElement(nums, n));
    }
}
