package dsa.recursion;

public class PrintNto1Descending {

    public static void print(int n){
        if (n<0) {
            System.out.println("Invalid input expect > = 0:");
            return;
        }
        if (n==0) return;
        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args) {
        print(-5);
    }
}
