package javaprograms;

import org.testng.annotations.Test;

public class Reverse {
      @Test
    public void reverse(){
        int num=123,rev=0;
        while(num!=0){
            //rev=rev*10+num%10;
            System.out.print(num%10);
            num= num/0;
        }
    }
}
