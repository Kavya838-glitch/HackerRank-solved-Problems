import java.io.*;
import java.util.*;

public class JavaDatatypes {

    public static void main(String[] args) {
        
        byte a = -128;
        byte b = 127;
        
        short c = -32768;
        short d = 32767;
        
        int g = -2147483648;
        int f = 2147483647;
              
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            String s = sc.next(); 
            try{
            long n = Long.parseLong(s);           
                 System.out.println(n+" can be fitted in:");  
                 if(n >= a && n <= b){
                    System.out.println("* byte");
                 }
                 if(n >= c && n <= d){
                    System.out.println("* short");
                 }
                 if(n >= g && n <= f){
                    System.out.println("* int");
                 }
                    System.out.println("* long");
            }                        
             catch(NumberFormatException e){
           
                System.out.println(s+" can't be fitted anywhere.");
            }
            
        }
        
    }
}
