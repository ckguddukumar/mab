package Boi.com;

class Account
{
	String name="Vinayak";
	int Account_no = 234;
	float balance = 10000;
	public void display()
	{
		System.out.println("Name:"+name+ "\n Account no.:"+Account_no+"\n balance");
	}
}
class Loan_account extends Account
{
	int loan_amount=2000;
	float available_balance = balance - loan_amount;
	public void display()
	{
		System.out.println("Available balance: "+available_balance);
	}
	
}
public class Simple_inheritance {

	public static void main(String[] args) {
		Loan_account obj=new Loan_account();
		obj.display();

	}

}
