import java.util.LinkedHashMap;
import java.util.Map;

public class IntToRoman {
    public static String convertIntToRoman(int num) {
        Map<String, Integer> mp = new LinkedHashMap<>();
        mp.put("M", 1000); // largest to smallest
        mp.put("CM", 900);
        mp.put("D", 500);
        mp.put("CD", 400);
        mp.put("C", 100);
        mp.put("XC", 90);
        mp.put("L", 50);
        mp.put("XL", 40);
        mp.put("X", 10);
        mp.put("IX", 9);
        mp.put("V", 5);
        mp.put("IV", 4);
        mp.put("I", 1);

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            while (num >= entry.getValue()) { // 45 >= 40, 5 >= 5
                num = num - entry.getValue(); // num = 45 - 40 = 5; 5 - 5 = 0
                sb.append(entry.getKey()); // XLV
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertIntToRoman(45));
    }
}
