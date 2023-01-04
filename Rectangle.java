public class Rectangle {
    public static void main(String[] args) {
        // printing a rectangle of stars
        // the outer loop is responsible for the rows
        // the inner loop for columns
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
