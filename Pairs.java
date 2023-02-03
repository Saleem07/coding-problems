import java.util.Scanner;

public class Pairs {

    static int pairMatch(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i <= arr.length - 1 ; i++) {
            for(int j = 0;j<=arr.length - 1 ;j++){
                if(arr[i] - arr[j] == k){
                    count++;
                }
            }
           
        } //5 2  
       // 1 5 3 4 2  
       // 0 1 2 3 4 
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int result = pairMatch(arr, k);
        System.out.println(result);

    }
}
