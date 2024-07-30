package Sorting;

import java.util.Arrays;

public class IntersectionofArray {
    public static void main(String[] args) {
        int a[] = {1,2,4,5,6};
        int b[] = {2,3,5,7};
        int c[] = new int[2];
        int i=0,j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                 c[k]=b[j];
                 i++;
                 j++;
                 k++;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}