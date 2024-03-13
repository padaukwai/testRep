package admin;

import java.util.Scanner;

public class CustomerHomePage {
	OnlineStoreFunction onlinestoreobj=new OnlineStoreFunction();
	CustomerHomePage(){
		customerMenu();
	}
	public void customerMenu()
	{
		Scanner sc=new Scanner(System.in);
		int choosenum;
		do {
			System.out.println("1 for view item\n2for buy item\n3 for exit");
			choosenum=sc.nextInt();
			if(choosenum==1)
			{
				onlinestoreobj.displayItem();
			}
			else if(choosenum==2)
			{
				
			}
			else if(choosenum==3)
				HomePage.homemenu();	
		}while(choosenum!=3);
		
			
	}

}
