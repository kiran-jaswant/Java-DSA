package Array;

import java.util.Scanner;

public class RotateArray {
    static void printArray(int [] arr){
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static int[] rotateArray(int [] arr,int k){
        int n= arr.length;
        int[] rarr= new int[n];
        k=k%n;
        int j=0;

        for(int i=n-k;i<n;i++){
            rarr[j++]=arr[i];
        }
        for(int i=0 ;i<=n-k-1 ;i++){
            rarr[j++]=arr[i];

        }
        return rarr;

    }
    static void reverse(int [] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateArrayInPlace(int [] arr, int k){
        int n =arr.length;
        k=k%n;

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= sc.nextInt();
        System.out.println("Enter array elements");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter size of k ");
        int k= sc.nextInt();

        System.out.println("Before rotation :");
        printArray(arr);

        System.out.println("After rotation:");
        printArray(rotateArray(arr,k));

        System.out.println("After rotation inplace");
        rotateArrayInPlace(arr,k);
        printArray(arr);
    }




}
