package sorting;


import java.util.Arrays;

public class SecondLargestInArray {
    public static int secondLarge2(int[] arr){
       //optimal
        int largest=Integer.MIN_VALUE;
       // int slargest = -1;
        int slargest = Integer.MAX_VALUE;
        // Integer.MAX_VALUE; in case if negatives are there
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
         return slargest;
    }

    public static int secondSmall2(int[] arr){

        int smallest=arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]< smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i] != smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }

    public static int[] getArrayOfExtreme(int[] arr){
       int smallest= secondSmall2(arr);
       int largest=secondLarge2(arr);
       return new int[]{smallest,largest};
    }
    public static int secondLarge(int[] arr){
           //better approach  o(2n)
        int large=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        int secondLarge=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge=arr[i];
            }
        }
        return secondLarge;

    }
    public static void main(String[] args) {
        int [] arr={1,2,4,7,7,5};
        int [] arr2={1,7,7,7,7};
        int [] arr3={-1,7,8,-8,6};
        int [] arr4={-1,-7,-8,-8,-6};

       System.out.println(secondLarge(arr));
  int a[]=new int[2];
  a=getArrayOfExtreme(arr);
        System.out.println(Arrays.toString(a));
        System.out.println("second large with optimal solution   " +   secondLarge2(arr4));
    }

}









