package BasicJava.Assignment4;
public class StringOp1 {
    public static void main(String[] args) {
        int i =1;
        String s = Integer.toString(i);

        String s1 = "java";
        char[] ch= s1.toCharArray();
        char a = s1.charAt(1);

        int index=s1.indexOf('v');
        String s2=s1.substring(0,1);

        boolean b =s1.contains("av");

        String s3= "JAVA";
        boolean b1 = s1.equalsIgnoreCase(s3);

        String s4 ="Java is a programming language";
        String[] str=s4.split(" ");
        System.out.println("The number of words in s4 are "+str.length);

        String s5=s4.replace("a","");
        System.out.println(s5);
    }
}
