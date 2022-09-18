import java.util.*;

public class salary {

    

    float HRA, DA, TA, SA, IT, net_salary, pf, gs;

    void permanent(float BS) {
        HRA = BS * 10 / 100;
        DA = BS * 50 / 100;
        TA = BS * 5 / 100;
        SA = 100;
        float gs = BS + HRA + DA + TA + SA;
        System.out.println("the gross salary of the person is :" + gs);
        float pf = gs * 12 / 100;

        float ans = incometax(gs);
        float net_salary = gs - ans - pf;

        System.out.println("the net salary of a is: " + net_salary);

    }

    float incometax(float gs) {
        // IT = 0;
        if (gs > 100000) {
            IT = gs * 30 / 100;
        } else if (gs > 50000) {
            IT = gs * 12 / 100;
        } else {
            IT = 0;
        }
        return IT;
    }

    void probation(float BS) {
        TA = BS * 10 / 100;
        float gs = BS + TA;
        System.out.println("the gross salary of the person is :" + gs);
        float pf = gs * 12 / 100;
        float ans = incometax(gs);
        float net_salary = gs - ans - pf;
        System.out.println("the net salary of the person is:" + net_salary);
    }

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("enter the name of employee :");
        String name = s1.nextLine();

        System.out.println("Enter the basic salary of the employee:");
        float BS = s1.nextFloat();

        System.out.println("enter the job status for PERMANENT enter 1 and for PROBATION enter 2:");
        int a = s1.nextInt();

        salary a1 = new salary();
       

        if (a == 1) {
            a1.permanent(BS);

        }

        else {
            a1.probation(BS);
        }
        s1.close();
    }
}
