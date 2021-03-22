import java.util.*;
class user{
	private String FirstName = null;
	private String LastName = null;
	private int Age = 0;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName=firstName;
	}
	public String getLastName() {
		return FirstName;
	}
	public void setLastName(String lastName) {
		LastName=lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}

public class test {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	user k = new user();
	System.out.print("Enter First Name : ");
	k.setFirstName(s.nextLine());
	System.out.print("Enter Last Name");
	k.setLastName(s.nextLine());
	System.out.print("Enter user's Age");
	k.setAge(s.nextInt());
	System.out.println("Information of Existing User");
	System.out.println("First Name"+"\t"+"Last Name"+"\t"+"Age");
	System.out.println(k.getFirstName()+"\t"+k.getLastName()+"\t"+k.getAge());
	}

}