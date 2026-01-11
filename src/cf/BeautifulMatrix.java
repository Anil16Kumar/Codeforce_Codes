package cf;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] mat=new int[5][5];
        int row=0, col=0;
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++){
                mat[i][j]=scanner.nextInt();
                if(mat[i][j]==1){
                    row=i;
                    col=j;
                }
            }
        System.out.println(Math.abs(2-row)+Math.abs(2-col));
    }
}
