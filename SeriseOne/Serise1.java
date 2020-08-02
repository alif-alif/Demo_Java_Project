
package SeriseOne;

import java.util.Scanner;

public class Serise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n, sum =0;
        System.out.print("enter the last num = ");
        
        n = input.nextInt();
        
        for (int i = 0; i <= n; i--) {
            System.out.println(i+" ");
            
            sum = sum * i;
               
        }
        System.out.print(sum);
        
    }
    
}
