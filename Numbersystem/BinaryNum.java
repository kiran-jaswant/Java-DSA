package Numbersystem;

import java.util.Scanner;

public class BinaryNum {
    static int convertToDecimal(int bn){
        int pow=1;
        int decimal_num = 0;

        while (bn > 0){
            int unit_digit = bn%10;
            decimal_num = decimal_num + (unit_digit * pow);
            bn= bn /10;
            pow= pow*2;
        }
        return decimal_num;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number you want to convert into decimal:");
        int binary_num = sc.nextInt();
         int decimal_num = convertToDecimal(binary_num);
        System.out.println("Decimal Number is " + decimal_num);
    }
}
