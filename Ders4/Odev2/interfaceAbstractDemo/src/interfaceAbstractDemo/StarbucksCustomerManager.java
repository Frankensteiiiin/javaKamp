package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer))
			super.Save(customer);
		else
			System.out.println("yanl�� bilgi giri�i");
	}

}
