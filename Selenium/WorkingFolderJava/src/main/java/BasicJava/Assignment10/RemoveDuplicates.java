package BasicJava.Assignment10;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String[] stationary ={"books","stencils","books","backpacks","calculators"};
        List<String> items = Arrays.asList(stationary);
        Set<String> unique = new HashSet<String>(items);
        Iterator it = unique.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
