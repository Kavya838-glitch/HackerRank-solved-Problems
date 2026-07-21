import java.io.*;
import java.util.*;
import java.text.*;

public class JavaCurrencyFormater {
//Java 8 version --> RS. in Java 15 version symbol.
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale lc = new Locale ("en", "IN");
        
        double payment = sc.nextDouble();
        
        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i = NumberFormat.getCurrencyInstance(lc);
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        System.out.println("US: "+u.format(payment));
        System.out.println("India: "+i.format(payment));
        System.out.println("China: "+c.format(payment));
        System.out.println("France: "+f.format(payment));
        
        sc.close();
    }
}
 