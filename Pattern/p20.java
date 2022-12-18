/* OUTPUT
 
   *        *
     *   *
       *
     *    *
   *        *
    
 */
import java.util.*;
public class p20 {

    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        //int star = 1;
        int row = 1;
        while(row<=n)
        {
            int i = 1;
            while(i<=n)
            {
                if(i==row ||i==n-row+1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
                i++;
            }
            row++;
            //star++;
            System.out.println();
        }

        inc.close();
    }
    
}
