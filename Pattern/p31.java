/* OUTPUT
                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1
 */
import java.util.*;
public class p31 {

    public static void main(String[] args) {
        
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();
        int star = 1;
        int space =n+1;
        int row  = 1;
        int val = 1;
        while(row<=n) {
            int i = 1;
            while(i<=star) {
                System.out.print(val+" ");
                i++;
                
            }
            int j = 1;
            while(j<=space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if(row==n){
                k=2;
            }
            while(k<=star){
                System.out.print(val+" ");
                k++;
            }

            row++;
            System.out.println();
            space-=2;
            star++;
            //val++;
        }
        inc.close();
    }
    
}
