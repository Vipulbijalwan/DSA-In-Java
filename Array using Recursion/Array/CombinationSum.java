package Array;

public class ArraySubset {
    public static void main(String[] args) {
        int[] arr={5,2,3,10,8};
       sortArr(arr,0,"",10,0);

    }

    private static void sortArr(int[] arr,int i,String ans,int t,int sum) {
        if(sum==t)
        {
            System.out.println(ans);
            return ;
        }
        if(i>arr.length-1){

            return ;
        }
        int num=arr[i];
        sortArr(arr,i+1,ans+num,t,sum+num);
        sortArr(arr,i+1,ans,t,sum);
    }
}
