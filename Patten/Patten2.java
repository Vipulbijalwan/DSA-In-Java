public class Patten2 {
    public static void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

}
class Test2 {
    public static void main(String[] args) {
Patten2 obj=new Patten2();
obj.nForest(5);
    }
}

