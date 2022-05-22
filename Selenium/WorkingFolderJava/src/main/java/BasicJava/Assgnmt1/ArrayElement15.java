package BasicJava.Assgnmt1;

import java.util.Scanner;

public class ArrayElement15 {
    public static void main(String[] args) {

        int index=0;
        char[] ch = {'a', 'b', 'c', 'd','e','f'};

        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose any array index from 0 to 5: ");
        index=sc.nextInt();

        switch(index){
            case 0:
                System.out.println("The element is: a");
                break;
            case 1:
                System.out.println("The element is: b");
                break;
            case 2:
                System.out.println("The element is: c");
                break;
            case 3:
                System.out.println("The element is: d");
                break;
            case 4:
                System.out.println("The element is: e");
                break;
            case 5:
                System.out.println("The element is: f");
                break;
            default:
                System.out.println("WRONG INDEX!");
                break;
        }
    }
}
