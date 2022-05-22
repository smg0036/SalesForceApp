package BasicJava.Assignment10;
//INCOMPLETE
import java.util.*;

public class FreqCharInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = sc.next();
        char[] inputChar = input.toCharArray();
        Arrays.sort(inputChar);
        for(char c:inputChar){
            System.out.print(c);
        }
        int i=0;
        int freq = 1;
        for(i=0;i<inputChar.length;i++){

            if(inputChar[i]==inputChar[i+1]){
                freq+=i;
            }else{
                System.out.println("The frequency of "+inputChar[i]+" is "+freq);
            }
        }


    }
}
