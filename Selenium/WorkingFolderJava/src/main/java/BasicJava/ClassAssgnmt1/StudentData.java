package BasicJava.ClassAssgnmt1;

public class StudentData {

    int id;
    int marks;

    StudentData(int id, int marks){
        this.id=id;
        this.marks=marks;
    }

    public String toString(){
        return "id ="+id +", marks ="+marks;
    }

}

class StudentArr{

    public static void main(String[] args) {
        StudentData[] s = new StudentData[3];
        s[0]=new StudentData(12, 50);
        s[1]=new StudentData(18, 65);
        s[2]=new StudentData(7, 80);

        for(StudentData arr:s)
        System.out.println(arr);
    }



}
