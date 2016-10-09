
abstract class Student{
	int Sregid; 
	int Srollno; 
	String Sname;
	Student(int regid, int rollno, String name){
		Sregid=regid; 
		Srollno=rollno; 
		Sname=name;
	}	
}
class Subject extends Student{	
	Subject(int regid, int rollno, String name) {
		super(regid, rollno, name);		
	}
	int mrk1,mrk2,mrk3,tot;
	String std;
	float avg;
	
	void Subject1(String s,int a,int b,int c){
		mrk1=a;
		mrk2=b;
		mrk3=c;
		std=s;
		tot=a+b+c;
	}	
	public float avg(int a, int b, int c){
		avg=(a+b+c)/3;		
		return avg;		
	}
	public void Display(){
		System.out.println("Student Result");
		System.out.println("Name\t\t:\t"+Sname);
		System.out.println("Roll No.\t:\t"+Srollno);
		System.out.println("Register Id.\t:\t"+Sregid);
		System.out.println("Standard\t:\t"+std);		
		System.out.println("\nMarks in Subject");
		System.out.println("Subject 1\t:\t"+mrk1);		
		System.out.println("Subject 2\t:\t"+mrk2);
		System.out.println("Subject 3\t:\t"+mrk3);		
		System.out.println("Total\t\t:\t"+tot);
		System.out.println("Percentage\t:\t"+avg(mrk1,mrk2,mrk3)+"%\n\n");
	}
	
}

public class studResult{
	public static void main(String args[]){
		Subject St;
		St = new Subject(151,5,"Lokesh");	
		St.Subject1("VII", 65, 54, 72);
		St.Display();
		St = new Subject(161,6,"Vivek");
		St.Subject1("VII", 86, 71, 52);
		St.Display();
	}
}