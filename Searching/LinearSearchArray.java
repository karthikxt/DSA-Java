package arrayLearning.java;

import javax.swing.*;
import java.util.Scanner;

public class LinearSearchArray{
    public static void main(String[] args) {
        int arr[] = {10,6,8,5,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element to be searched");
        int ele = sc.nextInt();
        boolean flag =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele) {
                flag = true;
            }
        }
        if(flag==true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
