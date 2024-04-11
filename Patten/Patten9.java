public class Patten9 {
    public static void nBinaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = (i * 2) - 1; j > 0; j--) {

                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = (((n - i) * 2) + 1); j > 0; j--) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
class Test9
{
    public static void main(String[] args) {
        Patten9 obj=new Patten9();
        obj.nBinaryTriangle(6);
    }
}
