import java.util.*;
public class p8_GCD {

    public static void main(String[] args) {
        
        Scanner inc = new Scanner(System.in);

        int n1 = inc.nextInt();
        int n2 = inc.nextInt();
       // int rem = 0;
        while(n1 % n2 != 0){
            int rem = n1%n2;
            n1=n2;  
            n2=rem;
        }
        System.out.println(n2);
        inc.close();
    }
    
}
