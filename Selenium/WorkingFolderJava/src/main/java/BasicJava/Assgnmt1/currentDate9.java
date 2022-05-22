package BasicJava.Assgnmt1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class currentDate9 {

    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }
}
