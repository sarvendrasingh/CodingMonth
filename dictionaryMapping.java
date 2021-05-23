import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class dictionaryMapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of value pairs: ");
        int n = sc.nextInt();
        sc.nextLine();
        Dictionary dict = new Hashtable();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter names and phone number seperated by space: ");
            String s = sc.nextLine();
//            System.out.println("added");
            String[] arr = s.split(" ");
            dict.put(arr[0], arr[1]);
        }

        System.out.print("Enter names to search phone number: ");

        //below loop is copied(hackerrank)
        // it checks if input is coming and loop ends when we dont give input
        while(sc.hasNext()){
            String s = sc.next();
            if (dict.get(s)!= null) {
                System.out.println(s+"="+dict.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }

    }
}
