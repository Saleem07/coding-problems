public class PrimeAgain {
  
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for(int i = 1;i<=n;i++){
            if (n % i == 0) {
                System.out.println(i);
                count++;
            }   
        }
        System.out.println(count);
        if (count == 2) {
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + " is not a prime number");
        }
    
    }
}
