package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){

            //n-1 steps in innerloop
            for(int j=1;j<=arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);

                }

            }
          

        }

    }

    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
