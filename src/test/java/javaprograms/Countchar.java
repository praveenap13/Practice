package javaprograms;

public class Countchar {
    public static void main(String[] args) {
        String str="I am a programmer";
        int count=0;
        for(int i=0;i<str.length();i++) {
            count=0;
            for(int j=0;j<str.length();j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            
        }

//        for(char c1:str.toCharArray()) {
//            System.out.println( c1 +" "+count);
//        }

    }

}
