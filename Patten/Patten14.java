class Patten14 {
    public static void nForest(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = (n*2)-2*i ; k > 0; k--) {

                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
class Test14 {
    public static void main(String[] args) {
        Patten14 obj=new Patten14();
        obj.nForest(5);
    }
}

