import java.io.*;
import java.util.*;

public class JavaLoops2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int q = sc.nextInt();
        int result ;
        
        for(int i =1; i<= q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            result = a;
                for(int j = 0; j < n; j++){   
                    
                    result += (int)Math.pow(2, j) * b;
                    System.out.print(result +" ");              
                }                
        System.out.println();    
    }
     sc.close();
   }
 }
