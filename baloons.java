import java.util.Scanner;

public class baloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int finalCost1,finalCost2;
		//int secondProblem;
	System.out.println("Enter no. of test cases: ");
        int T=scanner.nextInt();
        if (T<=1 || T>10){
            System.exit(0);
        }

        else {
            for (int i=0; i<T; i++){
				System.out.print("Enter cost of Green Baloon: ");   
				int costOfGreen=scanner.nextInt();
				System.out.print("Enter cost of Purple Baloon: ");
                int costOfPurple=scanner.nextInt();
				System.out.print("No. of Participants ");
                int numberOfParticipants=scanner.nextInt();

                scanner.nextLine();
                if (numberOfParticipants<=1 || numberOfParticipants>10){
                    System.exit(0);
                }
                else {
                    finalCost1=0;
					finalCost2=0;
					for (int j=0;j<numberOfParticipants;j++) {
                        int firstProblem = scanner.nextInt();
						int secondProblem = scanner.nextInt();
                        scanner.nextLine();
                        finalCost1+=(firstProblem*costOfGreen)+(secondProblem*costOfPurple);
						finalCost2+=(firstProblem*costOfPurple)+(secondProblem*costOfGreen);
						
                    }
                    if (finalCost1<finalCost2)
						System.out.println(finalCost1);
						else
						System.out.println(finalCost2);

                }





            }

        }

    }
}