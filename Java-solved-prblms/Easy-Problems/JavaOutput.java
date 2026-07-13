import java.io.*;
import java.util.*;

public class JavaOutput {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        String x = sc.next();
        int a = sc.nextInt();
        
        
        String y = sc.next();
        int b = sc.nextInt();
        
        
        String z = sc.next();
        int c = sc.nextInt();
        
        System.out.println("================================");
        System.out.printf("%-15s%03d\n", x,a);
        System.out.printf("%-15s%03d\n", y,b);
        System.out.printf("%-15s%03d\n", z,c);
        System.out.println("================================");

        
        sc.close();
    }
}
