/* 
    OUTPUT

  * * * * *
        * * * *
            * * *       
                 * *
                     *
                 * * 
            * * *
        * * * *
  * * * * *   

 */
import java.util.*;
public class p13 {

    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int n1 = 2*n-1;
        int row = 1;

        int star = n;

        int space = 0;

         while(row<=n1)
         {
            int i = 1;

            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;

            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }

            row++;
            System.out.println();
            if(row<=n)
            {
                star--;
                space+=2;
            }
            else
            {
                star++;
                space-=2;
            }
         }

         inc.close();

    }
    
}
