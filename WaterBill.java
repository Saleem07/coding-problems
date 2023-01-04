// In this task, you need to identify the water bill for a household
// You are given the total liter of water used by a house and output the total water bill. The water bill is calculated as follows:
// For first 100 litres: Rs. 15 per litre
// For next 100 litres: Rs. 14 per litre
// After 200 litres: Rs. 12 per litre

// Input Format
// the first and only line of input is the number of liters of water used

// Output Format
// return the total bill of the house based on given conditions

// Example 1
// Input

// 105
// Output

// 1570
// Explanation

// We add 15*100 for first 100 litres then 5*14 for the next 5 litres therefore total is 1570
import java.util.*;

class WaterBill {

    public static void calculateBill(int litres) {
        int sum = 0;
        int min1, min2;
        if (litres <= 100) {
            sum = litres * 15;
            System.out.println(sum);
        } else if (litres > 100 && litres <= 200) {
            min1 = litres - 100;
            sum = (100 * 15) + (min1 * 14);
            System.out.println(sum);
        } else {
            min2 = litres - 200;
            sum = (100 * 15) + (100 * 14) + (min2 * 12);
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of litres");
        int litres = scan.nextInt();
        calculateBill(litres);
        scan.close();

    }
}