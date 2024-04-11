class Patten13 {
    public static void nForest(int n) {

        for (int i = 1; i <= n; i++) {
            int count=0;
            for (int j = n-i; j >= 0; j--) {
                System.out.print((char) ('A'+count)+" ");
count++;
            }
            System.out.println();

        }
    }

}
class Test13 {
    public static void main(String[] args) {
        Patten13 obj=new Patten13();
        obj.nForest(5);
    }
}

