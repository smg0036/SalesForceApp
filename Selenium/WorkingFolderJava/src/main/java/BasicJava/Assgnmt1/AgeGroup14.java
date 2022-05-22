package BasicJava.Assgnmt1;

import java.util.Scanner;

public class AgeGroup14 {

    /*Write the java program to print age group depending on the age value enteredIf age<=2 then age group is toddler
    If age>2 and age<=10 then age group is kidIf age>10 and age<=18 then childrenIf age>18 and age<=30 then young adult
    If age>30 and age<=45 then adultIg age>45 then old adult
     */
    public static void main(String[] args) {
        int age=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the age: ");
        age=sc.nextInt();

        if(age<=2){
            System.out.println("Toddler");
        }
        else if((age>2)&&(age<=10)){
            System.out.println("kid");
        }
        else if((age>10)&&(age<=18)){
            System.out.println("Children");
        }
        else if((age>18)&&(age<=30)){
            System.out.println("Young adult");
        }
        else if((age>30)&&(age<=45)){
            System.out.println("Adult");
        }
        else if(age>45){
            System.out.println("Old Adult");
        }
    }
}
