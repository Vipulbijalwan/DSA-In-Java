class Patten15 {
    public static void nForest(int n) {
char ch = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = (n-1)-i; j >=0 ; j--) {
                {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= i; j++) {

                System.out.print( (char)('A'+j-1));
                ch=(char) ('A'+j-1);
            }
            for (int j = 1; j <i ; j++) {
                System.out.print((char) (ch-j));
            }
            System.out.println();
        }
    }
}
class Test15 {
    public static void main(String[] args) {
        Patten15 obj=new Patten15();
        obj.nForest(5);
    }
}

