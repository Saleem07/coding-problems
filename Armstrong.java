public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int copy = num;
        int sum = 0;
        while(copy!=0){
            int rem = copy % 10;
            sum += (int)Math.pow(rem,3);
            copy/=10;
        }
        
        System.out.println(sum == num);
    }
}
