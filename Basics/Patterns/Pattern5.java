package Basics.Patterns;

/*
     *****
     ****
     ***
     **
     *
 */


public class Pattern5 {

    static void pattern5(int n){
        for (int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern5(n);
    }
}
