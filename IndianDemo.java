package crud;
import java.util.Scanner;

public class IndianDemo {

	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		
		int ch;
		do {
			System.out.println("1. INSERT");
			System.out.println("2. DISPLAY");
			System.out.println("3. SEARCH");
			System.out.println("4. DELETE");
			System.out.println("5. UPDATE");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					emp.insert();
					break;
				case 2:
					emp.display();
					break;
				case 3:
					emp.search();
				break;
				case 4:
					emp.delete();
				break;
				case 5:
					emp.update();
				break;
			}
		} while(ch!=0);
		
		sc.close();
	}
	

}
