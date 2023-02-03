import java.util.Scanner;



public class CountNumber {
    static int countFreqDigit(int n , int d){
        int count = 0;
        while(n!=0){
            if(n%10 == d)
                count++;
            n = n/10;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int d= sc.nextInt();
        System.out.println(countFreqDigit(n,d));
        sc.close();
        //1111221 1 -> 5 
    }
}
