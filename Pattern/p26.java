/*OUTPUT
                1
              2 3 4
            5 6 7 8 9
       10 11 12 13 14 15 16
    17 18 19 20 21 22 23 24 25

 */
import java.util.*;
public class p26 {
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
        }
        inc.close();
    }
    
}
