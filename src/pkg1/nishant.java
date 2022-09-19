public class ap {
    void summation(int a, int d, int n){
    
        int sum=(n*(2*a+(n-1)*d))/2;
        System.out.println(sum);
    }
    
    
    
        public static void main(String [] args){
            int a=45;
            int n=41;
            int d=5;
            ap a1=new ap();
            a1.summation(a,d,n);
        }
    }
    