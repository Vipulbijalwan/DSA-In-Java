class Patten11 {
    public static void nForest(int n) {
        int count=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
count++;
            }
            System.out.println();

        }
    }

}
class Test11 {
    public static void main(String[] args) {
        Patten11 obj=new Patten11();
        obj.nForest(5);
    }
}

