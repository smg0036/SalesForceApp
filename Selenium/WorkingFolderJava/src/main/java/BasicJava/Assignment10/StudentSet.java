package BasicJava.Assignment10;

import java.util.*;

public class StudentSet {



    public static void main(String[] args) {
        TreeSet<Student2> ts = new TreeSet<Student2>();
        ts.add(new Student2(52,"sasha",35));
        ts.add(new Student2(14,"robin",20));
        ts.add(new Student2(26,"cindy",42));
        ts.add(new Student2(70,"brad",28));
        ts.add(new Student2(35,"frank",60));


        for(Student2 e:ts){
            System.out.println(e);
        }
 }
}
class Student2 implements Comparable<Student2>{
        int id;
        String name;
        int age;

        Student2(int id,String name,int age){
            this.id=id;
            this.name=name;
            this.age=age;
        }


    public String toString(){
            return "Student name is "+name+" , Student id is "+id+" ,Student age is "+age;
    }
      //store 5 student(id,name,age)object to TreeSet. Maintain the sorted order with respect to name
    @Override
    public int compareTo(Student2 o) {
        return this.name.compareTo(o.name);
    }


}



