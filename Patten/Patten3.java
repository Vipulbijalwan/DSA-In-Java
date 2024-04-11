public class Patten3 {
    public static void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }

}
class Test3 {
    public static void main(String[] args) {
        Patten3 obj=new Patten3();
        obj.nForest(5);
    }
}

