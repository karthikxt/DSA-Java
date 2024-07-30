package arrayLearning.java;

public class BinarySearchArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int ele=1;
        boolean flag = false;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==ele){
                System.out.println("found");
                flag=true;
                break;
            }
            if(arr[mid]<ele){
                start=mid+1;
            }
            else if(arr[mid]>ele){
                end=mid-1;
            }
        }
        if(flag==false){
            System.out.println("not found");
        }
    }
}
