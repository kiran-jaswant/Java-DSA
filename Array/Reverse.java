package Array;

import java.util.Scanner;

public class Reverse {
    static int[] reverse(int[] arr){
        int n=arr.length;
        int [] rev =new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            rev[j++]=arr[i];

        }
        return rev;
    }
    static void swap(int[] arr,int i, int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];

    }
    static void reverseInPlace(int [] arr){
        int i=0;
        int j= arr.length-1;

        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }


    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n= sc.nextInt();
        System.out.println("Enter array elements");
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Original array");
        printArray(array);

        System.out.println("Reverse of array is" );
        reverseInPlace(array);
        printArray(array);
    }
}
