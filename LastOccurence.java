import java.util.Scanner;

public class LastOccurence {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int element = sc.nextInt();
        int arr[] =  new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        //apna code 

        int result = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == element){
                // result = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j] == result){
                        result = j;
                        // element = 0;
                    }
                }
            }
         
        }
        System.out.println(result);


    }
}