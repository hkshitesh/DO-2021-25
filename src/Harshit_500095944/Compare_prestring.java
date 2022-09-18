package Harshit_500095944;
import java.util.Scanner;
public class Compare_prestring
{
    String s[];
    int size=0;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.print("Enter total no of strings -:");
        size=sc.nextInt();
        sc.nextLine();
        s=new String[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter String "+(i+1)+" ->");
            s[i]=sc.nextLine();
        }
        System.out.println();
    }
    String search()
    {
        boolean first=true;
        int len=0;
        String search=new String();
        for(int i=1;i<size;i++)
        {
            boolean flag=false;
            search="";   
            int j=0;
            for(;j<s[i-1].length() && j<s[i].length();j++)
            {
                if(s[i-1].charAt(j)==s[i].charAt(j))
                {
                    search=search+s[i].charAt(j);
                    if(first)
                    {
                        flag=true;
                        len++;
                    }
                    else if(j==len-1) break;
                }
                else 
                    break;
                
            }
            if(flag)
            {
                flag=false;
                first=false;
            }
        }
        return search;
    }
}