public class DoubleIsPresentOrNot {
    public static void main(String[] args) {
        int[] arr={10,2,5,3};
        int i=0;
           while (i< arr.length-1)
           {
               int j= arr.length-1;
               while (j>i)
               {
                   if(arr[i]==2*arr[j] || arr[j]==2*arr[i])
                   {
                       System.out.println("TRUE");
                       break;
                   }
                   j--;
               }
               i++;
           }
        System.out.println("False");
        }


}
