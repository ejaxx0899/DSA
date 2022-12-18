/* OUTPUT 

        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1


*/
import java.util.*;
public class p28 {
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
                if(j<=star/2)
                {
                   System.out.print(val+"\t");
                   val++;
                }
                else{
                    System.out.print(val+"\t");
                    val--;
                }
                //System.out.print(val+"\t");
                //val++;
                j++;
            }   
    
            row++;
            System.out.println();
            space--;
            star+=2;
           // val=;
        }
        inc.close();
    }
    
}
