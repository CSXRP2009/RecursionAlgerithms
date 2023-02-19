/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package richard.homework3recursion;

/**
 *
 * @author CSXRP
 */
public class Homework3Recursion {
public static void print(int n){
    
    if (n > 0){
       System.out.println("Hello World!");
       print(n - 1);
    }
  
    
}
 public static int sum(int n1, int n2){
     if(n1 > n2){
         return 0;
         
     }
     else if (n1 % 7 == 0){
         return n1 + sum(n1 + 1, n2);
         
     }
     else {
          return sum(n1 + 1, n2);
         
     }
     
     
     
 }
 public static boolean binarySearch(int[]array, int value, int first, int last){
     if (first > last){
         return false;
     }
     else {
         int middle = (first + last) / 2;
         if (array[middle]== value){
             return true;
         }
         else if (value < array[middle]){
             return binarySearch(array, value, first, middle -1);
         }
         else{
             return binarySearch(array, value, middle + 1, last);
         }
     }
     
 }
    public static void main(String[] args) {
      print(10);
      int s = sum(1, 21);
      System.out.println(s);
      int[]array = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; 
      int value = 5;
      boolean b = binarySearch(array, value, 0, array.length -1);
      if(b){
          System.out.println(value +" was found");
      }
      else {
          System.out.println(value +" was not found");
      }
      value = 2;
       boolean c = binarySearch(array, value, 0, array.length -1);
     if(c){
           System.out.println(value +" was found");
      }
      else {
          System.out.println(value +" was not found");
      }
    }
   
}
