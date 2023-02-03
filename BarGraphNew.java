public class BarGraphNew {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int max = arr[0];
        for(int i = 1;i<n;i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for(int j = max;j>0;j--){
            for(int i = 0;i<n;i++){
                if(arr[i] >= j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
