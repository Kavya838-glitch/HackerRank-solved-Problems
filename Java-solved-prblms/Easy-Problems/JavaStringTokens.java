import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        String s = sc.nextLine();
       
        // if(s.trim().length() == 0){
        //     System.out.println(0);
        // }
        // else{
            String[] arr = s.split("[\\W_]+");
            if(arr.length != 0){
            for(int i = 0; i < arr.length; i++){
                if(arr[i].trim().isEmpty()){
                    // System.out.println(0);
                }
                else{
                count++;
                }
            }
        }
            System.out.print(count);
            for(int i = 0; i < arr.length; i++){
                if(arr[i].isEmpty()){
                //     System.out.println(0);
                 }
                else{
                    System.out.print("\n"+arr[i]);
                 }
              }
        // }
        sc.close();
    }
}
