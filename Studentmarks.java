import java.util.*;
public class Studentmarks {
    void arrange(int arr[]){
        for(int i=0;i<9;i++){
            for(int j=i+1;j<10;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        
    }
    merit(arr);
}
    void merit(int arr[]){
        for(int i=0;i<10;i++){
            if (arr[i]>=40 && arr[i]<=50){
            System.out.println("Pass" + arr[i]);
            }
            else if(arr[i]>50 && arr[i]<=75){
            System.out.println("Merit" + arr[i]);
            }
            else if(arr[i]>75){
                System.out.println("Distinction" + arr[i]);
            }
            else{
                System.out.println("Fail" + arr[i]);
            }

        }
        

    }
    public static void main(String args[]){
        int arr[]=new int[10];
        System.out.println("Enter the marks of 10 students");
        
        
        for (int i=0;i<10;i++){
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextInt();
        }
        Studentmarks a1=new Studentmarks();
        
        a1.arrange(arr);
    }
    
}
