package Interface;

public class Developing implements BankClient,DomainCleint{
//one class can imlement multiple interfaces
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* to implement fillowing methods we have to create an object of that class*/
		Developing d=new Developing();
		d.payCreditCard();
		d.transferBalnace();
		d.checkBalance();
		d.login();
		
		BankClient dr=new Developing();/**dr is only accss methods of bankclient not developing
		                                 *all depends on return type..here is return type is bankclient
		                                 *thats y dr is able to acss only bankclient methods this is known as
		                                 *"RUN TIME POLYMORPHISM"
		                                */
		 dr.payCreditCard();
		 
		// DomainCleint dc=new DomainCleint();//this throws an error
		 DomainCleint dc=new Developing();
		 dc.investment();

	}

	
	//by default all methods of interface are public
	@Override
	public void payCreditCard() {
    System.out.println("creditcard payed");		
	}

	@Override
	public void transferBalnace() {
		// TODO Auto-generated method stub
		System.out.println("balance is transferd");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("balance is checked");
	}
	
	public void login()
	{
		System.out.println("login");
	}


	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("investment");
	}

}
