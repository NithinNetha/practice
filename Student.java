class Student
{
	int rno;
	String name;
	static String college = "MGT";
	static void change(){
		college="MGIT";
	}
	Student(int r, String n){
		rno=r;
		name=n;
	}
	void display(){System.out.print(rno+" "+name+" "+college);}
	public static void main(String[] args)
	{
		Student.change();
		Student S1=new Student(111,"Paul");
		Student S2=new Student(222,"John");
		Student S3=new Student(333,"Nith");
		S1.display();
		S2.display();
		S3.display();
	}
}	