import java.util.*;
public class A3_maxvalue {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();

        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=inc.nextInt();
        }
        findmax(arr);
        inc.close();
    }

    public static void findmax(int[] arr){
        int max = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        System.out.println(arr[max]);
    }
}
