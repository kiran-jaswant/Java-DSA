public class Recursion {
    static void printDecreasing(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);


    }
    static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    static int factorial(int n){
        if (n==1 || n==0) {
            return n;
        }

        return n * factorial(n-1);


    }

    static int fibo(int n){
        if (n==1 || n==0)
            return n;

        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        int n=5;
        // printIncreasing(n);
        // printDecreasing(n);
        //printing factorial of nth number
        int f=factorial(n);
        System.out.println(f);

        //printing nth element of fibonacci series
        int fibo=fibo(n);
        System.out.println(fibo);

        //print fibonacci series upto n
        for (int i=1;i<=7;i++){
            System.out.println(fibo(i));
        }

    }
}
