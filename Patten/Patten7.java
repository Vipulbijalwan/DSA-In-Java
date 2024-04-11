public class Patten7 {
    public static void nForest(int n) {

        for (int i = 1; i <= n; i++) {
            for (int k = 0; k <i; k++) {
                System.out.print(" ");
            }
            for (int j = (((n-i)*2)+1 ) ; j > 0; j--) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
class Test7
{
    public static void main(String[] args) {
        Patten7 obj=new Patten7();
        obj.nForest(5);
    }
}

