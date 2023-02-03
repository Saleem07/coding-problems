import java.util.Scanner;

public class Ratio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        printRatios(arr);
        sc.close();
    }

     static void printRatios(int[] arr) {
        int len = arr.length;
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;
        for (int i = 0; i < len; i++) {
            if(arr[i] > 0){
                positiveCount++;
            }
            if(arr[i] < 0){
                negativeCount++;
            }
            if(arr[i] == 0){
                zeroCount++;
            }

        }
        System.out.printf("%1.6f ", positiveCount / len);
        System.out.printf("%1.6f ", negativeCount / len);
        System.out.printf("%1.6f ", zeroCount / len);
        System.out.println();
    }

  
}