import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            int ans = binDec(s);
            System.out.println(ans);
            t -= 1;
        }  
        sc.close();
    }

    private static int binDec(String s) {
        return Integer.parseInt(s, 2);
    }
}
