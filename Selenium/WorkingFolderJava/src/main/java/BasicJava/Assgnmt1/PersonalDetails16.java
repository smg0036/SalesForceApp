package BasicJava.Assgnmt1;

import java.util.Scanner;

public class PersonalDetails16 {

    public static void main(String[] args) {
        String name= " ";
        int age=0;
        char gender = 'm';
        String aadharNo=" ";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person: ");
        name=sc.next();
        System.out.println("Please enter the age: ");
        age=sc.nextInt();
        System.out.println("Please enter the gender: ");
        gender=sc.next().charAt(0);
        System.out.println("Please enter the Aadhar number: ");
        aadharNo=sc.next();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("AadharNo: "+aadharNo);

    }
}
