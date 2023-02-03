import java.util.Scanner;

public class ArraySum {

    public static int[] SumArrayExpectSelf(int[] nums, int n) {
        // Write code here
        // 
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int capture = nums[i];// 4
            for (int j = 0; j < n; j++) {
                if (capture != nums[j]) { // 4,4|
                  sum = sum + nums[j];
                }
            }
            arr[i] = sum;

        }
        return arr;
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
        int[] Ans = SumArrayExpectSelf(nums, n);

        for (int a : Ans)
            System.out.print(a + " ");
    }
}
