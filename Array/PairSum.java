package Array;

import java.util.Scanner;

public class PairSum {
    static void printArray(int [] arr){
        int n= arr.length;
        for(int i=0 ;i<n ;i++){
            System.out.println(arr[i]);
        }
    }

    static int pairSum(int [] arr,int target){
        int count=0;
        for(int i=0;i<arr.length ;i++){
            for(int j=i+1 ; j<arr.length ;j++){
                if (arr[i]+arr[j]==target){
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array" );
        int n= sc.nextInt();
        System.out.println("Enter "+ n + " Array elements");
        int [] array = new int [n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter target sum");
        int t= sc.nextInt();

        System.out.println("Number of pairs in array whose target sum is " + t + " is "+ pairSum(array,t));
        printArray(array);
    }
}
