
import java.util.Arrays;
import java.util.Scanner;

    //Write a java program to Add two 2x3 matrices




class addArray{
    public static void main(String[] args) {
        int[][] one = {{1,2,3},{4,5,6}};
        int[][] two = {{6,7,8},{9,1,2}};
        System.out.println(Arrays.deepToString(add(one,two)));

    }
    static int[][] add(int[][] arr1, int[][] arr2){
        int[][] sum = new int[2][3];
        for(int i=0; i<2;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return sum;
    }
}

    //Write a java program to Multiply two 2x3 matrices

class MultiArray{
    public static void main(String[] args) {
        int[][] one = {{1,2,3},{4,5,6}};
        int[][] two = {{6,7,8},{9,1,2}};
        System.out.println(Arrays.deepToString(multiply(one,two)));

    }
    static int[][] multiply(int[][] arr1, int[][] arr2){
        int[][] multi = new int[2][3];
        for(int i=0; i<2;i++){
            for(int j=0;j<3;j++){
                multi[i][j]=arr1[i][j]*arr2[i][j];
            }
        }
        return multi;
    }
}


//create 2*3 string array and add value to it

class Create{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[][] array = new int[2][3];
        for (int i =0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print("Enter the value: ");
                array[i][j]=scanner.nextInt();
            }
        }
    }
}


