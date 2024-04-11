public class Patten19 {
    public static void nForest(int n) {
int count=n;
        for (int i = 1; i <= (2*n)-1; i++) {
            for (int j = 1; j <= (2*n)-1; j++) {
              {
                    System.out.print(count);
                }
        }
            System.out.println();

    }

}
}
class Test19
{
    public static void main(String[] args) {
        Patten19 obj=new Patten19();
        obj.nForest(5);
    }
}

