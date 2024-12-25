import java.util.ArrayList;

public class PrintIndexOfElement {
//    static ArrayList<Integer> list=new ArrayList<>();
//    static void findAllIndex(int[] arr,int target,int index){
//if(index==arr.length-1){
//    return;
//}if(arr[index]==target){
//    list.add(index);
//            findAllIndex(arr, target, index+1);
//        }else {
//    findAllIndex(arr, target, index+1);
//        }
//    }
    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length-1){
            return list;
        }if(arr[index]==target){
            list.add(index);
           return findAllIndex2(arr, target, index+1,list);
        }else {
          return findAllIndex2(arr, target, index+1,list);
        }
    }
    static ArrayList<Integer> findAllIndex3(int[] arr,int target,int index){
       ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length-1){
            return list;
        }if(arr[index]==target) {
            list.add(index);
        }
            ArrayList<Integer> ansFromBelowCall=findAllIndex3(arr, target, index+1);
        list.addAll(ansFromBelowCall);
        return list;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,3,4,5,6,7,8};
        int index= arr.length-1;
        int num=1;
        ArrayList<Integer> list=new ArrayList<>();
   findAllIndex2(arr,num,0,list);
        System.out.println(list);

    }

}
