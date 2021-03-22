import java.util.Scanner;
public class index{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int flag=0;
		System.out.print("Enter no. of elements: ");
		int N =s.nextInt();
		int A[]=new int[N];
		int B[]=new int[N];
		System.out.print("Enter elements in array:");
		for(int i=0;i<N;i++)
			A[i]=s.nextInt();
		s.nextLine();
		
	}
}