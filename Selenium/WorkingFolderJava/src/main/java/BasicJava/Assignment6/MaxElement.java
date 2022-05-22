package BasicJava.Assignment6;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {4,3,18,2,1,13,6};

        int max=0;
        int first=arr[0];
        int next=arr[1];
        if (first<next){
            max=next;
        }
        else{
            max=first;
        }
        for(int i=2;i<=(arr.length-1);i++) {

            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The maximum element in the array is "+max);
    }
}
