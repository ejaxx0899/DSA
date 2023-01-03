import java.util.*;
public class A5_rotatearr {
    public static void main(String[] args) {
    Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=inc.nextInt();
         }
         int k = inc.nextInt();
         rotatrarr(arr, k);
         inc.close();
    }

    public static void rotatrarr(int[] arr,int k){
        int n = arr.length;
        k = k%n;
            // Reversing First N-K element
            reversearr(arr, 0,n-k-1);
            // Reversing Last K element
            reversearr(arr, n-k, n-1);
            // reversing all element in arr
            reversearr(arr,0, n-1);
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        
    }
    public static void reversearr(int [] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    /*while(k>0){
        int temp = arr[n-1];
        for(int i =n-2;i>=0;i-- ){
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
            k--;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/
}
