/* OUTPUT 
    
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5

*/
import java.util.*;
public class p29 {

    public static void main(String[] args) {
        
        Scanner inc = new Scanner(System.in);
        int n =inc.nextInt();
        int row =1;
        int star =1;
        int space =n-1;
        int val =1;

        while(row<=n){
            int i =1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }

            int x=val;
            int j=1;
            while(j<=star){
                if(j<=star/2){
                    System.out.print(x+"\t");
                    x++;
                }
                else{
                    System.out.print(x+"\t");
                    x--;
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
  