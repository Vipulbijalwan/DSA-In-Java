public class Patten10 {
        public static void nForest(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");

                }
                System.out.println();

            }
            for (int i = 1; i < n; i++) {
                for (int j = (n-1)-i; j >= 0; j--) {
                    System.out.print("*");

                }
                System.out.println();

            }
        }
        }
        class Test10
        {
            public static void main(String[] args) {
                Patten10 obj=new Patten10();
                obj.nForest(3);
            }
        }