package BasicJava.Assignment6;

public class AddArrayElements {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of all elements = "+sum);
    }
}
