public class MergeString {
    public static void main(String[] args) {
        String s1 = "pixel";
        String s2 = "Apples"; //pAiPxpelles
        String result = "";

        int max = Math.max(s1.length(),s2.length());

        System.out.println(max);

        for(int i = 0;i<max;i++){
            if(i<s1.length())
                result +=s1.charAt(i); 

            if(i<s2.length())
            result +=s2.charAt(i);
                
        }

        System.out.println(result);

    }
}
