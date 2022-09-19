interface test
{
    public void square(int a);
}
class Arithmetic implements test{
    public void square(int b)
    {
        int result;
        result=b*b;
        System.out.println("Square is:"+result);
    }
}
public class ToTestInt
{
    public static void main(String args[])
    {
    Arithmetic s1=new Arithmetic();
    s1.square(10);
    }
}
       
    
