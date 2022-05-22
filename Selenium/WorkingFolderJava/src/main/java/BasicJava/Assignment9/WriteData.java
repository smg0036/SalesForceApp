package BasicJava.Assignment9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer =null;
        writer = new PrintWriter(new File("C:\\Users\\srini\\Desktop\\WorkingFolderJava\\resources\\data.txt"));
        writer.write("hi i am in tekarch training");
        writer.flush();
        writer.close();
    }
}
