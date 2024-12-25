public class FindElement {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        int num=9;
        System.out.println(findElement(arr,0,arr.length-1,num));
    }

    private static boolean findElement(int[] arr, int s, int e, int key) {
        int mid = (s + e) / 2;
        if (s > e) {
            return false;
        }
        if (arr[mid] == key) {
            return true;
        }
        if (arr[s]<=arr[mid]) {
            if(key>=arr[s] && key<=arr[mid]){
            return findElement(arr, s, mid - 1, key);
        } else {
                return findElement(arr, mid+1, e, key);
            }
    }
        if(key>=arr[mid] && key<=arr[e] ){
            return findElement(arr, mid+1, e, key);
        }
        return findElement(arr, s, mid - 1, key);
}}
