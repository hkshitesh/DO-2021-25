import java.util.Scanner;
class Net_salary{
    String name,js;
    int bs,hra,da,ta,speal,it,gs;
    int netsalary;

    void name_input(){
        System.out.println("Enter your name:");
        Scanner i=new Scanner(System.in);
        name=i.nextLine();
    }
    void bs_input(){
        System.out.println("Enter your basic salary:");
        Scanner i = new Scanner(System.in);
        bs=i.nextInt();
    }
    void js_input(){
        System.out.println("Enter either :permanent: or :probation:");
        Scanner i = new Scanner(System.in);
        js=i.nextLine();
    }
    void hra_input(){
        hra= (int) (0.1*bs);
    }
    void da_input(){
        da= (int) (0.5*bs);
    }
    void ta_input(){
        //System.out.println("Enter your Travelling Allowance:");
        //Scanner i = new Scanner(System.in);
        ta= (int) (0.05*bs);
    }
    void speal_input(){
        System.out.println("Enter your special allowance less than 10,000:");
        Scanner i = new Scanner(System.in);
        speal=i.nextInt();
    }
    int it(){
        if(gs>100000){
            return (int) (0.3*gs);
        } else if (gs>50000 && gs<100000) {
            return (int) (0.1*gs);
        }
        else {
            return 0;
        }
    }
    int gs(){
        if(js.equals("permanent"))
        {
            return gs=bs+hra+da+ta+speal;
        }
        else{
            return gs=bs+ta;
        }

    }
    int nsalary(){
        return (int) (gs-it-(0.12)*(gs));
    }


}
public class salary {
    public static void main(String[] args) {
        Net_salary a=new Net_salary();
        a.name_input();
        a.bs_input();
        a.js_input();
        a.hra_input();
        a.da_input();
        a.ta_input();
        a.speal_input();
        a.it();
        a.gs();
        System.out.println("The net salary of a.name is "+ a.nsalary());

    }
}
