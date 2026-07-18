import java.io.*;
import java.util.*;

public class JavaStaticBlock {
       static int result;
       static int B, H;
    
    static {
        Scanner sc= new Scanner(System.in);
        
        B = sc.nextInt();
        H = sc.nextInt();
        
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
             result = B*H;
        }
        
        sc.close();
        
        }
        
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        
                    
            if(B>0 && H>0){
            System.out.println(result);
           }
           
    }
}