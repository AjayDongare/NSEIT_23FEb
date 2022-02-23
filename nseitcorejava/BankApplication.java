package nseitcorejava;

import java.util.Scanner;

class BankDetails

{
	  int accno;  
	  String name;  
	  String acc_type;  
	  Scanner sc = new Scanner(System.in);  
	
    public void openAccount()
	{
        System.out.print("Enter Account No: ");  
       int accno = sc.nextInt();
        System.out.print("Enter Account type: ");  
       String acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        String name = sc.next();  	
	}
	
    
    public void showAccount()
	{
		System.out.println("Name is: "+name);  
        System.out.println("Account no :"+accno);  
        System.out.println("Account type: "+acc_type);  
	}
	
}
interface BankDetail

{
	public void openAccount();
	public void showAccount();
	
}
class Bank implements BankDetail
{
	
	public void openAccount()
	{
		Scanner sc = new Scanner(System.in);
		   System.out.print("Enter Account No: ");  
	        int accno = sc.nextInt();
	        System.out.print("Enter Account type: ");  
	        String acc_type = sc.next();  
	        System.out.print("Enter Name: ");  
	        String name = sc.next();  	

	}
	
	
	public void showAccount()
	{
		String name = "Ajay";
		System.out.println("Name is: "+name);  
        int accno =123 ;
		System.out.println("Account no :"+accno);  
        String acc_type = "Saving";
		System.out.println("Account type: "+acc_type);
	}

}

public class BankApplication 
{
	public static void main(String[] args)
	{
		Bank b1=new Bank();
		b1.openAccount();
		b1.showAccount();
		
	
	}
}
