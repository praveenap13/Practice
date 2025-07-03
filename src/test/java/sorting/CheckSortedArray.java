package sorting;

public class CheckSortedArray {
/*
   { 1 2 3 4 5}  sorted
   {1 2 1 3 4 5 } not sorted
   arr[1]>=arr[i-1]

checks whether an integer array arr is sorted in non-decreasing order
 */
    public static boolean sortedArray(int[] arr){
       for(int i=1;i<arr.length;i++){
           if(arr[i] >= arr[i-1]){

           }
           else{
               return false;

           }
       }
        return true;
    }

    public static boolean sortedArray2(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    // int[] arr={ 1 ,2, 3, 4, 5};
      int[] arr={ 1 ,2, 1,3, 4, 5};
     System.out.println(sortedArray(arr));

     System.out.println(sortedArray2(arr));
    }
}
