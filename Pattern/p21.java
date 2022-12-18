/* OUTPUT
    * * * * *
    *       *
    *       *
    *       *
    * * * * * 
 */

import java.util.*;
public class p21 {

    public static void main(String[] args)
    {
    Scanner inc = new Scanner(System.in);

    int n = inc.nextInt();

    for(int row = 1;row<=n;row++)
    {
        for(int i = 1;i<=n;i++)
        {
            if(row==1 || i==1 || row==n || i==n)
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
