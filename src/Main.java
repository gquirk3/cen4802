public class Main {
    public static void main(String[] args)
    {
        int term = 10;
        int fibNumber = fib(term);
        System.out.println();
        System.out.println("The " + term + "th term of the Fibonacci sequence is " + fibNumber + ".");
    }
    public static int fib (int n)
    {
        if((n == 0) || (n == 1))
            return n;
        else return fib(n - 1) + fib(n - 2);
    }
}