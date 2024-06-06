package Week6.TwoDimensionalArray;
// Write a java program to Multiply two 2x3 matrices
public class Q4 {
    public static void main(String[] args) {
        int first[][]=new int [2][3];

        first[0][0] = 1;
        first[0][1] = 2;
        first[0][2] = 3;
        first[1][0] = 4;
        first[1][1] = 5;
        first[1][2] = 6;

        int second[][]=new int [2][3];

        second[0][0] = 1;
        second[0][1] = 2;
        second[0][2] = 3;
        second[1][0] = 4;
        second[1][1] = 5;
        second[1][2] = 6;


        int mul[][]=new int[2][3];
        for (int i = 0; i <2; i++){
            for(int j=0;j<3;j++){
                mul[i][j]=first[i][j]*second[i][j];
            }
        }
        for (int i = 0; i <2; i++){
            for(int j=0;j<3;j++){
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
