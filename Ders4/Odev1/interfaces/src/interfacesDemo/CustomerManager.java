package interfacesDemo;

public class CustomerManager {
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal icustomerDal) {
		super();
		this.customerDal = icustomerDal;
	}

	public void add() {
		customerDal.add();
	}
}
