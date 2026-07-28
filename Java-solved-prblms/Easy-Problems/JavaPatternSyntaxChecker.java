import java.io.*;
import java.util.*;
import java.util.regex.*;

public class JavaPatternSyntaxChecker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        // Pattern p = new Pattern();
        
        int N = sc.nextInt();
        String s;
        
        sc.nextLine();
        
        // try{
        for(int i = 0; i < N; i++){
            s = sc.nextLine();
            try{
            Pattern.compile(s);
            System.out.println("Valid");
            }
           
            // else{
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
        //  catch(PatternSyntaxException e){
        
        // }
    // }
     
     sc.close();   
    }
}