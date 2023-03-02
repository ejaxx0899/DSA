import java.util.*;
public class A04_ReverseArray {
    public static void main(String[] args){
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = inc.nextInt();
        }

        int brr[] = reverArr(arr);
        for(int i = 0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        inc.close();
    }

    public static int[] reverArr(int arr[]){

        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
