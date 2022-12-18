/* OUTPUT
             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 
 */

import java.util.*;
public class p36 {

    public static void main(String[] args) {
        
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();
        int row = 1;
        int star=1;
        int space = 2*n-1;
        int val = n;
        while(row<=2*n+1){

            int i = 1;
            int x=val;
            while(i<=star){
                System.out.print(x+"\t");
                x--;
                i++;
            }

            int j = 1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }

            int k=1;
            int y = x+1;
            if(row==n+1)
            {
                k=2;
            }
            while(k<=star) {
                System.out.print(y+"\t");
                y++;
                k++;
            }

            row++;
            System.out.println();
            if(row<=n+1) {
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
        }
        inc.close();
    }
    
}
