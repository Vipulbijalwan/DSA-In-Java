public class Patten16 {
    public static void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = (n + 1) - i; j > 0; j--) {
                System.out.print("* ");

            }
            for (int j = 1; j <= (i - 1) * 2; j++) {
                System.out.print(" " + " ");

            }
            for (int j = (n + 1) - i; j > 0; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            for (int j =(n*2)-i*2; j >0; j--) {
                System.out.print(" " + " ");

            }
            for (int j = 1; j<=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
class Test16
{
    public static void main(String[] args) {
        Patten16 obj=new Patten16();
        obj.nForest(5);
    }
}
