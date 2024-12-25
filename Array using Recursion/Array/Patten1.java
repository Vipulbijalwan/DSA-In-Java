//* * * * *
//* * * *
//* * *
//* *
//*

public class Patten1 {
    public static void main(String[] args) {
        int row=5;
        int coloum=1;
   patten(row,coloum);
patten2(row,coloum);
    }
    static void patten(int row,int coloum){
        if(row==0 ){
            return;
        }
        if(coloum<=row){
            System.out.print("*");
            patten(row,coloum+1);
        }else {
            System.out.println();
        patten(row-1, 1);
    }}
    static void patten2(int row,int coloum){
        if(row==0 ){
            return;
        }
        if(coloum<row){
            patten2(row,coloum+1);
            System.out.print("*");
        }else {

            patten2(row-1, 1);
            System.out.println();
        }}
}
