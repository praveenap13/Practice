package recursoin;

public class PrintName {

public static void printNameNtimes(String name ,int repeat){
    if(repeat>0) {
        System.out.println(name);
        repeat--;
        printNameNtimes(name,repeat);
    }
}

public static void printFrom1ToN(int i,int repeat){
    if(i>repeat){
        return;
    }
    System.out.println(i);
    printFrom1ToN(i+1,repeat);
}
    public static void printFromNToN(int i,int repeat){
        if(i==0){
            return;
        }
        System.out.println(i);
        printFromNToN(i-1,repeat);
    }
    public static void parameterizedRecursionSum(int num,int sum){

        if(num<1){
            System.out.println(sum);
            return;
        }
        parameterizedRecursionSum(num-1,sum+num);

    }
    public static int functionalRecursionSum(int num){
        int sum=0;
        if(num==0){
            return 0;
        }

      return num + functionalRecursionSum(num-1);

    }

    public static int functionalRecursionFact(int num){
        if(num==0){
            return 1;
        }

        return num * functionalRecursionSum(num-1);

    }

    public static boolean palindrome(int i,String s){

        if(i >= (s.length()/2))  return true;
            if(s.charAt(i) != s.charAt(s.length()-i-1) )
       return false;
         return palindrome(i+1,s);

    }

    public static int fibo(int n){
      if(n<=1) return n;
       int last=fibo(n-1);
        int slast=fibo(n-2);
        return last + slast;
    }

    public static void main(String[] args) {
        //printNameNtimes("praveena",2);
       // printFrom1ToN(1,10);
        int n=4;
     //   printFromNToN(n,n);
        int num=10,sum=0;
     //   parameterizedRecursionSum(num,sum);

     //   System.out.println(functionalRecursionSum(10));

     //   System.out.println( functionalRecursionFact(10));
        
        System.out.println(   palindrome(0,"madam"));
    }
}
