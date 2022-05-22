package BasicJava.Assgnmt1;

public class Patterns23 {

    //Write java programs to print the following patterns:
    // P1) 1234512345123451234512345
    //P2)1111122222333334444455555
    //P3)1111111111
    //P4)1111111111111111
    //P5) 123451234123121
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int num=1;

        while(j<=5) {

            while (i <= 5) {
                System.out.print(num);
                i++;
                num++;
            }
            i=1;
            num=1;
            j++;
        }
        System.out.println();

      j=1;
      i=1;

        while(j<=5) {
            while (i <= 5) {
                System.out.print(num);
                i++;
            }
            num++;
            j++;
        }
        System.out.println();
        num=1;
        i=1;
        while(i<=10){
            System.out .print(num);
            i++;
        }
        System.out.println();
        i=1;
        num=1;
        while(i<=16){
            System.out .print(num);
            i++;
        }

        System.out.println();

        j=1;
        int a = 5;

        while(j<=5) {
            num=1;
            i=1;
            while (i<=a) {
                System.out.print(num);
                num++;
                i++;
            }
            a--;
            j++;
        }




    }
}
