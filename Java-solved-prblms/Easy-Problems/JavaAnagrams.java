import java.io.*;
import java.util.*;

public class JavaAnagrams{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        char temp ;
        boolean isAnagram = false;
        
        if(a.length() == b.length()){
            char arr1 [] ;
            char arr2 []; 
          arr1 =  a.toLowerCase().toCharArray();
          arr2 = b.toLowerCase().toCharArray();
            
            for(int i = 0; i< a.length()-1; i++){
                for(int j = i+1; j < a.length(); j++){
                    if(arr1[i] > arr1[j]){
                    
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                    
                }
            }
        } 
        for(int i = 0; i<b.length()-1; i++){
            for(int j = i+1; j <b.length(); j++){
                if(arr2[i] > arr2[j]){
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr1.length; i++){
            
            if(arr1[i] != arr2[i]){
                isAnagram = false;
                break;
              }      
              else{
                isAnagram = true;
              }        
           }
        }  
     
        
        if(isAnagram){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
        
        sc.close();
    }
}
