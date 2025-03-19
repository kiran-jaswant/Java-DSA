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
    static void printNumericPatter(int r,int c){
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                if( i%2==1){
                    if(j%2==1){
                    System.out.print(1);
                    }else{
                    System.out.print(2);
                    }
                }else{
                    if(j%2==1){
                        System.out.print(2);
                    }else{
                        System.out.print(1);
                    }

                }
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
        //printStarPattern(r,c);
        printNumericPatter(r,c);
    }
}
