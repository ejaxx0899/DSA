
import java.util.*;
public class A2_minvalue {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();

        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=inc.nextInt();
        }
        //int item = inc.nextInt();
        findmin(arr);
        inc.close();
    }
    public static void findmin(int arr[]){
        int min = 0;
        for(int i = 1;i<arr.length;i++) {
                if(arr[i]<arr[min]){
                    min = i;
                }
            }
        System.out.println(arr[min]);
    }
}
