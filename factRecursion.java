import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class factResult {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Write your code here
        if (n == 0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }

}

public class factRecursion {
    public static void main(String[] args) throws IOException {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter an integer to find its factorial: ");
        int n = sc.nextInt();
        int ans;
        ans = factResult.factorial(n);
        System.out.print("Factorial of "+n+" is: "+ans);
        sc.close();
    }
}