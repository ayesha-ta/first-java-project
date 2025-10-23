
import java.util.Scanner;
class if_else {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a num: ");
	        int num = sc.nextInt();

	        if (num % 2 == 0)
	            System.out.println(num + " is Even");
	        else
	            System.out.println(num + " is Odd");

	        sc.close();

	}

}
