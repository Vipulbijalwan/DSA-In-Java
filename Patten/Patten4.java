public class Patten4 {
    public static void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println();

        }
    }

}
class Test4 {
    public static void main(String[] args) {
        Patten4 obj=new Patten4();
        obj.nForest(5);
    }
}

