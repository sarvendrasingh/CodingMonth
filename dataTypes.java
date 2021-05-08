import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();
        int ans_i = i+a;
        double ans_d = d+b;
        String ans_s = s+c;
        System.out.println(ans_i);
        System.out.println(ans_d);
        System.out.println(ans_s);
        scan.close();
    }

}