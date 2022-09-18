import java.util.*;
public class Matrix_transpose {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int m= sc.nextInt();
        System.out.print("Enter the columns: ");
        int n= sc.nextInt();

        int matrix[][]=new int[m][n];
        System.out.println("Enter the elements:");
        for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }   
        System.out.println("original Matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }         
    }
}
