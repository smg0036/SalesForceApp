package BasicJava.Assignment10;

import java.util.*;

public class SortStudents {

    static List<Student> students = new ArrayList<Student>();

    static void sortByName(){

        Iterator<Student> it = students.iterator();



        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    public static void main(String[] args) {

        students.add(new Student(52,"sasha",3.85));
        students.add(new Student(14,"robin",4.12));
        students.add(new Student(26,"cindy",3.5));
        students.add(new Student(70,"brad",3.89));
        students.add(new Student(35,"sasha",4.0));

        sortByName();

    }
}

class Student implements Comparable<Student>{
     String name;
     int id;
     double gpa;

     Student(int id, String name,double gpa){
         this.id=id;
         this.name = name;
         this.gpa=gpa;
     }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id + '\'' +
                ",gpa="+gpa+'}';
    }
    public int compareTo(Student o){
         return this.name.compareTo(o.name);
    }

}
