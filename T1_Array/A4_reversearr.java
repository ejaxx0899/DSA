
import java.util.*;
public class A4_reversearr {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();

        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=inc.nextInt();
        }
        int x = inc.nextInt();
        int y = inc.nextInt();
        reverarr(arr,x,y);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        inc.close();
    }

    public static int[] reverarr(int[] arr,int i,int j){
            //i = 0;
            //j = arr.length-1;
          while(i<j){
          int temp =arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
     }
       return arr;
    } 
}
