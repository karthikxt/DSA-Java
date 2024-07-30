package Sorting;

import java.util.Arrays;

public class Mergetwosortedarray {
    public static void main(String[] args) {
        int a[] = {1,2,9,11};
        int b[]= {3,8,21};
        int n1=a.length;
        int n2=b.length;
        int i=0,j=0,k=0;
        int c[] = new int[7];
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }


        }
        while(i<n1){
            c[k]=a[i];
            k++;
            i++;
        }
        while(j<n2){
            c[k]=b[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(c));

    }
}
