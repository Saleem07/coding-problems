// Given an integer N, print a diamond full of stars * with height equal to N.

// Note It is given that N is odd.

/*
      *
    * * *
  * * * * *
    * * *
      *   
*/

public class Diamond {
    public static void main(String[] args) {
        // let's print one triangle
        int n = 3;
        for (int i = 1; i <= n; i++) {
            // first triangle
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        int space = 1;
        for (int j = 1; j <= n - 1; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            space++;
            for (int i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
