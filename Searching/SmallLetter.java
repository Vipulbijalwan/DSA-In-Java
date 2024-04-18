public class SmallLetter {
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        char a='z';
        for (int i = 0; i <arr.length ; i++) {
            if(a<arr[i])
            {
                System.out.println(arr[i]);
                break;
            }

        }
    }
}
