package Numbersystem;

import java.util.Scanner;

public class DecimalNum {
    static int convertToBinary(int dn){
       int binary_num=0;
        int pow = 1;

        while(dn>0){
            binary_num += (dn%2)*pow;
            dn= dn /2;
            pow = pow*10;

        }
        return binary_num;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number you want to convert into binary:");
        int decimal_num = sc.nextInt();
        int binary_num = convertToBinary(decimal_num);
        System.out.println("Binary Number is " + binary_num);
    }
}
