public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int num=0;
        int index= arr.length-1;
        System.out.println(findNum(arr,index,num));
    }

    private static boolean findNum(int[] arr,int index, int num) {
        if(index==0){
            if(arr[index]==num){
                return true;
            }
            else{
            return false;
        }}
        if(arr[index]==num)
        {
            return true;
        }else {
            return findNum(arr,index -1, num);
        }
    }
}
