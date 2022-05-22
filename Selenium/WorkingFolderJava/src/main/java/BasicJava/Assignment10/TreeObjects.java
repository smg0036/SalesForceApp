package BasicJava.Assignment10;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Consider student class with name and sem attribute and Library class with libNum and totalBooks attributes.
// Store 5 Library objects as key and Student object as value in TreeMap object and print the content
public class TreeObjects {

    static TreeMap<Library,Student1> tmp  = new TreeMap<>();
    public static void main(String[] args) {
        tmp.put(new Library("3251", 5), new Student1("sonia", "one"));
        tmp.put(new Library("4362", 10), new Student1("albert", "two"));
        tmp.put(new Library("3856", 6), new Student1("lauren", "one"));
        tmp.put(new Library("4022", 2), new Student1("peter", "three"));
        tmp.put(new Library("4689", 10), new Student1("kirti", "four"));

       Set <Map.Entry<Library,Student1>> entries=tmp.entrySet();

        for(Map.Entry<Library,Student1> entry:entries){
            System.out.println("Library info : "+entry.getKey()+" Student info : "+entry.getValue());
        }
    }
}

class Student1 implements Comparable<Student1> {
    String name;
    String sem;

    Student1(String name, String sem){
        this.name = name;
        this.sem = sem;
    }

    public String toString(){
        return "Student name = "+name+" , Semester = "+sem;
    }
    @Override
    public int compareTo(Student1 obj)
    {
// we sort objects on the basis of Student Name using compareTo of String Class
        return this.name.compareTo(obj.name);
    }

}

class Library implements Comparable<Library>{
      String libNum;
      int totalBooks;

      Library(String libNum, int totalBooks){
          this.libNum=libNum;
          this.totalBooks=totalBooks;
      }
    public String toString(){
        return "Library number = "+libNum+" , Total number of books = "+totalBooks;
    }


    @Override
    public int compareTo(Library o) {
        return this.libNum.compareTo(o.libNum);
    }
}