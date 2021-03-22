import java.util.Scanner;

public class calc {

			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int ch=0; 
		float x=0,y=0;
		do {
			System.out.println(" 1.Addition \n 2. Substraction\n 3.Multiplication \n 4.Division");
			System.out.println(" 5.Exit \nEnter your choice: ");
			ch=s.nextInt();
		switch(ch) {
		case 1:
			System.out.print("Enter First number: ");
			x=s.nextFloat();
			System.out.print("Enter Second number: ");
			y=s.nextFloat();
			System.out.println(add(x,y));
			break;
		case 2:
			System.out.print("Enter First number: ");
			x=s.nextFloat();
			System.out.print("Enter Second number: ");
			y=s.nextFloat();
			sub(x,y);
			break;
		}
		}while (ch==5);
	}
	static float add(float a, float b) {
		return a+b;
	}
	static float sub(float a, float b) {
		return a-b;
	}
}
