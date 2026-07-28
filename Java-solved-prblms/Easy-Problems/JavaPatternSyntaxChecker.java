import java.io.*;
import java.util.*;
import java.util.regex.*;

public class JavaPatternSyntaxChecker {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String s;
        
        sc.nextLine();
        
        for(int i = 0; i < N; i++){
            s = sc.nextLine();
            try{
            Pattern.compile(s);
            System.out.println("Valid");
            }
           
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
        
     
     sc.close();   
    }
}