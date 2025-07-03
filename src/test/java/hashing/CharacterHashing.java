package hashing;

import java.util.Arrays;

public class CharacterHashing {

    public static void main(String[] args) {
//lowercase character array ,all character number is 26
        String s="abcgdtrhby";
       char[] alphabets= s.toCharArray();
        char[] ch=new char[26];
        int[] ch2=new int[26];
        char[] ch3=new char[256];
        Arrays.fill(ch,'0');
        Arrays.fill(ch2,0);
        Arrays.fill(ch3,'0');
         for(int i=0;i<s.length();i++){
            char character =   s.charAt(i);
            int index= character - 'a';//97
              ch[index]= s.charAt(i);
             ch2[index] +=1;

             ch3[alphabets[i]] +=1;
         }
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch2));
        System.out.println(Arrays.toString(ch3));
    }
}
