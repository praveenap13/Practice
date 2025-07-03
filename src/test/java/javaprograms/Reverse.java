package javaprograms;

public class Reverse {


    public static void main(String[] args) {
        int num=123,rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            System.out.print(num%10);
            num= num/0;
        }
        System.out.println();
        System.out.println(rev);
    }
}
