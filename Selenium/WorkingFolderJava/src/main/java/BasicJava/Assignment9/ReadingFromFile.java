package BasicJava.Assignment9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String str=null;

            File f = new File("C:/Users/srini/Desktop/WorkingFolderJava/resources/data.txt");

        PrintWriter writer = new PrintWriter(System.out);
        int lineNumber =1;

        Scanner sc =new Scanner(f);
            while(sc.hasNextLine()){
               str=sc.nextLine();
                writer.write(str);
               lineNumber++;
            }

    }
}
