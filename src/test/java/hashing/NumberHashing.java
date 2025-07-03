package hashing;

import java.util.Arrays;

public class NumberHashing {

    public static void main(String[] args) {
        int[] arr={1,2,1,3,2,4,7};

        int[] hash=new int[12];
        Arrays.fill(hash,0);

        for(int i=0;i<arr.length;i++){
         //  int index=  arr[i];
            hash[arr[i]] +=1;
//            if (hash[index] == 0) {
//                    hash[index] = 1;
//                } else if(hash[index]>=1) {
//                    hash[index] = ++hash[index];
//                }
        }
       System.out.println(Arrays.toString(hash));
        System.out.println("number one count in array  "+hash[1]);
       // int[] hash2=new int[100000000];//9 ok beyond 9 gives memory error
       // int[] hash3=new int[1000000000];
        /*
        Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at hashing.NumberHashing.main(NumberHashing.java:25)
         */
      //  System.out.println(Arrays.toString(hash2));

    }
}
