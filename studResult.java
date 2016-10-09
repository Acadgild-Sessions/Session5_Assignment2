import java.io.*;

abstract interface Subject{	
	abstract float avg(int a, int b, int c);
	abstract void result();
}
class Student implements Subject{
	int mrk1,mrk2,mrk3,tot;
	String name, std;
	float avg;
	
	public Student(String n,String s,int a,int b,int c){
		mrk1=a;
		mrk2=b;
		mrk3=c;
		name=n;
		std=s;
		tot=a+b+c;
	}	
	public float avg(int a, int b, int c){
		avg=(a+b+c)/3;		
		return avg;		
	}
	public void result(){
		System.out.println("Student Result");
		System.out.println("Name\t\t:\t"+name);
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
	public static void main(String args[]) throws IOException{
		Student St;
		St = new Student("Vivek", "VII", 65, 54, 72);	
		St.result();
		St = new Student("Lokesh", "VII", 86, 71, 52);
		St.result();
	}
}