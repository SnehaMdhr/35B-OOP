package Week6.TwoDimensionalArray;
//Write a java program to print mirror 2X2 matrices
public class Q3 {
    public static void main(String[] args) {
        int arra[][]=new int [2][2];

        arra[0][0] = 1;
        arra[0][1] = 2;
        arra[1][0] = 3;
        arra[1][1] = 4;

        int mino[][]=new int[2][2];
        for (int i = 0; i <2; i++){
            for(int j=0;j<2;j++){
                mino[i][j]=arra[i][1-j];
            }
        }
        for (int i = 0; i <2; i++){
            for(int j=0;j<2;j++){
                System.out.print(mino[i][j] + " ");
            }
            System.out.println();
        }
    }
}
