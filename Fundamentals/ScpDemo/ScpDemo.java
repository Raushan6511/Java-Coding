package Fundamentals.ScpDemo;

public class ScpDemo {
    public static void main(String[] args) {
        // demo 1
        // String s1 = new String("you cannot change me!");
        // String s2 = new String("you cannot change me!");
        // System.out.println(s1==s2);	// false
        // String s3 = "you cannot change me!";
        // System.out.println(s1==s3);	// false
        // String s4 =  "you cannot change me!";
        // System.out.println(s3==s4);// true
        // String s5 = "you cannot "+"change me!";
        // System.out.println(s3==s5); // true
        // String s6 = "you cannot ";
        // String s7 = s6 + "change me!";
        // System.out.println(s3==s7);	//false
        // final String s8 = "you cannot ";
        // String s9 = s8 + "change me!";
        // System.out.println(s3==s9); // true
        // System.out.println(s6==s8); // true

        // demo2
        String s1 = new String("durga");
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        System.out.println(s1==s2); // false
        System.out.println( s3==s1);    // true
        System.out.println( s3==s2);    // false


    }
}
