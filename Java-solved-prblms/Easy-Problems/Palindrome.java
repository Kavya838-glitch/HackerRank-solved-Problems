import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        // String reversed = new StringBuilder(A).reverse().toString();       
        // if(reversed == A){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }
        
        String reverse = "";
        
        for(int i = A.length()-1; i >= 0; i--){
                          
                reverse += A.charAt(i);                                           
            }    
    if(reverse.compareTo(A) == 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
         
     sc.close();   
    }
}