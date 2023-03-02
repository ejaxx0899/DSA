import java.util.*;
public class A03_findMaxArray {
    public static void main(String[] args){
        Scanner inc =new Scanner(System.in);
        int n = inc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = inc.nextInt();
        }
        //int item = inc.nextInt();
        System.out.println(findelemax(arr));
        inc.close();
    }
    public static int findelemax(int arr[]){

        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    
    }
}
