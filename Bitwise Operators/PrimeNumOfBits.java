public class AlternatingBits {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int ans=0;
        for (int i = a; i <=b; i++) {
            if(findBits(i)==true){
                ans++;
            }
        }
        System.out.println(ans);
    }

    private static boolean findBits(int num) {
        int count=0;
        while (num>0){
            if((num&1)==1){
                count++;
                num=num>>1;
            }else {
                num=num>>1;
            }
        }
        if(count==2||count==3||count==5||count==7){
            return true;
        }return false;

    }
}
