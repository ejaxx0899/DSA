/* OUTPUT
            1
          2 0 2
        3 0 0 0 3
      4 0 0 0 0 0 4
    5 0 0 0 0 0 0 0 5
*/
import java.util.*;
public class p30 {

    public static void main(String[] args) {
        
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();
        int row = 1;
        int star = 1;
        int space =n-1;
        int val = 1;
        while(row<=n)
        {
            int i =1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }

            int j=1;
            int x=val;
            while(j<=star){
                if(j==1 || j==star){
                System.out.print(x+"\t");
                }
                else{
                System.out.print(0+"\t");
                }
                j++;
            }
            row++;
            System.out.println();
            space--;
            star+=2;
            val++;
        }
        inc.close();
    }


    
}
