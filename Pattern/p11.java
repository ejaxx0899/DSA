/*  OUTPUT

    * 
    * * 
    * * *    
    * * * * 
    * * * * * 
    * * * *
    * * *
    * *
    *

 */
import java.util.*;
public class p11 {

    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int n1 = 2*n-1;
        int row = 1;

        int star = 1;

        while(row<=n1)
        {
            int i = 1;

            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            row++;
            if(row<=n)
            {
                star++;
            }
            else{
            star--;
            }
            System.out.println();
        }

        inc.close();
    }
    
}
