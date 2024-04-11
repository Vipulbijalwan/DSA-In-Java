class Patten12 {
    public static void nForest(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (('A'-1)+j));

            }
            System.out.println();

        }
    }

}
class Test12 {
    public static void main(String[] args) {
        Patten12 obj=new Patten12();
        obj.nForest(5);
    }
}

