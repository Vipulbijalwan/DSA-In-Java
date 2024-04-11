public class Patten8 {
    public static void nBinaryTriangle(int n)
    {
        for (int i = 0; i <=n ; i++) {
            for (int j = 1; j < i; j++) {
                if((i+j)%2==0)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print("1 ");
                }

            }
            System.out.println();
        }
    }
}
class Test8
{
    public static void main(String[] args) {
        Patten8 obj=new Patten8();
        obj.nBinaryTriangle(6);
    }
}
