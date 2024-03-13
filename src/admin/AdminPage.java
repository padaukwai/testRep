package admin;

import java.util.Scanner;

public class AdminPage {
	OnlineStoreFunction onlinestoreobj=new OnlineStoreFunction();
	public AdminPage(){
		adminMenu();
	}
	
public void adminMenu() {
	Scanner sc=new Scanner(System.in);
	int choose;
	while(true) {
		System.out.println("Please choose function\n1 for addItem\n2 for viewitemlist\n"
				+ "3 for viewcustomer list\n4 for view report\n 5 for exit");
		onlinestoreobj=new OnlineStoreFunction();
		choose=sc.nextInt();
		if(choose==1)
			onlinestoreobj.addItem();
		else if(choose==2)
			onlinestoreobj.displayItem();
		else if(choose==5) {
			HomePage.homemenu();
			break;
		}
	}
	
	
		
		
	
}

}
