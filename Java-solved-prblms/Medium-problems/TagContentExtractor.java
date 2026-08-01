import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TagContentExtractor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        boolean isfound = false;
        // String regex = "<(\\w+)>([^>]+)<(.+?)></\\2>";
        // String regex = ("</\\1>(^.*?)([^>]+)"); 
        
        String regex = "<(.+?)>([^<>]+)</\\1>";
        Pattern pt = Pattern.compile(regex);
        
        int N = sc.nextInt();
        sc.nextLine();
        while(N-- >0){
            isfound = false;
            String s = sc.nextLine();
            Matcher m = pt.matcher(s);
            
            while(m.find()){
                isfound = true;
                System.out.println(m.group(2));
            }
            if(!isfound){
                System.out.println("None");
            }
        }
        // System.out.println(m);
        
            
        
     sc.close();   
    }
}
