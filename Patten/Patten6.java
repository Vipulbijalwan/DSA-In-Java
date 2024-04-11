public class Patten6 {
    public static void nForest(int n) {

        for (int i = 1; i <= n; i++) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = (i * 2) - 1; j > 0; j--) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
   class Test
    {
        public static void main(String[] args) {
            Patten6 obj=new Patten6();
            obj.nForest(5);
        }
    }

