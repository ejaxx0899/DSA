/* OUTPUT

                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4 
                              3 2 1 0 1 2 3 
                                2 1 0 1 2 
                                  1 0 1 
                                    0 
                                  1 0 1 
                                2 1 0 1 2 
                              3 2 1 0 1 2 3 
                            4 3 2 1 0 1 2 3 4 
                          5 4 3 2 1 0 1 2 3 4 5
Input Format
 */

import java.util.*;
public class p35 {

    public static void main(String[] args) {
    Scanner inc = new Scanner(System.in);
    int n = inc.nextInt();
    int row = 1;
    int star=2*n+1;
    int space = 0;
    int val=n;
    while(row<=2*n+1){

        int j=1;
        while(j<=space){ 
            System.out.print("\t");
            j++;
        }
        int i=1;
        int x = val;
        while(i<=star){
            if(i<=star/2){
                 System.out.print(x+"\t");
                 x--;
            }
            else{
                System.out.print(x+"\t");
                x++;
            }
            i++;
        }

        row++;
        System.out.println();
        if(row<=n+1){
            star-=2;
            space++;
            val--;
        }
        else{
            star+=2;
            space--;
            val++;
        }
    }
    inc.close();
 }
    
}
