import java.io.*;
import java.util.*;
import java.util.regex.*;

public class JavaRegex {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String pattern = null;        
        
        while(sc.hasNextLine()){
       pattern = sc.nextLine();
       MyRegex mr = new MyRegex(pattern);
       
        }        
        
        sc.close();
    }
}

class MyRegex{
    
    String pattern;
    
    MyRegex(String pattern){
        
        boolean isValid = pattern.matches(
        "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|0[0-9]?[0-9]?|[0-9])\\."
        +"(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|0[0-9]?[0-9]?|[0-9])\\."
        +"(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|0[0-9]?[0-9]?|[0-9])\\."
        +"(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|0[0-9]?[0-9]?|[0-9])"
        );
        
        System.out.println(isValid);        
        
        }    
}