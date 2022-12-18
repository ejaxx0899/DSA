/*  OUTPUT
       * * * * *
      *       *
     *       *
    *       *
   * * * * *   
   
 */
import java.util.*;
public class p22 {

    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();

        int space = n-1;

        for(int row = 1;row<=n;row++)
        {
            for(int i = 1;i<=space;i++)
            {
                System.out.print("  ");
            }
            space--;
            for(int j = 1;j<=n;j++)
            {
                if(j==1 ||j==n ||row==1||row==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        inc.close();

    }
    
}
