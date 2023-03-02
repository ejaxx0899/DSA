import java.util.*;
public class A02_findminArray {
    public static void main(String[] args){
        Scanner inc =new Scanner(System.in);
        int n = inc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = inc.nextInt();
        }
        //int item = inc.nextInt();
        System.out.println(findelemin(arr));
        inc.close();
    }
    public static int findelemin(int arr[]){

        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    
    }

}
