package BasicJava.Assignment6;

public class LongPalindrome {
    public static void main(String[] args) {
        String palindrome = "malayalam";
        isPalindrome(palindrome);
    }
    public static void isPalindrome(String str){
        String answ = "thing";
        for(int i=3; i<=str.length();i++){
            for(int f=0; f<=(str.length()-i);f++){
                String temp1 = str.substring(f, f+i);
                String temp2 = reverse(temp1);
                if (temp1.equalsIgnoreCase(temp2)){
                    answ = temp1;
                }
            }
        }
        System.out.println("The biggest palindrome is " + answ);
    }
    public static String reverse(String inp){
        StringBuffer sb = new StringBuffer(inp);
        String ans = sb.reverse().toString();
        return ans;
    }
}
