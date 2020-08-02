
package LoopStart;

import java.util.Scanner;

public class LoopOne {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int sum = 0;
        int m, n;
        
        System.out.print("Enter num : ");
        m = input.nextInt();
        
         System.out.print("Enter num : ");
        n = input.nextInt();
        
        
        for (int i = m; i <= n; i++) {
            
           if (i%2!=0) {
                
            sum = sum +i;
           System.out.println("even num : "+i);
           } 
        }
        
        System.out.println("sum = "+sum);
    }
    
}
