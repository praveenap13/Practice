package javaprograms;

public class ReplacecharInString {
    public static void main(String[] args) {
        String s="tomorrow";
        //output="t$m$$rr$$$w"
        String s1="\\$";

        int len=s.length();
        for(int i=0;i<len;i++) {
            if(s.charAt(i)==('o'))
            {
                s=s.replaceFirst("[o]", s1);
                s1=s1.concat("\\$");
            }

        }
        System.out.println(s);
    }
}
