import java.util.*;
public class p6_checkprime {
    public static void main(String[] args) {
        Scanner inc =new Scanner(System.in);

        int n = inc.nextInt();
        int count = 0;

        for(int i = 2;i<=n;i++) {
            if(n%i==0){
                count++;
            }
        }
          if(count==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        inc.close();
    }
}
