public class Patten18 {
    public static void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1 ||i==n  ||j==1||j==4) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }}
            System.out.println();
        }
    }
}
 class Test18
{
    public static void main(String[] args) {
        Patten18 obj=new Patten18();
        obj.nForest(5);
    }
}
