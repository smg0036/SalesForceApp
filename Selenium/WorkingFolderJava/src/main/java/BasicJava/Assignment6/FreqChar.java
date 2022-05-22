package BasicJava.Assignment6;
public class FreqChar {
    public static void main(String[] args) {
        String str ="programming";
        char[] ch=str.toCharArray();
        String letrs ="abcdefghijklmnopqrstuvwxyz";
        char[] ch1= letrs.toCharArray();
        int[] counter={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for(char c: ch) {
            for (char h : ch1) {
                if(c==h){
                    counter[convrt(c, ch1)]++;
                }
            }
        }
        for(int i=0;i<counter.length;i++){
            if(counter[i]>0){
                System.out.println("Letter " + ch1[i] + " is present " + counter[i] + " times.");
            }
        }
    }
    public static int convrt(char letr, char[] dict){
        int count=0;
        for(char ch: dict){
            count++;
            if(letr==ch){
                return count-1;
            }
        }
        return 0;
    }
}
