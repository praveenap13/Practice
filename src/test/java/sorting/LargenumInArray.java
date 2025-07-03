package sorting;

public class LargenumInArray {
    //optimal solution

    public static void main(String[] args) {
        int[] arr={3,2,1,6,5};
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
