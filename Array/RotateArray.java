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
    }




}
