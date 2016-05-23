/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsproject;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayThrowsExceptions {
    public static void main(String[] args){
// printNumbers(){
        int arr [] = new int[5];
         for (int i = 1; i<=4; i++){
            arr[i]=i;
        System.out.println("Input n");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
             try {
          
          System.out.println("n="+n+", i="+i+", "+i+"/"+n+"="+i/n);
        
           } catch (ArithmeticException e) {
               System.out.println("An invalid arithmetic operation");
              // Logger.getLogger(ArrayThrowsExceptions.class.getName()).log(Level.SEVERE, null, e);
             } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Handling an invalid array index"+e.getMessage());
                // Logger.getLogger(ArrayThrowsExceptions.class.getName()).log(Level.SEVERE, null, e);
             }
    }
    }    
}
