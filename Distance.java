// Write a program to find out the shortest distance between two even positive integers in an array arr and print the distance. If there is one or zero even positive integer in the array then return -1.

// Note that if the index of one even positive integer is i and the index of another even positive integer is j then their distance will be |i-j|.
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
       int result =  problem(n, arr);
       System.out.println(result);
    }

    public static int problem(int n,int arr[]){
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0 && arr[i] > 0){
                for(int j = i+1;j<n;j++){
                    if(arr[j] % 2 == 0 && arr[j] > 0){
                        int diff =  j - i;
                        if(diff < ans){
                            ans  =  diff;
                        }
                    }
                }
            }
        }
        
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }else{
           return ans; 
        }
    }
}
