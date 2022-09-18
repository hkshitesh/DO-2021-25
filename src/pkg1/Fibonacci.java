import java.util.Scanner;

public class Fibonacci {
    public void printFibonacci(){
        int n1=0,n2=1,n3,i,count;
        System.out.println("Enter the number till where you want to print series: ");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        System.out.print(n1+" "+n2);
        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args){
        Fibonacci fb = new Fibonacci();
        fb.printFibonacci();
    }
}

