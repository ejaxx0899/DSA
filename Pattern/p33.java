/* OUTPUT.
         1
       2 3 2
     3 4 5 4 3
       2 3 2
         1
 */
import java.util.*;
public class p33 {

    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int n1 = 2*n-1;
        int row = 1;
        int star = 1;
        int space = n-1;
        int val=1;

        while(row<=n1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int x=val;
            int j=1;
            while(j<=star){
                if(j<=star/2){
                     System.out.print(x+" ");
                     x++;
                }
                else{
                     System.out.print(x+" ");
                     x--;
                }
                j++;
            }

            row++;
            System.out.println();
            if(row<=n){
                space--;
                star+=2;
                val++;
            }
            else{
                space++;
                star-=2;
                val--;
            }
        }
        inc.close();
    }
}
