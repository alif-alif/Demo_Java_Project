
package PrimeNum;

import java.util.Scanner;

public class PrimeOne {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter any possitive num : ");
        
        int num = input.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            
            if (num%i==0) {
                count ++;
                break;
                
            }
            
        }
        
        if (count==0){
            System.out.println("prime numer");
        } else {
            System.out.println("not prime");
        }
        
    }
    
}
