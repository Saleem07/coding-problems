public class ArmstrongInRange {
    public static void main(String[] args) {
        int r1 = 1;
        int r2 = 10000;
        // get the count

        for (int i = r1; i <= r2; i++) {
            int rem = 0;
            int sum = 0;
            int power = 0;
            int check = i;
            // get the count
            while (check != 0) {
                check /= 10;
                power++;
            }
            check = i;
            while (check > 0) {
                rem = check % 10;
                sum += (int) Math.pow(rem, power);
                check /= 10;
            }
            if (sum == i) {
                System.out.print(sum + " ");
            }

        }

        // for (int i = r1; i <= r2; i++) {
        // int rem = 0;
        // int sum = 0;
        // int check = i;
        // while (check > 0) {
        // rem = check % 10;
        // sum += (int) Math.pow(rem, 3);
        // check /= 10;
        // }
        // if (sum == i) {
        // System.out.println(sum + " is an armstrong no.");
        // }
        // }

    }
}
