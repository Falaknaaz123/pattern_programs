/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
 */

import java.util.Scanner;

class Pattern4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n;i++){
            for ( int j=1; j<=i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}