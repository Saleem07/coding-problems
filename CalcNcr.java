import java.util.Scanner;

public class CalcNcr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();
        long ans = calculate_nCr(n, r);
        System.out.print(ans);
    }

    private static long calculate_nCr(int n, int r) {
        // nCr = (n!) / (r! * (n-r)!)
        long nfact = 1;
        long rfact = 1;
        long nrfact = 1;

        for (int i = n; i > 0; i--) {
            nfact = nfact * i;
        }

        for (int i = n - r; i > 0; i--) {
            nrfact = nrfact * i;
        }

        for (int i = r; i > 0; i--) {
            rfact = rfact * i;
        }

        return nfact / (rfact * nrfact);
    }
}
