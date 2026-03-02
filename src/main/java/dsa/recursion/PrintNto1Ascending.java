package dsa.recursion;

public class PrintNto1Ascending {

    public static void print(int n){
        if (n<0) {
            System.out.println("Invalid input expect > = 0:");
            return;
        }
        if (n==0) return;
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }
}
