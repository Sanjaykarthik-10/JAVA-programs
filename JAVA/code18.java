import java.util.Scanner;
public class code18 {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=var.nextInt();
        int col=var.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("Enter element for row %d and column %d:\n",i+1,j+1);
                arr[i][j]=var.nextInt();
            }
        }
        //MATRIX
        System.out.println("The matrix is:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.err.println();
        }       

    }
    
}
