package admin;

import java.util.Scanner;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Please type 1 or 2\n1 for Admin Login\n2 for Customer Login");
		homemenu();
		
	}
	public static void homemenu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please type 1 or 2\n1 for Admin Login\n2 for Customer Login");
		int num=sc.nextInt();
		if(num==1) {
			new AdminPage();
		}
		else {
			new CustomerHomePage();
		}
	}

}
