/* OUTPUT
       1
     2 2 2
   3 3 3 3 3
 4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5
 */

import java.util.*;
public class p25 {
    public static void main(String[] args) {
        
        Scanner inc = new Scanner(System.in);
    
        int n = inc.nextInt();
    
        int star = 1;
        int space = n-1;
    
        int row = 1;
        int val = 1;
    
        while(row<=n){

            int i = 1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
    
            int j = 1;
            while(j<=star){
                
                System.out.print(val+"\t");
                j++;
            }
    
            row++;
            System.out.println();
            space--;
            star+=2;
            val++;
        }
        inc.close();
    }
}
