/*  OUTPUT
    
                1
            2 1   1 2
        3 2 1       1 2 3
    4 3 2 1           1 2 3 4
        3 2 1       1 2 3
            2 1   1 2
                1
 */

import java.util.*;
public class p32 {

    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int row  = 1;
        int space = n-1;
        int star = 1;
        int space2 = -1;

        int val = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int x=val;
            int j = 1;
            while(j<=star){
                System.out.print(x+" ");
                x--;
                j++;
            }
            int k = 1;
            while(k<=space2){
                System.out.print("  ");
                 k++;
            }
            int y =1;
            int l =1;
            if(row==1 || row==n)
            {
                l=2;
            }
            while(l<=star){
                System.out.print(y+" ");
                y++;
                l++;
            }

            row++;
            System.out.println();
            if(row<=n/2+1){
                space-=2;
                star++;
                space2+=2;
                val++;
            }
            else{
                space+=2;
                star--;
                space2-=2;
                val--;
            }
        }
        inc.close();
    }
    
}
