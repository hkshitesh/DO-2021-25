import java.util.Scanner;
import java.util.Arrays;
public class Grades {
	float marks[];
	String grade[];
	String stu[];
	Scanner sc;
	
	public void get_data() {
		for(int i=0;i<10;i++) {
			System.out.println("Enter name");
			stu[i]=sc.next();
			System.out.println("Enter marks");
			marks[i]=Float.parseFloat(sc.next());
		}
		set_grades();

}

	private void set_grades() {
		Arrays.sort(marks);
		for(int i=0;i<10;i++) {
			if(marks[i]>=40 && marks[i]<=50)
				grade[i]="PASS";
			else if(marks[i]>=51 && marks[i]<=75)
				grade[i]="MERIT";

			else if(marks[i]>=76)
				grade[i]="DISTINCTION";
			else
				grade[i]="FAIL";
		}
}
					
	public void display() {
		System.out.println("Name\t\t\tMarks\t\t\tGrades");
				
		for(int i=0;i<10;i++) {
			System.out.println(stu[i]+"\t\t\t"+marks[i]+"\t\t\t"+grade[i]);
		}
}
	public Grades(){
		marks=new float[10];
		grade=new String[10];
		stu=new String[10];
		sc = new Scanner(System.in);
}

}
