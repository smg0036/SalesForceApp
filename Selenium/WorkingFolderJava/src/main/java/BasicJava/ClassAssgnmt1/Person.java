package BasicJava.ClassAssgnmt1;

public class Person {
    String fulllName;
    int age;

    public void eat(){
         System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}

class Student extends Person{

}

class Employee extends Person{

}
class ITStudent extends Student{

}
class MathStudent extends Student{

}
class Driver extends Employee{

}
class Engineer extends Employee{

}
