public class CharPattern {
    public static void main(String[] args) {
        int alpha = 65;
        int n = 24;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = alpha + i;
            for (int j = 0; j <= i; j++) {
                if(sum>90){
                    sum = 65;
                }
                System.out.print((char) sum);
                sum++;         
            }                 
             System.out.println();
        }
    }
}
