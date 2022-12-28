import java.util.*;
public class p10_dec_to_binary {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);

        int n =inc.nextInt();
        int mul = 1;
        int sum = 0;
        while(n>0){
            int rem =n%2;
            sum = sum + rem *mul;
            n=n/2;
            mul = mul*10;
        }
        System.out.print(sum);
       
        inc.close();
    }
}
