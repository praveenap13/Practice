package javaprograms;

public class Stringmagic {
    public static void main(String[] args) {
        String s="abcd";
       int len= s.length()-1;
       System.out.println(len);
       String s1= s.substring(len)  +  s.substring(0,len);
       System.out.println(s1);
    }
}
