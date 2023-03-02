import java.util.*;
public class A01_findELeArray {
    public static void main(String[] args){
        Scanner inc =new Scanner(System.in);
        int n = inc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = inc.nextInt();
        }
        int item = inc.nextInt();
        System.out.println(findele(arr,item));
        inc.close();
    }

    public static int findele(int arr[],int item){

        for(int i = 0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }

}
