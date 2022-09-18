package Harshit_500095944;
class Main
{
    public static void main(String args[])
    {
        Compare_prestring obj=new Compare_prestring();
        obj.input();
        String s=obj.search();
        if(s.length()>0)
            System.out.println("Prefix sub-string common in all strings is -> "+s);
        else 
            System.out.println("Prefix sub-string for all strings are different,");    
    }
}