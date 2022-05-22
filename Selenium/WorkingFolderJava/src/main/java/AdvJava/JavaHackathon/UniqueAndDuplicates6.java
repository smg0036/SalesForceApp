package AdvJava.JavaHackathon;
import java.util.*;
public class UniqueAndDuplicates6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total number of integers");
        int num = sc.nextInt();
        int[] arrayOfInt = new int[num];
        System.out.println("Please enter "+num+" integer values: ");
        for(int i=0;i<num;i++){ arrayOfInt[i]=sc.nextInt(); }
        Integer[] intOb = new Integer[arrayOfInt.length];
        for(int i=0;i<intOb.length;i++) { intOb[i] =(Integer) arrayOfInt[i]; }
        Set<Integer> targetSet = new HashSet<Integer>();
        Collections.addAll(targetSet, intOb);
        Iterator<Integer> it = targetSet.iterator();
        while (it.hasNext()) {
            int count=0;
            int c=(int)it.next();
            for(int j=0;j<intOb.length;j++) {
                if(c==arrayOfInt[j]){
                    count++;
                }
            }
            if(count==1){ System.out.println("The element "+c+" is unique");
            }else { System.out.println(c + " appeared " + count + " times");}
        }
    }
}


