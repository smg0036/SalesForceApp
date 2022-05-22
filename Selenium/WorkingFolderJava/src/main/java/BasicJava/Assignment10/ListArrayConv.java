package BasicJava.Assignment10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Solution to question 1 and 2
public class ListArrayConv {


        public static void main(String[] args)
        {
            List<Integer> al = new ArrayList<Integer>();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);

            Object[] objects = al.toArray();//list to array conversion

            // Printing array of objects
            for (Object obj : objects)
                System.out.print(obj + " ");

            List intList = Arrays.asList(objects);
            System.out.println(intList);
            System.out.println("The length of intList is: "+intList.size());

    }
}
