/*  OUTPUT
                1
              1 2 3
            1 2 3 4 5
          1 2 3 4 5 6 7
        1 2 3 4 5 6 7 8 9

 */
import java.util.*;
public class p27 {
    public static void main(String[] args) {
        
        Scanner inc = new Scanner(System.in);
    
        int n = inc.nextInt();
    
        int star = 1;
        int space = n-1;
    
        int row = 1;
        int val = 1;
    
        while(row<=n){

            int i = 1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
    
            int j = 1;
            while(j<=star){
                System.out.print(val+"\t");
                val++;
                j++;
            }
    
            row++;
            System.out.println();
            space--;
            star+=2;
            val=1;
        }
        inc.close();
    }
    
}
