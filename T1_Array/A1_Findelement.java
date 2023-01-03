import java.util.*;
public class A1_Findelement {
    
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();

        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=inc.nextInt();
        }
        int a = inc.nextInt();
        System.out.println(findele(arr, a));
        inc.close();

    }

    public static int findele(int arr[],int a) {
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
}
