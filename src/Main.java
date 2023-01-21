public class Main {
    /**
     *This is the main method.  It calls the fib method and outputs the results.
     * @param args Strings passed into the main.
     * @author Graham Quirk
     */
    public static void main(String[] args)
    {
        int term = 10;
        int fibNumber = fib(term);
        System.out.println();
        System.out.println("The " + term + "th term of the Fibonacci sequence is " + fibNumber + ".");
    }

    /**
     * Method that calculates Fibonacci term based on n.
     * @param n integer that is passed into the method.
     * @return nth term in the Fibonacci sequence.
     */
    public static int fib (int n)
    {
        if((n == 0) || (n == 1))
            return n;
        else return fib(n - 1) + fib(n - 2);
    }
}