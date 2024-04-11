
public class Patten5 {
    public static void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 6-i; j >0; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

}
class Test5 {
    public static void main(String[] args) {
        Patten5 obj=new Patten5();
        obj.nForest(5);
    }
}

