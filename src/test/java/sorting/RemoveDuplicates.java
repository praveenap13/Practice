package sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void removeDups(int[] arr){
        //remove duplicates from sorted array
        Set<Integer> unique = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
          // unique = new HashSet<>();//not ok incorrect
            unique.add(arr[i]);
        }
        System.out.println(unique);
    }

    public static int removeDuplicateAndReturnSizeofArray(int[] arr){
        //sorted array
        int i=0;

     for(int j=1;j<arr.length;j++){
         if(arr[j] !=arr[i]){
            arr[i+1]=arr[j];
            i++;
         }
     }
     System.out.println(Arrays.toString(arr));
        return i+1;
    }
    public static void main(String[] args) {
      int[] arr={1,1,2,2,3,3,4,4};

    removeDups(arr);

        System.out.println(removeDuplicateAndReturnSizeofArray(arr));
    }
}
