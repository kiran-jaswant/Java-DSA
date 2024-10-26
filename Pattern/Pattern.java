import java.util.Scanner;

public class Pattern {
    static void printStarPattern(int r, int c){
        for(int i=1;i<=r;i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int r= sc.nextInt();
        System.out.println("Enter no. of columns:");
        int c = sc.nextInt();
        printStarPattern(r,c);
    }
}
