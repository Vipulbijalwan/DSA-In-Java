class Patten1
{
    public static void nForest(int n) {

        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    public static class Test {
        public static void main(String[] args) {
    Patten1 obj=new Patten1();
    obj.nForest(4);
        }
    }
}