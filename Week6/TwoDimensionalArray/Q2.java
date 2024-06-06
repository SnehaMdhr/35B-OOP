package Week6.TwoDimensionalArray;
//Write a java program to print transpose 2X2 matrices
public class Q2 {
    public static void main(String[] args) {
        int arra[][]=new int [2][2];

        arra[0][0] = 1;
        arra[0][1] = 2;
        arra[1][0] = 3;
        arra[1][1] = 4;

        int trans[][]=new int[2][2];
        for (int i = 0; i <2; i++){
            for(int j=0;j<2;j++){
                trans[i][j]=arra[j][i];
            }
        }
        for (int i = 0; i <2; i++){
            for(int j=0;j<2;j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
