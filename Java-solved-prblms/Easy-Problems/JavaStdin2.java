import java.io.*;
import java.util.*;

public class JavaStdin2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        sc.nextLine();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        
        System.out.println("String: " +s);
        System.out.println("Double: " +d);
        System.out.println("Int: " +a);
        
        sc.close();
    }
}
