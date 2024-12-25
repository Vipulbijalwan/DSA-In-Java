import java.sql.Array;

public class BinaryAddition {
    public static void main(String[] args) {
       int n=5;
       int[] arr= new int[n+1];
        for (int i = 0; i <=n; i++) {
            arr[i]=countBit(i);
        }
        for (int i = 0; i <=n ; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    private static int countBit(int num) {
        int count=0;
        while (num>0){
            if((num&1)==1){
                count++;
                num=num>>1;
            }else {
                num=num>>1;
            }
        }return count;
    }
}
