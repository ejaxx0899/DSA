/* OUTPUT 
 
    1
    2 3
    4 5 6
    7 8 9 10
*/
import java.util.*;
public class p34 {

    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();
        int row=1;
        int star=1;
        int val=1;
        while(row<=n){
            int i = 1;
            //int x=1;
            while(i<=star){
                System.out.print(val+" ");
                i++;
                val++;
            }
        row++;
        star++;
        System.out.println();
        }
        inc.close();
    }
}
