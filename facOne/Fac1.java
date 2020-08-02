
package facOne;

import java.util.Scanner;

public class Fac1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int num,fact=1;
        System.out.print("enter any possitive num");
        
        num = input.nextInt();
        
        for (int i = num; i >= 1; i--) {
            fact = fact* i;
            
            
        }
        
        System.out.println(fact);
            
        }
                
    
}
